package com.hxg.TestIO;
/**
 * ����Դ
 * ѡ����
 * ����
 * �ͷ���Դ�����Բ�Ҫ��������������Ϊ������ͳһ��
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
		//������ϵ
		byte[] src = "talk is cheap show me the code".getBytes();
		//ѡ����
		InputStream is = null;
		try {
			is = new ByteArrayInputStream(src);
			//��ȡ�ļ�
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
