package com.chetan.mvc.controller;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FileDownloadController {

	@RequestMapping(value="/home.htm",method = RequestMethod.GET)
	public String displayForm(){
		return "file_download_form";
	}
	
	@RequestMapping(value ="/download.htm",method = RequestMethod.GET)
	public void download(@RequestParam("file_name")String fileName,HttpServletResponse response){
		InputStream input =null;
		try{
			System.out.println("Requestes File"+fileName+"response= "+response);
			String filePath ="F:/Chetan"+fileName;
			
			input = new FileInputStream(filePath);
			response.setContentType("application/pdf");
			response.setHeader("Content-Disposition","attachment; filename = "+fileName);
			IOUtils.copy(input, response.getOutputStream());
			response.flushBuffer();
			}catch(IOException e){
				throw new RuntimeException("IOError writing file to output stream");
			}
	}
}
