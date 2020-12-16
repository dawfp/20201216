package fp.daw.prog.examen;

import java.util.Scanner;

public class Ejercicio4 {
	
	/* 
	 * 3 puntos
	 * 
	 * 
	 * Decimos que un número entero positivo es guay si puede obtenerse como suma de dos o más números
	 * enteros consecutivos. Por ejemplo, 3 (=1+2), 5 (=2+3), 6(=1+2+3), son números guays.
	 * 
	 * Escribir un método llamado 'esGuay' que reciba un número entero positivo e indique si éste es guay.
	 * 
	 * Escribir en el método 'main' un programa que muestre los N primeros números guays, siendo N un
	 * número entero positivo mayor que cero que el usuario introducirá por teclado. 
	 * 
	 */

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int guays = 0;
		int numero = 2;
		System.out.print("N: ");
		int N = Integer.parseInt(in.nextLine());
		while (guays < N) {
			if (esGuay(numero)) {
				guays++;
				System.out.printf("%d: el número %d es guay\n", guays, numero);
			}
			numero++;
		}
	}
	
	static boolean esGuay(int n) {
		int suma = 0;
		for (int i=1; i<n && suma != n; i++) {
			suma = 0;
			for (int j=i; j<n && suma < n; j++)
				suma += j;
		}
		return suma == n;
	}
	
	
	
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		int guays = 0;
//		int numero = 2;
//		System.out.println("N: ");
//		int N = Integer.parseInt(in.nextLine());
//		while (guays < N) {
//			String r = esGuay(numero);
//			if (r != null) {
//				guays++;
//				System.out.printf("%d: el número %d es guay: %s\n", guays, numero, r);
//			}
//			numero++;
//		}
//	}
//	
//	static String esGuay(int n) {
//		int suma = 0;
//		StringBuilder s = null;
//		for (int i=1; i<n && suma != n; i++) {
//			suma = 0;
//			s = new StringBuilder();
//			for (int j=i; j<n && suma < n; j++) {
//				if (suma > 0)
//					s.append(" + ");
//				s.append(String.valueOf(j));
//				suma += j;
//			}
//		}
//		return suma == n ? s.toString() : null;
//	}
}
