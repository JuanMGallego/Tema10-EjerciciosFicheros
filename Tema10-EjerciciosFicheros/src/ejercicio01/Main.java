package ejercicio01;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	
	public static void main(String[] args) {
		
		double num = 0;
		String linea = "";
		String[] listaNumeros;
		double suma = 0;
		double media = 0;
		
		try {
			
			BufferedReader in = new BufferedReader(new FileReader("src\\ejercicio01\\NumerosReales.txt"));
			linea = in.readLine();
			
			listaNumeros = linea.split(" ");
			
			for (String numero : listaNumeros) {
				
				num = Double.parseDouble(numero);
				
				suma += num;
				
			}
			
			media = suma / listaNumeros.length;
			
			System.out.println("Suma: " + suma);
			System.out.println("Media: " + media);
			
			in.close();
			
		} catch (FileNotFoundException e){
			
			System.out.println("El archivo no se ha encontrado");
			
		} catch (IOException e) {
			
			System.out.println("No se ha podido leer el fichero");
			
		}
		
	}

}
