package edu.es.eoi.entities;

public class Maquina {
	
	private String marca;
	
	private boolean tieneCambio;
	
	private  Producto[][] productos= new Producto[5][10];
	
	private Producto[] vendidos= new Producto[500];
	
	public void vender(Producto producto) {
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 10; j++) {
				 if(productos[i][j]!=null&&productos[i][j].equals(producto)) {
						productos[i][j].setCantidad(productos[i][j].getCantidad()-1);
						for (int j2 = 0; j2 < vendidos.length; j2++) {
							if(vendidos[j2]==null) {
								vendidos[j2]=producto;
								break;
							}
						}
				 }	
			}
		}
		
	}
	
	public void contarGanancias() {		
		double cantidad=0;
		
		for (int i = 0; i < vendidos.length; i++) {
			if(vendidos[i]!=null) {
				cantidad=cantidad+vendidos[i].getPrecio();
			}			
		}		
		System.out.println("Has ganado :" + cantidad);		
		
	}
	
	public void rellenar(Producto producto) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 10; j++) {
				if (productos[i][j]==null) {
					productos[i][j]=producto;
					return;
				}
				else if(productos[i][j].equals(producto)) {
					productos[i][j].setCantidad(productos[i][j].getCantidad()+1);
					return;
				}			
			}
		}
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public boolean isTieneCambio() {
		return tieneCambio;
	}

	public void setTieneCambio(boolean tieneCambio) {
		this.tieneCambio = tieneCambio;
	}

	public Producto[][] getProductos() {
		return productos;
	}

	public void setProductos(Producto[][] productos) {
		this.productos = productos;
	}

	
	
}
