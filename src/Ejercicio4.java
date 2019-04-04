//leer linea a linea el quijote

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ejercicio4 {

	public static void main(String[] args) {
//		InputStream input=Ejercicio4.class.getResourceAsStream("El Quijote (utf-8).txt"); //muestra todo bien
		InputStream input=Ejercicio4.class.getResourceAsStream("El Quijote (windows-1252).txt"); //no muestra las letras con tildes //ejemplo2
//		InputStreamReader isr=new InputStreamReader(input);
		InputStreamReader isr=null; //ejemplo2
//		BufferedReader bf=new BufferedReader(isr);
		BufferedReader bf=null; //ejemplo2
		
		try {
			isr=new InputStreamReader(input, "windows-1252"); //ejemplo2
			bf=new BufferedReader(isr); //ejemplo2
			
			String linea=bf.readLine();
			while(linea!=null) {
				System.out.println(linea);
				linea=bf.readLine();
			}
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				bf.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}

}
