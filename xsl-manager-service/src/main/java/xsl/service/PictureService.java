package xsl.service;

import java.io.IOException;

import org.springframework.web.multipart.MultipartFile;

public interface PictureService {
	
	java.util.Map<String, Object> uploadPicture(MultipartFile uploaFile) throws IOException;

}
