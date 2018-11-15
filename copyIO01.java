package com.hxg.TestIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class copyIO01 {
	public static void main(String[] args) {
		File src = new File("src/a.txt");  //ѡ��Ҫ�������ļ�
		File dest = new File("src/d.txt");	//�ļ�������Ŀ¼
		InputStream is=null;
		OutputStream os=null;
		try {
			is = new FileInputStream(src);	//ѡ����
			os = new FileOutputStream(dest);
			int len = -1;
			byte[] flush = new byte[1024];	//д�뵽������
			while((len=is.read(flush))!=-1) {	//ѭ����ȡ
				os.write(flush,0,len);		//д��
			}
			os.flush();		//ǿ��ˢ��
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(null!=os) {
					os.close();	
				}
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			try {
				if(is!=null) {
					is.close();
				}

			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
