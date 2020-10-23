package system.util;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//网易云音乐缓存uc格式转mp3
public class ChangeUC {
	public static void main(String[] args) {
		DataInputStream dis = null;
		DataOutputStream dos = null;
		try {
			File inFile = new File("D:/1.uc");
			File outFile = new File("D:/1.mp3");

			dis = new DataInputStream(new FileInputStream(inFile));
			dos = new DataOutputStream(new FileOutputStream(outFile));
			byte[] b = new byte[1024];
			int len;
			while ((len = dis.read(b)) != -1) {
				for (int i = 0; i < len; i++) {
					b[i] ^= 0xa3;
				}
				dos.write(b, 0, len);
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (dos != null) {
				try {
					dos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (dis != null) {
				try {
					dis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
