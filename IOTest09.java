package com.hxg.TestIO;
/**
 * 创建源
 * 选择流
 * 操作
 * 释放资源（可以不要，放在这里是因为代码风格统一）
 */
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

public class IOTest09 {
	public static void main(String[] args) {
		//建立联系
		byte[] src = "talk is cheap show me the code".getBytes();
		//选择流
		InputStream is = null;
		try {
			is = new ByteArrayInputStream(src);
			//读取文件
			byte[] flush = new byte[1024];
			int len = -1;
			while((len=is.read(flush))!=-1) {
				String str = new String(flush,0,len);
				System.out.println(str);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(null!=is) {
					is.close();				
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
