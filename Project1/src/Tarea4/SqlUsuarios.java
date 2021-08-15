package Tarea4;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class SqlUsuarios extends ConexionMySQL {

	public boolean registrar(Usuarios usr) {
		PreparedStatement ps = null;
		Connection con = getConnection();
		
		String sqgl = "INSERT INTO ventana_registro (Nombre, Apellido, Nombre de usuario, Telefono, Correo electronico,  Contraseña, Confirmacion contraseña) "
				+ "VALUES(?,?,?,?,?,?,?)";
		try {
			ps = con.prepareStatement(sqgl);
			ps.setString(1, usr.getNombre());
			ps.setString(2, usr.getApellido());
			ps.setString(3, usr.getNombre_Usuario());
			ps.setString(4, usr.getTelefono());
			ps.setString(5, usr.getCorreo_electronico());
			ps.setString(6, usr.getContraseña());
			ps.setString(7, usr.getConfirmacio_contraseña());
			ps.execute();
			ps.close();
			return true;
			
		} catch(Exception ef) {
			/**Logger.getLogger(SqlUsuarios.class.getName()).log(Level.SEVERE,null,ef) */
			return false;
			}
		}
		public boolean Actualizar(Usuarios usr2) {
			PreparedStatement ps2 = null;
			Connection con2 = getConnection();
		
		String sqhl = "UPADTE ventana_registro (Nombre, Apellido, Nombre de usuario, Telefono, Correo electronico,  Contraseña, Confirmacion contraseña) "
				+ "SET(?,?,?,?,?,?,?)";
		try {
			ps2 = con2.prepareStatement(sqhl);
			ps2.setString(1, usr2.getNombre());
			ps2.setString(2, usr2.getApellido());
			ps2.setString(3, usr2.getNombre_Usuario());
			ps2.setString(4, usr2.getTelefono());
			ps2.setString(5, usr2.getCorreo_electronico());
			ps2.setString(6, usr2.getContraseña());
			ps2.setString(7, usr2.getConfirmacio_contraseña());
			ps2.executeUpdate();
			return true;
			
		} catch(Exception ex) {
			System.out.println(ex);
			return false;
		  }
		}
		
        public boolean Eliminar(Usuarios usr3) {
			PreparedStatement ps3 = null;
			Connection con3 = getConnection();
			
		String sql = "DELETE FROM ventana_registro WHERE (Nombre, Apellido, Nombre de usuario, Telefono, Correo electronico,  Contraseña, Confirmacion contraseña) SET,(?,?,?,?,?,?,?)";
		try {
			
		    ps3 = con3.prepareStatement(sql);
			ps3.setString(1, usr3.getNombre());
			ps3.setString(2, usr3.getApellido());
			ps3.setString(3, usr3.getNombre_Usuario());
			ps3.setString(4, usr3.getTelefono());
			ps3.setString(5, usr3.getCorreo_electronico());
			ps3.setString(6, usr3.getContraseña());
			ps3.setString(7, usr3.getConfirmacio_contraseña());
			ps3.execute();
			return true;
			
		} catch(Exception exc) {
			System.out.println(exc);
			return false;
		  }
       } 
}
