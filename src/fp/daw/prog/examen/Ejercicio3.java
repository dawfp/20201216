package fp.daw.prog.examen;

import java.util.Scanner;

public class Ejercicio3 {

	/* 
	 * 3 puntos
	 * 
	 * 
	 * Escribe un programa que obtenga el desglose de una cantidad exacta de euros que
	 * el usuario introducirá por teclado en la mínima cantidad de billetes y monedas.
	 * 
	 * Hay billetes de 500, 200, 100, 50, 20, 10 y 5 euros y monedas de 1 y 2 euros.
	 * 
	 * Por ejemplo, si deseamos conocer el desglose de 434 euros, el programa mostrará
	 * por pantalla el siguiente resultado:
	 * 
	 * 		2 billetes de 200 euros.
	 * 		1 billete de 20 euros.
	 * 		1 billete de 10 euros.
	 * 		2 monedas de 2 euros.
	 * 
	 * Una vez ejecutado el programa, el usuario podrá realizar tantos desgloses como
	 * desee hasta que decida finalizar su ejecución, comprobando en cada caso que la
	 * cantidad introducida sea una cantidad positiva mayor que 0. En caso contrario 
	 * mostrará un mensaje de error y volverá a pedirla.
	 * 
	 * Una vez leida una cantidad de euros, el desglose lo realizará un método llamado
	 * 'desglosar' mostrándolo en la pantalla.
	 * 
	 */
	
	static Scanner in = new Scanner(System.in);
	static int [] TIPOS = {500, 200, 100, 50, 20, 10, 5, 2, 1};
	
	public static void main(String[] args) {
		do {
			desglosarCantidad(leerNumero());
		} while (continuar());
	}
	
	static int leerNumero() {
		int cantidad;
		
		do {
			System.out.print("Cantidad: ");
			cantidad = Integer.parseInt(in.nextLine());
			if (cantidad < 1)
				System.out.println("La cantidad tiene que ser mayor que cero");
		} while (cantidad < 1);
		return cantidad;
	}
	
	static boolean continuar() {
		String respuesta;
		boolean incorrecta;
		do {
			System.out.print("¿Desglosar otra cantidad? (s/n): ");
			respuesta = in.nextLine();
			incorrecta = !respuesta.equalsIgnoreCase("s") && !respuesta.equalsIgnoreCase("n");
			if (incorrecta)
				System.out.println("Respuesta incorrecta");
		} while (incorrecta);
		return respuesta.equalsIgnoreCase("s");
	}
	
	static void desglosarCantidad(int n) {
		for (int i=0; i<TIPOS.length && n > 0; i++)
			if (n >= TIPOS[i])
				n = desglosar(TIPOS[i], n);
	}
	
	static int desglosar(int tipo, int n) {
		int d = n / tipo;
		System.out.printf("%d %s%s de %d euros\n", d, tipo > 2 ? "billete" : "moneda", d > 1 ? "s" : "", tipo);
		return n % tipo;
	}
}
