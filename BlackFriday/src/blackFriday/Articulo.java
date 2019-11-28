package blackFriday;

public class Articulo {
	private String nombre;
	private double precio;
	private int rebaja;
	private int cantidadDisponible;
	private int cantidadDisponibleConRebaja;

	public Articulo(String nombre, double precio, int rebaja, int cantidadDisponible, int cantidadDisponibleConRebaja) {
		this.nombre = nombre;
		this.precio = precio - (precio*rebaja/100);
		this.rebaja = rebaja;
		this.cantidadDisponible = cantidadDisponible;
		this.cantidadDisponibleConRebaja = cantidadDisponibleConRebaja;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getRebaja() {
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

	public int getCantidadDisponibleConRebaja() {
		return cantidadDisponibleConRebaja;
	}

	public void setCantidadDisponibleConRebaja(int cantidadDisponibleConRebaja) {
		this.cantidadDisponibleConRebaja = cantidadDisponibleConRebaja;
	}
	
	
	
	
}
