package com.hxg.TestIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class IOTest03 {

	public static void main(String[] args) {
		File dest = new File("src/d.txt");
		OutputStream os=null;
		try {
			os = new FileOutputStream(dest);
			String msg = "aaaaaaaa";
			byte[] datas = msg.getBytes();
			os.write(datas,0,datas.length);
			os.flush();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(null!=os) {
					os.close();				
				}

			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		

	}

}
