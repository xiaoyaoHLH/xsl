package xsl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import xsl.common.pojo.PictureResult;
import xsl.service.PictureService;

@Controller
public class PictrueController {
	@Autowired
	private PictureService pictureService;
	
	@RequestMapping("/pic/upload")
	@ResponseBody
	public PictureResult upload() {
		return null;

	}

}
