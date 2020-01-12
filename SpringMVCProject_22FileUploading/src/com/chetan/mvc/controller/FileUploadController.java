package com.chetan.mvc.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import com.chetan.mvc.commons.FileUploadForm;

@Controller
public class FileUploadController {
	
	@RequestMapping(value="/home.htm", method = RequestMethod.GET)
	public String displayForm(){
		return "file_upload_form";
	}
	
	@RequestMapping(value="/save.htm", method = RequestMethod.POST)
	public String save(@ModelAttribute("uploadForm")FileUploadForm uploadForm, Model map){
		
		File dir = new File("F:/Chetan/Java/uploadFiles");
		
		MultipartFile file = uploadForm.getFile();
		String fileName ="";
		
		if(file!= null){
			fileName = file.getOriginalFilename();
			InputStream inputStream = null;
			OutputStream outputStream;
			try{
				inputStream = file.getInputStream();
				if(!dir.exists()){
					dir.mkdir();
				}
				File newFile = new File("F:/Chetan/Java/uploadFiles/"+fileName);
				
				outputStream = new FileOutputStream(newFile);
				int read = 0;
				byte[] bytes = new byte[1024];
				while((read = inputStream.read(bytes))!=-1){
					outputStream.write(bytes, 0, read);
				}
				outputStream.close();
				inputStream.close();
				
			}catch(IOException e){
				System.out.println("Exception" +e);
			}
		}
		map.addAttribute("file",fileName);
		return "file_upload_success";
	}

}
