package Tarea4;

public class Usuarios {

	private int idventana_registro;
	private String Nombre;
	private String Apellido;
	private String Nombre_Usuario;
	private String Telefono;
	private String Correo_electronico;
	private String Contraseña;
	private String Confirmacio_contraseña;
	
	
	public int getIdVentana_Registro() {
		return idventana_registro;
	}
	public void setIdventana_Registro(int idVentana_registro) {
		this.idventana_registro = idVentana_registro;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getApellido() {
		return Apellido;
	}
	public void setApellido(String apellido) {
		Apellido = apellido;
	}
	public String getNombre_Usuario() {
		return Nombre_Usuario;
	}
	public void setNombre_Usuario(String nombre_Usuario) {
		Nombre_Usuario = nombre_Usuario;
	}
	public String getTelefono() {
		return Telefono;
	}
	public void setTelefono(String telefono) {
		Telefono = telefono;
	}
	public String getCorreo_electronico() {
		return Correo_electronico;
	}
	public void setCorreo_electronico(String correo_electronico) {
		Correo_electronico = correo_electronico;
	}
	public String getContraseña() {
		return Contraseña;
	}
	public void setContraseña(String contraseña) {
		Contraseña = contraseña;
	}
	public String getConfirmacio_contraseña() {
		return Confirmacio_contraseña;
	}
	public void setConfirmacio_contraseña(String confirmacio_contraseña) {
		Confirmacio_contraseña = confirmacio_contraseña;
	}
	
	ConexionMySQL con = new ConexionMySQL();
	
	public String MD5(String MD5) {
		
		try {
			java.security.MessageDigest md = java.security.MessageDigest.getInstance(MD5);
			
			byte[] array = md.digest(MD5.getBytes());
			
			StringBuffer sb = new StringBuffer();
			
			for(int i = 0; 1 < array.length; i++ ) {
				sb.append(Integer.toHexString((array [i] & 0xFF) | 0x100).substring(1, 3));
				
			} return sb.toString();
		}catch(java.security.NoSuchAlgorithmException e) {
			
		}
		return null;
	}
	/** 
	public Object[][] Acceder(String Usuario, String Contraseña){
	    
	    int registros = 0 ;
	    try {
	    	PreparedStatement ps = con.getConnection().prepareStatement("SELECT count() as cont FROM ventana_registro");
	    	ResultSet res = ps.executeQuery();
	    	res.next();
	    	registros = res.getInt("count");
	    	res.close();
	    	
	    }catch(Exception es) {
	    	/**Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null,es);
	    }
	    Object [][] data = new Object[registros] [3];
	    
	    ConexionMySQL con = new ConexionMySQL();
	    Ventana_Login user = new Ventana_Login();
	    
	   if(user.con.getTextField() != "" && user.con.getPasswordField() != "") 
	    {
	      int usu_id;
	      String name;
	      String passw;
	      
	      try {
	    	   String strql = "SELECT idventana_registro, Nombre de usuario, Contraseña WHERE Nombre de usuario = '"+ name +"' AND Contraseña ='"+ passw +"'";
	    	    PreparedStatement ps = con.getConnection().prepareStatement(strql);
	    	    ResultSet res = ps.executeQuery();
	    	   int i = 0;
	    	   while(res.next())
	    	   {
	    		   usu_id = res.getInt("idventana_registro");
	    		   name = res.getString("Nombre de usuario");
	    		   passw = res.getString("Contraseña");
	    		   
	    		   data[i][0] = usu_id;
	    		   data[i][1] = name;
	    		   data[i][2] = passw;
	    		   i++;	   
	    	   }  
	    	   return data;
	    	   
	    	   res.close();
	      }catch(Exception ed){
	    	  System.out.println(ed);
	      
	      }
       } 
    } */
}
