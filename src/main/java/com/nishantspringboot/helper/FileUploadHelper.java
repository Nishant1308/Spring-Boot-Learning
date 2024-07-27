package com.nishantspringboot.helper;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class FileUploadHelper {

	// static file path
	// public final String upload_dir =
	// "C:\\Users\\USER\\eclipse-workspace\\nishantspringboot\\src\\main\\resources\\static\\image\\";

	// dynamic file path
	public final String upload_dir = new ClassPathResource("static/image/").getFile().getAbsolutePath();

	public FileUploadHelper() throws IOException {

	}

	public boolean uploadFile(MultipartFile file) {
		boolean flag = false;
		try {
			InputStream is = file.getInputStream();
			byte[] data = new byte[is.available()];
			is.read(data);

			FileOutputStream fos = new FileOutputStream(upload_dir + File.separator + file.getOriginalFilename());
			fos.write(data);
			fos.flush();
			fos.close();

			flag = true;

		} catch (Exception e) {
			e.printStackTrace();
		}

		return flag;
	}

}