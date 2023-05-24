package ejercicio05;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		String nombre = "";
		int edad = 0;
		
		try {
			
			BufferedWriter in = new BufferedWriter(new FileWriter("src\\ejercicio04\\Personas.txt", true));
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Introduzca su nombre: ");
        	nombre = sc.nextLine();
        	System.out.println();

        	System.out.print("Introduzca su edad: ");
        	edad = sc.nextInt();
        	System.out.println();
        	
        	in.write(nombre + " " + edad);
        	in.newLine();
        	
	        in.close();
	        sc.close();
			
		} catch (IOException e) {
			
			System.out.println("No se ha podido encontrar el archivo");
			
		}
		
	}

}
