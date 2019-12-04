package blackFriday;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int opcionEscogida;

		Articulo[] vArticulos = new Articulo[10];

		do {
			switch (opcionEscogida = Menu.despliegaMenu()) {

			case 1:
				añadirProducto(vArticulos);
				break;
			case 2:
				almacenarProductos(vArticulos);
				break;
			case 3:
				verProductosConDescuento(vArticulos);
				break;
			case 4:
				verTodosLosProductos(vArticulos);
				break;
			case 5:

				break;
			}

		} while (opcionEscogida != 0);
	}

	private static void añadirProducto(Articulo[] vArticulo) {
		Scanner leer = new Scanner(System.in);
		int cantidadDisponibleConRebaja, cantidadDisponible;
		double precio, descuento;
		String nombre;

		for (int i = 0; i < vArticulo.length; i++) {
			if (vArticulo[i] == null) {
				System.out.println("Introduzca nombre del artículo:");
				nombre = leer.nextLine();
				System.out.println("Introduzca precio del artículo:");
				precio = leer.nextDouble();
				System.out.println("Introduzca unidades iniciales disponibles del producto:");
				cantidadDisponible = leer.nextInt();
				System.out.println("Introduzca unidades que tendrán rebaja:");
				cantidadDisponibleConRebaja = leer.nextInt();
				cantidadDisponible += cantidadDisponibleConRebaja;
				System.out.println("Introduzca el porcentaje del descuento:");
				descuento = leer.nextDouble();

				vArticulo[i] = new Articulo(nombre, precio, descuento, cantidadDisponible, cantidadDisponibleConRebaja);
				break;
			}
		}
	}

	private static void almacenarProductos(Articulo[] vAlmacen) {
		Scanner leer = new Scanner(System.in);
		int productoEscogido, cantidadAlmacenar, tipoProducto;
		boolean tipo = false;

		for (int i = 0; i < vAlmacen.length; i++) {
			if (vAlmacen[i] != null) {
				System.out.println(i + ") " + vAlmacen[i].getNombre());
			}
		}

		System.out.println("Seleccione producto para aumentar unidades:");
		productoEscogido = leer.nextInt();

		System.out.println("¿Cuántas unidades quiere añadir?");
		cantidadAlmacenar = leer.nextInt();

		System.out.println("¿Las unidades que quiere añadir son con descuento(1) o sin descuento(2)? (1-2)");
		tipoProducto = leer.nextInt();
		if (tipoProducto == 1) {
			tipo = true;
		}
		if (tipoProducto == 2) {
			tipo = false;
		}

		vAlmacen[productoEscogido].añadirCantidadDisponible(cantidadAlmacenar, tipo);
	}

	private static void verProductosConDescuento(Articulo[] vDescuentos) {
		for (int i = 0; i < vDescuentos.length; i++) {
			if ((vDescuentos[i] != null) && (vDescuentos[i].getCantidadDisponibleConRebaja() > 0)) {
				System.out.println(vDescuentos[i]);
			}
		}
	}

	private static void verTodosLosProductos(Articulo[] vTodos) {
		for (int i = 0; i < vTodos.length; i++) {
			if (vTodos[i] != null) {
				System.out.println(vTodos[i]);
			}
		}
	}

}
