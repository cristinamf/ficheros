
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;


public class EjercicioClase {
	public static void main(String[] args) {
		InputStream input=Ejercicio4.class.getResourceAsStream("El Quijote (utf-8).txt"); //muestra todo bien
		InputStreamReader isr=new InputStreamReader(input);
		BufferedReader bf=new BufferedReader(isr);

		
		try {
			//leer linea a linea y registrar el numero de veces que se repite cada palabra en el quijote sin tener en cuenta mayusculas y minusculas
			//y meter las palabras en un mapa. 
			String linea=bf.readLine();

			while(linea!=null) {
				
				linea=bf.readLine();
			}
			//pedir palabras y mostrar el numero de veces que se repiten. El programa finaliza con la palabra "fin". Tambien se repite el nº veces de "fin".
			
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
