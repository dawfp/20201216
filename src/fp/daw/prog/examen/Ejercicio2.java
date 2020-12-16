package fp.daw.prog.examen;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio2 {

	/*
	 * 2 PUNTOS
	 * 
	 * 
	 * Escribe en el método main un programa que genere un vector de 1000 números aleatorios comprendidos entre 12345 y 1234567
	 * y permita comprobar si un número introducido por teclado se encuentra en el array.
	 * 
	 * Se ha de realizar una búsqueda binaria sin usar sentencias repetitivas.
	 * 
	 */
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Random r = new Random();
		final int INF = 12345;
		final int SUP = 1234567;
		final int N = SUP - INF + 1;
		
		int [] v = new int[1000];
		for (int i=0; i<v.length; i++)
			v[i] = r.nextInt(N) + INF;
		Arrays.sort(v);
		System.out.println(Arrays.toString(v));
		System.out.println("Número: ");
		int n = Integer.parseInt(in.nextLine());
		int i = Arrays.binarySearch(v, n);
		if (i >= 0)
			System.out.printf("El número %d está almacenado en la posición %d", n, i);
		else
			System.out.printf("El número %d no está almacenado en el array", n);
	}

}
