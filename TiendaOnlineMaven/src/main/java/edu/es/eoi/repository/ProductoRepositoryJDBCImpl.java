package edu.es.eoi.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Map;
import java.util.TreeMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import edu.es.eoi.entity.Producto;

@Repository
@Qualifier("JDBC")
public class ProductoRepositoryJDBCImpl implements MyRepository<Producto> {

	@Autowired
	private Connection connection;

	@Override
	public Producto read(String ref) throws Exception {

		String query = "SELECT referencia,nombre,precio,stock,descripcion FROM tienda.productos WHERE referencia=?";
		PreparedStatement statement = connection.prepareStatement(query);
		statement.setString(1, ref);
		Producto producto = null;
		ResultSet rs = statement.executeQuery();

		while (rs.next()) {
			producto = new Producto(rs.getString("referencia"),
				                    rs.getString("nombre"),
				                    rs.getDouble("precio"),
				                    rs.getString("descripcion"),
				                    rs.getInt("stock"),
				                    null);
		}
		return producto;
	}

	@Override
	public void save(Producto e) throws Exception {
		String query = "INSERT INTO productos (referencia,nombre,precio,stock,descripcion) VALUES (?,?,?,?,?);";
	
		PreparedStatement statement = connection.prepareStatement(query);
		statement.setString(1, e.getReferencia());
		statement.setString(2, e.getNombre());
		statement.setDouble(3, e.getPrecio());
		statement.setInt(4, e.getStock());
		statement.setString(5, e.getDescripcion());

		statement.executeUpdate();
	}

	@Override
	public Map<String, Producto> readAll() throws Exception {
		
		String query = "SELECT referencia,nombre,precio,stock,descripcion FROM productos";		
		PreparedStatement statement = connection.prepareStatement(query);		
		Map<String,Producto> productos = new TreeMap<String, Producto>();
		ResultSet rs = statement.executeQuery();

		while (rs.next()) {
			Producto producto = new Producto(rs.getString("referencia"),
					                         rs.getString("nombre"),
					                         rs.getDouble("precio"),
					                         rs.getString("descripcion"),
					                         rs.getInt("stock"),
					                         null);
			productos.put(producto.getReferencia(), producto);
		}
				
		return productos;
	}

	@Override
	public void delete(String ref) throws Exception {
		String query="DELETE FROM productos WHERE referencia=?";
		PreparedStatement statement = connection.prepareStatement(query);		
		statement.setString(1, ref);
		statement.executeUpdate();			
	}

}
