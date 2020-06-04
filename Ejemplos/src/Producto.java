
public class Producto implements Comparable<Producto>{
	
	private String nombre;
	private int cantidad;
	private double precio;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public Producto(String nombre, int cantidad, double precio) {
		super();
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.precio = precio;
	}
	@Override
	public int compareTo(Producto o) {
		
		if(o.getPrecio()<this.precio) {
			return 1;
		}else if (o.getPrecio()>this.precio){
			return -1;
		}else {
			return 0;
		}
		
	}
	
	

}
