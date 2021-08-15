package Tarea4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class ConexionMySQL {

	public Connection conexion = null;
	public Statement sentencia;
	public ResultSet resultado;
	
	public void ConectarBasedeDatos() {
		try {
			final String Controlador = "com.mysql.cj.jdbc.Driver";
			Class.forName(Controlador);
			final String url_bd = "jdbc:mysql://localhost:3306/basedatos_tarea4";
			conexion = DriverManager.getConnection(url_bd, "root", "123456");
			sentencia = conexion.createStatement();
			if (conexion != null) {
			JOptionPane.showMessageDialog(null, "La conexion ha sido exitosa ", "EXITO", JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch (ClassNotFoundException | SQLException ex) {
			JOptionPane.showMessageDialog(null, ex.getMessage(), "Error ", JOptionPane.ERROR_MESSAGE);
		}
	}

	public void DesconectarBasedeDatos() {
		try {
			if (conexion != null) {
				if (sentencia != null) {
					sentencia.close();
				}
				conexion.close();
			}
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
			System.exit(1);
		}
	}

	public Connection getConnection() {
		return conexion;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
