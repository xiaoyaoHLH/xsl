package xsl.service.impl;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import xsl.common.utils.FtpUtil;
import xsl.common.utils.IDUtils;
import xsl.service.PictureService;

@Service
public class PictureServiceImpl implements PictureService {

	@Value("${FTP_ADDRESS}")
	private String FTP_ADDRESS;
	@Value("${FTP_PORT}")
	private Integer FTP_PORT;
	@Value("${FTP_USER_NAME}")
	private String FTP_USER_NAME;
	@Value("${FTP_PASSWORD}")
	private String FTP_PASSWORD;
	@Value("${FTP_BASE_PATH}")
	private String FTP_BASE_PATH;
	@Value("${IMAGE_BASE_URL}")
	private String IMAGE_BASE_URL;

	@Override
	public Map<String, Object> uploadPicture(MultipartFile uploaFile){
		Map<String, Object> resultMap = new HashMap<String, Object>();
		try {
			String oldname = uploaFile.getOriginalFilename();
			String newname = IDUtils.genImageName()+oldname.substring(oldname.lastIndexOf("."));
			String imagePath = new DateTime().toString("/yyyy/MM/dd");
			boolean result = FtpUtil.uploadFile(FTP_ADDRESS, FTP_PORT, FTP_USER_NAME, FTP_PASSWORD, FTP_BASE_PATH, imagePath, newname, uploaFile.getInputStream());
			
			if(!result){
				resultMap.put("error", 1);
				resultMap.put("message", "文件上传失败");
				return resultMap;
			}
			
			resultMap.put("error", 0);
			resultMap.put("url", IMAGE_BASE_URL + imagePath + "/" + newname);
			 System.out.println("上传成功");
			return resultMap;
				
		} catch (IOException e) {
			resultMap.put("error", 1);
			resultMap.put("message", "文件上传失败");
			return resultMap;
		}
	}

}
