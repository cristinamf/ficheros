package org.fleming.daw;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ejemplo2 {

	public static void main(String[] args) {
		DataInputStream in = null;
		try {
			in = new DataInputStream(new FileInputStream("C:\\Users\\Julio\\Desktop\\Programación\\datos"));
			int i = in.readInt();
			long l = in.readLong();
			boolean b1 = in.readBoolean();
			boolean b2 = in.readBoolean();
			System.out.println(i);
			System.out.println(l);
			System.out.println(b1);
			System.out.println(b2);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (in != null)
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}

	}

}
