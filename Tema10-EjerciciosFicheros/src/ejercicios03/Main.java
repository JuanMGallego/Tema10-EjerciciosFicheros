package ejercicios03;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int edad = 0;
		double estatura = 0;
		int cont = 0;
		String[] listaNombres = {};
		int sumaEdad = 0;
		double sumaEstatura = 0;
		int mediaEdad = 0;
		double mediaEstatura = 0;
		
		try {
			
			Scanner sc = new Scanner(new FileReader("src\\ejercicio03\\Alumnos.txt"));
			
			while (sc.hasNext()) {
				
				listaNombres = Arrays.copyOf(listaNombres, listaNombres.length + 1);
				
				listaNombres[cont] = sc.next();
				edad = sc.nextInt();
				estatura = sc.nextDouble();
				
				sumaEdad += edad;
				sumaEstatura += estatura;
				
				cont++;
				
			}
			
			mediaEdad = sumaEdad / cont;
			mediaEstatura = sumaEstatura / cont;
			
			System.out.println("Lista de alumnos: " + listaNombres);
			System.out.println("Edad media: " + mediaEdad);
			System.out.println("Estatura Media: " + mediaEstatura);
			
			sc.close();
			
		} catch (FileNotFoundException e){
			
			System.out.println("El archivo no se ha encontrado");
			
		}
		
	}
	
}
