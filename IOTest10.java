package com.hxg.TestIO;
/**
 * ����Դ
 * ѡ����
 * ����
 * �ͷ���Դ�����Բ�Ҫ��������������Ϊ������ͳһ��
 */
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;

public class IOTest10 {
	public static void main(String[] args) {
		//������ϵ
		byte[] dest = null;
		//ѡ����
		ByteArrayOutputStream bos = null;
		try {
			bos = new ByteArrayOutputStream();
			//��ȡ�ļ�
			String msg = "talk is cheap show me the code";
			byte[] datas = msg.getBytes();
			bos.write(datas,0,datas.length);
			bos.flush();
			//��ȡ����
			dest = bos.toByteArray();
			System.out.println(dest.length +"--->"+ new String(dest,0,bos.size()));
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(null!=bos) {
					bos.close();				
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
