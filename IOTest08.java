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
			/*写法一
			String msg = "学习编程，学习java";
			char[] datas = msg.toCharArray();
			int len = -1;
			writer.write(datas,0,datas.length);
			*/
			/*写法二
			String msg = "学习编程，学习java,好好加油";
			writer.write(msg);
			*/
			/*append 追加，写法三
			writer.append("要每天学习").append("坚持不懈的学习");
			*/
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
