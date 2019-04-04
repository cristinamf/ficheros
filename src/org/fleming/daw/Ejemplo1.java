package org.fleming.daw;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ejemplo1 {

	public static void main(String[] args) {
		DataOutputStream out = null;
		try {
			out = new DataOutputStream(new FileOutputStream("C:\\Users\\Julio\\Desktop\\Programación\\datos"));
			out.writeInt(43291);
			out.writeLong(91234239543213L);
			out.writeBoolean(true);
			out.writeBoolean(false);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (out != null)
				try {
					out.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
	}

}
