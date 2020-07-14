package edu.es.eoi.user.repository;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import edu.es.eoi.user.entity.User;

@Repository
@Qualifier("JDBC")
public class UserRepositoryJDBCImpl implements MyRepository<User> {

	public Connection getConnection() throws SQLException {

		String url = "jdbc:mysql://localhost:3306/rest?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		String user = "root";
		String pass = "root";
		return DriverManager.getConnection(url, user, pass);
	}

	@Override
	public User findById(Integer id) {

		User entity = null;

		try {
			Connection con = getConnection();
			PreparedStatement st = con.prepareStatement(
					"SELECT idUsuario,nombre,fecha,premium,saldo FROM rest.usuario WHERE idUsuario=?");
			st.setInt(1, id);

			ResultSet rs = st.executeQuery();
			while (rs.next()) {
				entity = new User();
				entity.setId(rs.getInt("id"));
				entity.setNombre(rs.getString("nombre"));
				entity.setFecha(rs.getDate("fecha"));
				entity.setPremium(rs.getBoolean("premium"));
				entity.setSaldo(rs.getDouble("saldo"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return entity;

	}

	@Override
	public void create(User e) {

		try {
			Connection con = getConnection();
			PreparedStatement st = con
					.prepareStatement("INSERT INTO rest.usuario (nombre,fecha,premium,saldo) VALUES (?,?,?,?)");
			st.setString(1, e.getNombre());
			st.setDate(2, new Date(e.getFecha().getTime()));
			st.setBoolean(3, e.getPremium());
			st.setDouble(4, e.getSaldo());

			st.executeUpdate();

		} catch (SQLException ex) {
			ex.printStackTrace();
		}

	}

	@Override
	public void update(User e) {
		try {
			Connection con = getConnection();

			PreparedStatement st = con.prepareStatement(
					"UPDATE rest.usuario SET " + "nombre=?,fecha=?,premium=?,saldo=? WHERE idUsuario=?");

			st.setString(1, e.getNombre());
			st.setDate(2, new Date(e.getFecha().getTime()));
			st.setBoolean(3, e.getPremium());
			st.setDouble(4, e.getSaldo());
			st.setInt(5, e.getId());

			st.executeUpdate();

		} catch (SQLException ex) {
			ex.printStackTrace();
		}

	}

	@Override
	public void deleteById(Integer id) {

		try {

			Connection con = getConnection();
			PreparedStatement st = con.prepareStatement("DELETE FROM rest.usuario WHERE idUsuario=?");
			st.setInt(1, id);

			st.executeUpdate();
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	@Override
	public List<User> findAll() {

		List<User> lista = new ArrayList<User>();
		try {
			Connection con = getConnection();
			PreparedStatement st = con
					.prepareStatement("SELECT idUsuario,nombre,fecha,premium,saldo FROM rest.usuario");

			ResultSet rs = st.executeQuery();
			while (rs.next()) {
				User entity = new User();
				entity.setId(rs.getInt("id"));
				entity.setNombre(rs.getString("nombre"));
				entity.setFecha(rs.getDate("fecha"));
				entity.setPremium(rs.getBoolean("premium"));
				entity.setSaldo(rs.getDouble("saldo"));
				lista.add(entity);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return lista;

	}

}
