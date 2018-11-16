package com.hxg.TestIO;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/**
 * DataInputStream �� DataOutputStream
 * @author ���ι�
 *
 */

public class IOTest11 {

	public static void main(String[] args) throws IOException {
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		DataOutputStream dos = new DataOutputStream(bos);
		dos.writeUTF("������");
		dos.writeInt(22);
		dos.writeChar('a');
		dos.flush();
		byte[] datas = bos.toByteArray();
		
		DataInputStream dis = new DataInputStream(new ByteArrayInputStream(datas));
		String msg = dis.readUTF();
		int age = dis.readInt();
		char ch = dis.readChar();
		System.out.println(msg);
		
	}

}
