package blackFriday;

public class Articulo {
	private String nombre;
	private double precio;
	private double rebaja;
	private int cantidadDisponible;
	private int cantidadDisponibleConRebaja;

	public Articulo(String nombre, double precio, double rebaja, int cantidadDisponible,
			int cantidadDisponibleConRebaja) {
		this.nombre = nombre;
		this.precio = precio;
		this.rebaja = rebaja;
		this.cantidadDisponible = cantidadDisponible;
		this.cantidadDisponibleConRebaja = cantidadDisponibleConRebaja;
	}

	public boolean estaEnDescuento() {
		if (cantidadDisponibleConRebaja == 0) {
			return false;
		} else {
			return true;
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		if (cantidadDisponibleConRebaja > 0) {
			precio = precio - (precio * rebaja / 100);
		}
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public double getRebaja() {
		return rebaja;
	}

	public void setRebaja(int rebaja) {
		this.rebaja = rebaja;
	}

	public int getCantidadDisponible() {
		return cantidadDisponible;
	}

	public void setCantidadDisponible(int cantidadDisponible) {
		this.cantidadDisponible = cantidadDisponible;
	}
	
	public void añadirCantidadDisponible(int unidadesAlmacenadas, boolean tipoUnidad) {
		if (tipoUnidad) {
			cantidadDisponible += unidadesAlmacenadas;
			cantidadDisponibleConRebaja += unidadesAlmacenadas;
		}
		if (!tipoUnidad) {
			cantidadDisponible += unidadesAlmacenadas;
		}
	}

	public int getCantidadDisponibleConRebaja() {
		return cantidadDisponibleConRebaja;
	}

	public void setCantidadDisponibleConRebaja(int cantidadDisponibleConRebaja) {
		this.cantidadDisponibleConRebaja = cantidadDisponibleConRebaja;
	}

	@Override
	public String toString() {
		return "Nombre = " + nombre + "\nPrecio = " + precio + "\nRebaja = " + rebaja + "\nPrecio con rebaja = " + (precio-(precio*rebaja/100)) + "\nCantidad disponible = "
				+ cantidadDisponible + "\nCantidad disponible con rebaja = " + cantidadDisponibleConRebaja + "\n\n\n";
	}
	
	

}
