package com.louis.service;

import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;
import com.louis.config.MYJZConfig;
import com.louis.controller.CSVController;
import com.louis.entity.Csvpartbase;
import com.louis.entity.FileTb;
import com.louis.exception.CustomException;
import com.louis.mapper.CsvpartbaseMapper;
import com.louis.mapper.FileTbMapper;
import com.louis.utilTools.DateUtils;
import com.louis.utilTools.EntityToCharArray;
import com.louis.utilTools.ResourceUtils;
import com.louis.utilTools.UUIDUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.*;

@Service(CSVServiceImpl.SERVICE_NAME)
public class CSVServiceImpl implements CSVService {
	
	private static final Logger log = LoggerFactory.getLogger(CSVController.class);
	
	public static final String SERVICE_NAME = "com.louis.service.CSVServiceImpl";
	
	
	@Autowired
	private CsvpartbaseMapper csvpartbaseMapper;
	
	@Autowired
	private FileTbMapper fileTbMapper;
	
	public FileTb exportIpMac(String filePath) {
		
		List<Csvpartbase> allcsv = csvpartbaseMapper.selectAll();
		FileTb fileTb = null;
		if (!allcsv.isEmpty()) {
			fileTb = new FileTb();
			for (Csvpartbase csv : allcsv) {
				EntityToCharArray entityToCharArray = new EntityToCharArray();
				String[] csvArray = entityToCharArray.entityToArray(csv);
				// 定义一个CSV路径
				try {
					// 创建CSV写对象 例如:CsvWriter(文件路径，分隔符，编码格式);
					String fileid = UUIDUtils.getUUID();
					CsvWriter csvWriter = new CsvWriter(filePath + fileid + ".csv", ',', Charset.forName("UTF-8"));
					// 写表头
					String[] csvHeaders = MYJZConfig.CSV_HEADERS;
					csvWriter.writeRecord(csvHeaders);
					// 写内容
					csvWriter.writeRecord(csvArray);
					csvWriter.close();
					
					fileTb.setRealPath(filePath);
					fileTb.setCreateDate(DateUtils.getDate());
					fileTb.setFileName(fileid);
					fileTb.setFileUrl(ResourceUtils
							.getProperty(MYJZConfig.URL_PATH)
							+ MYJZConfig.FILE_LOCATION + UUIDUtils.getUUID() + ".csv");
					fileTb.setFileType("csv");
				} catch (IOException e) {
					throw new CustomException("导出失败！");
				}
				
			}
		}
		
		return fileTb;
	}
	
	public Map<String, String> importIpMac(String path, MultipartFile[] files) {
		String succcess_count = "0";
		String fail_count = "";
		/**
		 * 遍历索引的文件
		 */
		if (files.length >= 1) {
			for (MultipartFile file : files) {
				if (!file.isEmpty()) {
					String originalName = file.getOriginalFilename();
					int dotPosition = originalName.indexOf(".");
					String fileType = null;
					String filename = null;
					if (dotPosition != -1) {
						fileType = originalName.substring(
								originalName.indexOf(".") + 1, originalName.length());
						filename = UUIDUtils.getUUID() + "." + fileType;
					} else {
						filename = UUIDUtils.getUUID();
					}
					/**
					 * 读取文件内容
					 */
					try {
						// 用来保存数据
						ArrayList<String[]> csvFileList = new ArrayList<>();
						// 定义一个CSV路径
						// 创建CSV读对象 例如:CsvReader(文件路径，分隔符，编码格式);
						CsvReader reader = new CsvReader(path + '/' + file.getOriginalFilename(), ',', Charset.forName("UTF-8"));
						// 跳过表头 如果需要表头的话，这句可以忽略
						reader.readHeaders();
						// 逐行读入除表头的数据
						while (reader.readRecord()) {
							csvFileList.add(reader.getValues());
						}
						reader.close();
						
						Csvpartbase csvpartbase = new Csvpartbase();
						/* 遍历读取的CSV文件 */
						for (int row = 0; row < csvFileList.size(); row++) {
							// 取得第row行第0列的数据
							csvpartbase.setId(csvFileList.get(row)[0]);
							csvpartbase.setMac(csvFileList.get(row)[1]);
							csvpartbase.setIp(csvFileList.get(row)[2]);
							csvpartbase.setUpip(csvFileList.get(row)[3]);
							csvpartbase.setUpname(csvFileList.get(row)[4]);
							csvpartbase.setUpindex(csvFileList.get(row)[5]);
							csvpartbase.setModifytime(csvFileList.get(row)[6]);
							int count = csvpartbaseMapper.insertSelective(csvpartbase);
							if (count == 1) {
								succcess_count = String.valueOf(Integer.parseInt(succcess_count) + count);
							} else {
								if (fail_count.isEmpty()) {
									fail_count = String.valueOf(row);
								} else {
									fail_count = fail_count + "、" + row;
								}
							}
							
						}
						/**
						 * 保存到文件导入表中
						 */
						
						FileTb upLoadFile = new FileTb();
						upLoadFile.setFileId(UUIDUtils.getUUID());
						upLoadFile.setFileName(filename);
						upLoadFile.setFileType(fileType);
						upLoadFile.setFileSize(file.getSize());
						upLoadFile.setCreateDate(new Date());
						upLoadFile.setFileUrl(ResourceUtils
								.getProperty(MYJZConfig.URL_PATH)
								+ MYJZConfig.FILE_LOCATION + filename);
						upLoadFile.setRealPath(MYJZConfig.FILE_LOCATION
								+ filename);
						fileTbMapper.insertSelective(upLoadFile);
					} catch (IOException e) {
						throw new CustomException("导入异常！");
					}
					
				}
				
			}
		}
		Map<String, String> res = new HashMap<>();
		res.put("success", succcess_count);
		res.put("fail", fail_count);
		return res;
	}
	
	
	public static void main(String[] args) {
		List<Csvpartbase> allcsv = new ArrayList<>();
		
		
		for (int i = 0; i < 2; i++) {
			Csvpartbase csvpartbase = new Csvpartbase();
			csvpartbase.setId("" + i);
			csvpartbase.setIp("127.0.0.1");
			csvpartbase.setMac("127.0.0.1");
			csvpartbase.setModifytime("20170920");
			csvpartbase.setUpindex("" + i);
			csvpartbase.setUpname("lw" + i);
			csvpartbase.setUpip("123.0.0.2");
			allcsv.add(csvpartbase);
		}
		for (Csvpartbase csv1 : allcsv) {
			/**
			 * 第一种方法
			 */
			// String[] csvstr = {csv1.getId(),csv1.getMac(),csv1.getIp(),csv1.getIp(),csv1.getUpname(),csv1.getUpindex(),csv1.getModifytime()};
			
			/**
			 * 第二种方法
			 */
//			String[] csvstr = new String[csv1.getClass().getDeclaredFields().length];
//			for (int i = 0; i < csvstr.length; i++) {
//				Field[] f = csv1.getClass().getDeclaredFields();
//				csvstr[i] = f[i].toString();
//			}
//			System.out.println(csvstr);
			
			
			/**
			 * 第三种方法
			 */
			EntityToCharArray entityToCharArray = new EntityToCharArray();
			String[] csvArray = entityToCharArray.entityToArray(csv1);
			System.out.println(csvArray[0]);
		}
	}
}
