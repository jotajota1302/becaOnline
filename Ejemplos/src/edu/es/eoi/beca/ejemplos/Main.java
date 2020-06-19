package edu.es.eoi.beca.ejemplos;
import java.util.Scanner;

public class Main {

	static String[][] nombresGolosinas = { { "KitKat", "Chicles de fresa", "Lacasitos", "Palotes" },
			{ "Kinder Bueno", "Bolsa variada Haribo", "Chetoos", "Twix" },
			{ "Kinder Bueno", "M&M'S", "Papa Delta", "Chicles de menta" },
			{ "Lacasitos", "Crunch", "Milkybar", "KitKat" } };

	static double[][] precio = { { 1.1, 0.8, 1.5, 0.9 }, { 1.8, 1, 1.2, 1 }, { 1.8, 1.3, 1.2, 0.8 },
			{ 1.5, 1.1, 1.1, 1.1 } };

	public static void main(String[] args) {

		// listar golosinas
		imprimirGolosinas();

		System.out.println("Introduce pedido: [][]");
		Scanner scanner = new Scanner(System.in);
		String producto = scanner.next();
		Integer x = Integer.valueOf(producto.substring(0, 1));
		Integer y = Integer.valueOf(producto.substring(1, 2));

		System.out.println("he elegido el producto : " + nombresGolosinas[x][y]);
		nombresGolosinas[x][y] = null;

		// listar golosinas
		imprimirGolosinas();
		// cuanto hemos ganado
		System.out.println("Hemos vendido: " + calcularVentas() + " €");
		main(null);
	}

	private static double calcularVentas() {

		double ganancias = 0;

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (nombresGolosinas[i][j] == null) {
					ganancias = ganancias + precio[i][j];
				}
			}
		}
		return ganancias;
	}

	public static void imprimirGolosinas() {

		System.out.println("Tenemos los siguientes productos y precios");
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.println(
						"posicion [" + i + "][" + j + "]" + nombresGolosinas[i][j] + ", precio: " + precio[i][j]);
			}
		}
	}
	
	

}
