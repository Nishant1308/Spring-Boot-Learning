package com.nishantspringboot.helper;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class FileUploadHelper {
	public final String upload_dir = "C:\\Users\\USER\\eclipse-workspace\\nishantspringboot\\src\\main\\resources\\static\\image\\";
	
	public boolean uploadFile(MultipartFile file) {
		boolean flag = false;
		try {
			InputStream is= file.getInputStream();
			byte[] data = new byte[is.available()];
			is.read(data);
			
			FileOutputStream fos = new FileOutputStream(upload_dir+File.separator+file.getOriginalFilename());
			fos.write(data);
			fos.flush();
			fos.close();
			
			flag = true;
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return flag;
	}

}
