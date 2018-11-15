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
		File src = new File("src/a.txt");  //选择要拷贝的文件
		File dest = new File("src/d.txt");	//文件拷贝的目录
		InputStream is=null;
		OutputStream os=null;
		try {
			is = new FileInputStream(src);	//选择流
			os = new FileOutputStream(dest);
			int len = -1;
			byte[] flush = new byte[1024];	//写入到数组中
			while((len=is.read(flush))!=-1) {	//循环读取
				os.write(flush,0,len);		//写出
			}
			os.flush();		//强制刷新
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
