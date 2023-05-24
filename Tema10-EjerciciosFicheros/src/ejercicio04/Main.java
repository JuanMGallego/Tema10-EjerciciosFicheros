package ejercicio04;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		String linea = "";
		
		try {
			
			BufferedWriter in = new BufferedWriter(new FileWriter("src\\ejercicio04\\Lineas.txt"));
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Introduzca una linea de texto (Escriba 'fin' para terminar): ");
        	linea = sc.nextLine();
        	System.out.println();
	        
	        while (!linea.equalsIgnoreCase("fin")) {
	        	
	        	in.write(linea);
	        	in.newLine();
	        	
	        	System.out.print("Introduzca otra linea de texto (Escriba 'fin' para terminar): ");
	        	linea = sc.nextLine();
	        	System.out.println();
	        	
	        }
	        
	        in.flush();
	        
	        in.close();
	        sc.close();
			
		} catch (IOException e) {
			
			System.out.println("No se ha podido encontrar el archivo");
			
		}
		
	}

}
