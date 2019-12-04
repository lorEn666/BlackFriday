package blackFriday;

import java.util.Scanner;

public class Menu {
	
	public static int despliegaMenu() {
		Scanner leer = new Scanner(System.in);
		int opc;
		
		do {
			System.out.println("1-Añadir producto");
			System.out.println("2-Almacenar productos");
			System.out.println("3-Ver productos con descuento");
			System.out.println("4-Ver todos los productos");
			System.out.println("5-Vender producto");
			System.out.println("0-Salir");
			opc = leer.nextInt();
			return opc;
		} while (opc!=0);
	}

}
