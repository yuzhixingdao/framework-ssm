package com.aac.framework.common.util.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

import org.junit.Test;

public class TestStreamUtil {
	
	
	@Test
	public void testCompress() {
		try {
			InputStream is = new FileInputStream("D:\\workspace\\test\\image\\ccc.jpg");
			OutputStream os = new FileOutputStream("D:\\workspace\\test\\image\\ccc_back.jpg");
			
			StreamUtil.compress(is, os);
			
			System.out.println(new File("D:\\workspace\\test\\image\\ccc.jpg").length());
			System.out.println(new File("D:\\workspace\\test\\image\\ccc_back.jpg").length());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	@Test
	public void testDecompress() {
		try {
			InputStream is = new FileInputStream("D:\\workspace\\test\\image\\ccc_back.jpg");
			OutputStream os = new FileOutputStream("D:\\workspace\\test\\image\\ccc_back_back.jpg");
			
			StreamUtil.decompress(is, os);
			
			System.out.println(new File("D:\\workspace\\test\\image\\ccc_back.jpg").length());
			System.out.println(new File("D:\\workspace\\test\\image\\ccc_back_back.jpg").length());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
