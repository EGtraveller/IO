package com.hxg.TestIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class IOTest02 {
	public static void main(String[] args) {
		File src = new File("src/a.txt");
		InputStream is=null;
		try {
			is = new FileInputStream(src);
			int temp;
			while((temp=is.read())!=-1) {
				System.out.println((char)temp);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
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
