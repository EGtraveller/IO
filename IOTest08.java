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
		//������ϵ
		File dest = new File("src/e.txt");
		Writer writer = null;
		//ѡ����
		try {
			writer = new FileWriter(dest);
			//д���ļ�
			String msg = "ѧϰ��̣�ѧϰjava";
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
