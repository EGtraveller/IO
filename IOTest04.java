package com.hxg.TestIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

public class IOTest04 {
	public static void main(String[] args) {
		//������ϵ
		File src = new File("src/a.txt");
		Reader reader = null;
		//ѡ����
		try {
			reader = new FileReader(src);
			//��ȡ�ļ�
			char[] flush = new char[1024];
			int len = -1;
			while((len=reader.read(flush))!=-1) {
				String str = new String(flush,0,len);
				System.out.println(str);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(null!=reader) {
					reader.close();				
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
