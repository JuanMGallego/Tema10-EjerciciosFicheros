package ejercicio02;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int num = 0;
		int cont = 0;
		int suma = 0;
		double media = 0;
		
		try {
			
			Scanner sc = new Scanner(new FileReader("src\\ejercicio02\\Enteros.txt"));
			
			while (sc.hasNextInt()) {
				
				num = sc.nextInt();
				
				suma += num;
				
				cont++;
				
			}
			
			media = suma / cont;
			
			System.out.println("Suma: " + suma);
			System.out.println("Media: " + media);
			
			sc.close();
			
		} catch (FileNotFoundException e){
			
			System.out.println("El archivo no se ha encontrado");
			
		}
		
	}
	
}
