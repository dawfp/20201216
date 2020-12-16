package fp.daw.prog.examen;

import java.util.Scanner;

public class Ejercicio1 {

	/*
	 * 2 PUNTOS
	 * 
	 * 
	 * Escribe en el método 'main' un programa que lea por teclado una línea de texto que contenga el nombre y apellidos de una
	 * persona y cree una cadena que contenga las iniciales correspondientes SIN USAR el método 'length()' de la clase 'String'.
	 * 
	 */
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Nombre: ");
		String [] v = in.nextLine().split(" ");
		StringBuilder sb = new StringBuilder();
		for (String s: v)
			sb.append(s.charAt(0));
		String iniciales = sb.toString();
		System.out.println(iniciales);
	}

}
