package com.es.eoi.productator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.es.eoi.productator.entities.Product;
import com.es.eoi.productator.enums.Category;
import com.es.eoi.productator.enums.IVA;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		List<Product> products = new ArrayList<Product>();

		products.add(new Product("Tomates", "Tomates rojos", IVA.GENERAL, 1.2, 100, Category.ALIMENTACION));
		products.add(new Product("Tomates", "Tomates verdes", IVA.GENERAL, 1.4, 40, Category.LUJO));
		products.add(new Product("Patatas", "Patatas para freir", IVA.GENERAL, 1.0, 200, Category.ALIMENTACION));
		products.add(new Product("Cebollas", "Cebollas para ensalada", IVA.GENERAL, 0.9, 60, Category.ALIMENTACION));

//		for (Product p : products) {
//			System.out.println(p);
//		}
//
//		System.out.println(
//				"------------------------------------------------------------------------------------------------------------------------------------------");
//
//		products.remove(0002);
//
//		for (Product p : products) {
//			System.out.println(p);
//		}
//
//		System.out.println(
//				"------------------------------------------------------------------------------------------------------------------------------------------");
//
//		products.add(new Product("Zanahorias", "Zanahorias rallada", IVA.GENERAL, 1.5, 20, Category.ALIMENTACION));
//
//		for (Product p : products) {
//			System.out.println(p);
//		}

		Scanner scanner;
		String input;

		do {

			System.out.println("---------");
			System.out.println("PRODUCTOS");
			System.out.println("---------");

			System.out.println("1. Añadir producto");
			System.out.println("2. Buscar producto");
			System.out.println("3. Modificar producto");
			System.out.println("4. Eliminar producto\n");
			System.out.println("5. Listar productos");

			scanner = new Scanner(System.in);
			input = scanner.nextLine();

			if (input.compareTo("1") == 0) {
				String nombre;
				String descripcion;
				IVA iva = IVA.GENERAL;
				Double precio;
				int cantidad;
				Category categoria = Category.ALIMENTACION;

				System.out.println("Escriba el nombre del producto:");
				scanner = new Scanner(System.in);
				input = scanner.nextLine();
				nombre = input;

				System.out.println("Escriba el nombre la descripcion:");
				scanner = new Scanner(System.in);
				input = scanner.nextLine();
				descripcion = input;

				System.out.println("Escriba el precio:");
				scanner = new Scanner(System.in);
				input = scanner.nextLine();
				precio = Double.parseDouble(input);

				do {
					System.out.println("Seleccione el IVA:");
					System.out.println("1. General 21%");
					System.out.println("2. Reducido 10%");
					System.out.println("3. Superreducido 4%");

					scanner = new Scanner(System.in);
					input = scanner.nextLine();

					if (input.compareTo("1") == 0)
						iva = IVA.GENERAL;
					if (input.compareTo("2") == 0)
						iva = IVA.REDUCIDO;
					if (input.compareTo("3") == 0)
						iva = IVA.SUPERREDUCIDO;

				} while (input.compareTo("1") != 0 && input.compareTo("2") != 0 && input.compareTo("3") != 0);

				System.out.println("Escriba la cantidad:");
				scanner = new Scanner(System.in);
				input = scanner.nextLine();
				cantidad = Integer.parseInt(input);

				do {
					System.out.println("Seleccione la categoría:");
					System.out.println("1. Alimentación");
					System.out.println("2. Material");
					System.out.println("3. Mecánico");
					System.out.println("3. Lujo");

					scanner = new Scanner(System.in);
					input = scanner.nextLine();

					if (input.compareTo("1") == 0)
						categoria = Category.ALIMENTACION;
					if (input.compareTo("2") == 0)
						categoria = Category.MATERIAL;
					if (input.compareTo("3") == 0)
						categoria = Category.MECANICO;
					if (input.compareTo("4") == 0)
						categoria = Category.LUJO;

				} while (input.compareTo("1") != 0 && input.compareTo("2") != 0 && input.compareTo("3") != 0
						&& input.compareTo("4") != 0);

				if (products.add(new Product(nombre, descripcion, iva, precio, cantidad, categoria)))
					System.out.println("Añadido correctamente");

				System.out.println("Volviendo al menú");
			}

			if (input.compareTo("5") == 0) {
				for (Product p : products) {
					System.out.println(p);
				}
			}

		} while (input != null);

	}

}
