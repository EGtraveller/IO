package com.hxg.TestIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.Writer;

public class IOTest08 {
	public static void main(String[] args) {
		//建立联系
		File dest = new File("src/e.txt");
		Writer writer = null;
		//选择流
		try {
			writer = new FileWriter(dest);
			//写出文件
			String msg = "学习编程，学习java";
			char[] datas = msg.toCharArray();
			int len = -1;
			writer.write(datas,0,datas.length);
			writer.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(null!=writer) {
					writer.close();				
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
