package edu.es.eoi.service;

import java.util.ArrayList;
import java.util.List;

import edu.es.eoi.entity.Carrito;
import edu.es.eoi.entity.ListaDeseos;
import edu.es.eoi.entity.Producto;
import edu.es.eoi.repository.ProductoRepository;

public class ProductoService {

	private List<Producto> almacen;	
	private Carrito carrito;
	private ListaDeseos deseos;
	private ProductoRepository repository;
	
	public ProductoService(List<Producto> almacen, Carrito carrito, ListaDeseos deseos) {
		super();
		this.almacen = almacen;
		this.carrito = carrito;
		this.deseos = deseos;
		this.repository=new ProductoRepository(almacen);
	}
	
	public void comprar(Producto producto) {
			
		carrito.getProductos().add(producto);
		
	}
	
	public Producto buscar(String referencia) {
		return repository.leer(referencia);
	}
	
	public void comparar(String referencia1,String referencia2) {
		
		Producto producto1=repository.leer(referencia1);
		Producto producto2=repository.leer(referencia2);
		
		System.out.println("**********PRODUCTO "+ producto1.getNombre()+ "*********");
		System.out.println(producto1);
		System.out.println("**********PRODUCTO "+ producto2.getNombre()+ "*********");
		System.out.println(producto2);
	}	
	
	public void addToListaDeseos(Producto producto) {
		
		deseos.getProductos().add(producto);
	}

	public List<Producto> getAlmacen() {
		return almacen;
	}

	public void setAlmacen(ArrayList<Producto> almacen) {
		this.almacen = almacen;
	}

	public Carrito getCarrito() {
		return carrito;
	}

	public void setCarrito(Carrito carrito) {
		this.carrito = carrito;
	}

	public ListaDeseos getDeseos() {
		return deseos;
	}

	public void setDeseos(ListaDeseos deseos) {
		this.deseos = deseos;
	}

	
	
}
