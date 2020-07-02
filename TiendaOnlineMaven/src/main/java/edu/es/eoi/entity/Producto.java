package edu.es.eoi.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "productos")
@NoArgsConstructor
@AllArgsConstructor
public class Producto {
	
	@Id
	@Column
	private String referencia;
	@Column
	private String nombre;
	@Column
	private double precio;
	@Column
	private String descripcion;
	@Column
	private int stock;
	@ManyToMany(mappedBy = "productos")
	private List<Pedido> pedidos;
		
	public String getDetalle() {		
		return this.nombre.concat(", "+this.descripcion);
	}
	
	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", referencia=" + referencia + ", precio=" + precio + ", descripcion="
				+ descripcion + ", stock=" + stock + "]";
	}
	
	
	
}

