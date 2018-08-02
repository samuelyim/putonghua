package com.test.pth.datafeed;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileUtility {

	public static String readFile(String filePath) throws IOException {
		File file = new File(filePath);
		byte[] bytes = new byte[(int)file.length()];
		FileInputStream fis = new FileInputStream(file);
		fis.read(bytes);
		fis.close();
		return new String(bytes, "utf8");
	}
	
	public static void writeFile(String filePath, String content) throws IOException {
		FileOutputStream fos = new FileOutputStream(new File(filePath));
		fos.write(content.getBytes());
		fos.close();
	}
	
}
