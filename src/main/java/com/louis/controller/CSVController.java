package com.louis.controller;

import com.louis.config.MYJZConfig;
import com.louis.entity.FileTb;
import com.louis.service.CSVService;
import com.louis.service.CSVServiceImpl;
import com.louis.utilTools.FilePathUtils;
import com.louis.vo.ResponseTemplate;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

@RestController
@RequestMapping(path = MYJZConfig.API + "/csv")
public class CSVController {
	
	@Resource(name = CSVServiceImpl.SERVICE_NAME)
	private CSVService csvServiceimpl;
	
	/**
	 * 导入
	 */
	@ResponseBody
	@RequestMapping(value = "/import", method = RequestMethod.POST)
	public ResponseTemplate importIpMac(HttpServletRequest request,
	                                    @RequestParam(value = "files") MultipartFile[] files) {
		/**
		 * 获取保存路径
		 */
		String savePath = FilePathUtils.buildFilePath(request,
				MYJZConfig.FILE_LOCATION);
		Map<String, String> result = csvServiceimpl.importIpMac(savePath, files);
		
		return new ResponseTemplate(Boolean.TRUE, " 导入成功 " + result.get("success") + " 条; \t  导入失败的行是：" + result.get("fail"));
	}
	
	
	/**
	 * 导出信息到csv表中
	 */
	@ResponseBody
	@RequestMapping("/export")
	public ResponseTemplate exportIpMac(HttpServletRequest request, HttpServletResponse response) {
		String path = FilePathUtils.buildFilePath(request,
				MYJZConfig.FILE_LOCATION);
		FileTb fileTb = csvServiceimpl.exportIpMac(path);
		return new ResponseTemplate(fileTb);
	}
	
	
}
