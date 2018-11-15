package com.hxg.TestIO;
/**
 * 创建源
 * 选择流
 * 操作
 * 释放资源（可以不要，放在这里是因为代码风格统一）
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
		//建立联系
		byte[] dest = null;
		//选择流
		ByteArrayOutputStream bos = null;
		try {
			bos = new ByteArrayOutputStream();
			//读取文件
			String msg = "talk is cheap show me the code";
			byte[] datas = msg.getBytes();
			bos.write(datas,0,datas.length);
			bos.flush();
			//获取数据
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
