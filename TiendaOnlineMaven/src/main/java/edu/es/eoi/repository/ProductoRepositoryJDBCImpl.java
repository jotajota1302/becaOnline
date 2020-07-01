package edu.es.eoi.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;
import java.util.TreeMap;

import edu.es.eoi.entity.Producto;

public class ProductoRepositoryJDBCImpl implements MyRepository<Producto> {

	private Connection getConnection() throws SQLException {
		String url = "jdbc:mysql://localhost:3306/tienda?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		String user = "root";
		String pass = "root";
		return DriverManager.getConnection(url, user, pass);
	}

	private void closeConnection(Connection connection) throws SQLException {
		connection.close();
	}

	@Override
	public Producto read(String ref) throws Exception {

		String query = "SELECT referencia,nombre,precio,stock,descripcion FROM tienda.productos WHERE referencia=?";
		Connection con = getConnection();
		PreparedStatement statement = con.prepareStatement(query);
		statement.setString(1, ref);
		Producto producto = null;
		ResultSet rs = statement.executeQuery();

		while (rs.next()) {
			producto = new Producto(rs.getString("referencia"),
				                    rs.getString("nombre"),
				                    rs.getDouble("precio"),
				                    rs.getString("descripcion"),
				                    rs.getInt("stock"));
		}

		closeConnection(con);

		return producto;
	}

	@Override
	public void save(Producto e) throws Exception {
		String query = "INSERT INTO productos (referencia,nombre,precio,stock,descripcion) VALUES (?,?,?,?,?);";
		Connection con = getConnection();

		PreparedStatement statement = con.prepareStatement(query);
		statement.setString(1, e.getReferencia());
		statement.setString(2, e.getNombre());
		statement.setDouble(3, e.getPrecio());
		statement.setInt(4, e.getStock());
		statement.setString(5, e.getDescripcion());

		statement.executeUpdate();

		closeConnection(con);
	}

	@Override
	public Map<String, Producto> readAll() throws Exception {
		
		String query = "SELECT referencia,nombre,precio,stock,descripcion FROM productos";
		Connection con = getConnection();
		PreparedStatement statement = con.prepareStatement(query);		
		Map<String,Producto> productos = new TreeMap<String, Producto>();
		ResultSet rs = statement.executeQuery();

		while (rs.next()) {
			Producto producto = new Producto(rs.getString("referencia"),
					                         rs.getString("nombre"),
					                         rs.getDouble("precio"),
					                         rs.getString("descripcion"),
					                         rs.getInt("stock"));
			productos.put(producto.getReferencia(), producto);
		}
		
		closeConnection(con);
		
		return productos;
	}

	@Override
	public void delete(String ref) throws Exception {
		String query="DELETE FROM productos WHERE referencia=?";
		Connection con = getConnection();
		PreparedStatement statement = con.prepareStatement(query);		
		statement.setString(1, ref);
		statement.executeUpdate();		
		closeConnection(con);
	}

}
