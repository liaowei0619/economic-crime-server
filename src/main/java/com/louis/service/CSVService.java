package com.louis.service;

import com.louis.entity.FileTb;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;

public interface CSVService {
	
	/**
	 * CSV文件導入
	 *
	 * @param filePath
	 * @return
	 */
	Map<String,String> importIpMac(String filePath, MultipartFile[] files);
	
	/**
	 * CSV文件导出
	 *
	 * @param path
	 * @return
	 */
	FileTb exportIpMac(String path);
}
