package Tarea4;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Ventana_principal extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private JTextField txtNombre1;
	private JTextField txtApellido1;
	private JTextField txtTelefono1;
	private JTextField txtCorreo1;
	private JTextField txtUsuario1;
	private JPasswordField Contrasena1;
	private JTextField Confirmacion1;
	private JTextField textField_6;
	private JTextField txtNombre2;
	private JTextField txtApellido2;
	private JTextField txtTelefono2;
	private JTextField txtCorreo2;
	private JTextField txtUsuario2;
	private JTextField Contrasena2;
	private JTextField Confirmacion2;
	private JTextField txtNombre3;
	private JTextField txtApellido3;
	private JTextField txtTelefono3;
	private JTextField txtCorreo3;
	private JTextField txtUsuario3;
	private JTextField Contrasena3;
	private JTextField Confirmacion3;
	private JMenuBar menuBar;
	private JMenu Menu1;
	private JMenuItem Usuario2;
	private JMenu Menu2;
	private JMenu Menu3;
	private JMenuItem E_usuario1;
	private JMenuItem E_usuario2;
	private JMenuItem E_usuario3;
	private JMenuItem A_usuario3;
	private JMenuItem A_usuario2;
	private JMenuItem A_usuario1;
	private JMenuItem Usuario3;
	private JMenuItem Usuario1;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana_principal frame = new Ventana_principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ventana_principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 911, 387);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Clientes Registrados");
		lblNewLabel.setBackground(Color.RED);
		lblNewLabel.setForeground(Color.ORANGE);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel.setBounds(37, 35, 191, 24);
		contentPane.add(lblNewLabel);
		
		table = new JTable();
		table.setBounds(37, 295, 830, -220);
		contentPane.add(table);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(37, 86, 97, 24);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Apellido");
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(144, 86, 95, 24);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Nombre usuario");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel_3.setBounds(249, 86, 103, 24);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Correo electronico");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel_4.setBounds(465, 86, 123, 24);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Telefono");
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel_5.setBounds(362, 86, 63, 24);
		contentPane.add(lblNewLabel_5);
		
		txtNombre1 = new JTextField();
		txtNombre1.setBounds(37, 132, 95, 20);
		contentPane.add(txtNombre1);
		txtNombre1.setColumns(10);
		
		txtApellido1 = new JTextField();
		txtApellido1.setBounds(144, 132, 95, 20);
		contentPane.add(txtApellido1);
		txtApellido1.setColumns(10);
		
		txtTelefono1 = new JTextField();
		txtTelefono1.setBounds(362, 132, 92, 20);
		contentPane.add(txtTelefono1);
		txtTelefono1.setColumns(10);
		
		
		JLabel lblNewLabel_6 = new JLabel("Contrase\u00F1a");
		lblNewLabel_6.setForeground(Color.WHITE);
		lblNewLabel_6.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel_6.setBounds(598, 91, 79, 14);
		contentPane.add(lblNewLabel_6);
		
		txtCorreo1 = new JTextField();
		txtCorreo1.setBounds(465, 132, 123, 20);
		contentPane.add(txtCorreo1);
		txtCorreo1.setColumns(10);
		
		txtUsuario1 = new JTextField();
		txtUsuario1.setBounds(249, 132, 103, 20);
		contentPane.add(txtUsuario1);
		txtUsuario1.setColumns(10);
		
		Contrasena1 = new JPasswordField();
		Contrasena1.setBounds(598, 132, 95, 20);
		contentPane.add(Contrasena1);
		
		JLabel lblNewLabel_7 = new JLabel("Confirmacion contrase\u00F1a");
		lblNewLabel_7.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel_7.setForeground(Color.WHITE);
		lblNewLabel_7.setBounds(708, 91, 177, 14);
		contentPane.add(lblNewLabel_7);
		
		Confirmacion1 = new JTextField();
		Confirmacion1.setBounds(708, 132, 159, 20);
		contentPane.add(Confirmacion1);
		Confirmacion1.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(48, 191, 24, -10);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		txtNombre2 = new JTextField();
		txtNombre2.setBounds(37, 163, 97, 20);
		contentPane.add(txtNombre2);
		txtNombre2.setColumns(10);
		
		txtApellido2 = new JTextField();
		txtApellido2.setBounds(144, 163, 95, 20);
		contentPane.add(txtApellido2);
		txtApellido2.setColumns(10);
		
		txtTelefono2 = new JTextField();
		txtTelefono2.setBounds(362, 161, 92, 20);
		contentPane.add(txtTelefono2);
		txtTelefono2.setColumns(10);
		
		txtCorreo2 = new JTextField();
		txtCorreo2.setBounds(465, 161, 123, 20);
		contentPane.add(txtCorreo2);
		txtCorreo2.setColumns(10);
		
		txtUsuario2 = new JTextField();
		txtUsuario2.setBounds(249, 163, 103, 20);
		contentPane.add(txtUsuario2);
		txtUsuario2.setColumns(10);
		
		Contrasena2 = new JTextField();
		Contrasena2.setBounds(598, 163, 95, 20);
		contentPane.add(Contrasena2);
		Contrasena2.setColumns(10);
		
		Confirmacion2 = new JTextField();
		Confirmacion2.setBounds(708, 161, 159, 20);
		contentPane.add(Confirmacion2);
		Confirmacion2.setColumns(10);
		
		txtNombre3 = new JTextField();
		txtNombre3.setBounds(37, 191, 97, 20);
		contentPane.add(txtNombre3);
		txtNombre3.setColumns(10);
		
		txtApellido3 = new JTextField();
		txtApellido3.setBounds(142, 191, 97, 20);
		contentPane.add(txtApellido3);
		txtApellido3.setColumns(10);
		
		txtTelefono3 = new JTextField();
		txtTelefono3.setBounds(362, 191, 92, 20);
		contentPane.add(txtTelefono3);
		txtTelefono3.setColumns(10);
		
		txtCorreo3 = new JTextField();
		txtCorreo3.setBounds(465, 191, 123, 20);
		contentPane.add(txtCorreo3);
		txtCorreo3.setColumns(10);
		
		txtUsuario3 = new JTextField();
		txtUsuario3.setBounds(249, 191, 103, 20);
		contentPane.add(txtUsuario3);
		txtUsuario3.setColumns(10);
		
		Contrasena3 = new JTextField();
		Contrasena3.setBounds(598, 191, 95, 20);
		contentPane.add(Contrasena3);
		Contrasena3.setColumns(10);
		
		Confirmacion3 = new JTextField();
		Confirmacion3.setBounds(708, 191, 159, 20);
		contentPane.add(Confirmacion3);
		Confirmacion3.setColumns(10);
		
		JButton Nuevo = new JButton("Nuevo");
		Nuevo.setFont(new Font("Arial", Font.BOLD, 16));
		Nuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				SqlUsuarios modSql = new SqlUsuarios();
				Usuarios mod = new Usuarios();
				
				String pass = new String(Contrasena1.getPassword());
				String passCon = new String(((JPasswordField) Confirmacion1).getPassword());
				
				if(mod.getNombre().isEmpty() || mod.getApellido().isEmpty() || mod.getNombre_Usuario().isEmpty() 
						|| mod.getTelefono().isEmpty() || mod.getCorreo_electronico().isEmpty() || mod.getConfirmacio_contraseña().isEmpty() )					
				{ 
					JOptionPane.showMessageDialog(null, "Error falta llenar campos", "ERROR",
						JOptionPane.ERROR_MESSAGE);
					
				} else { 
					if(pass.equals(passCon)){
						 modSql.registrar(mod); 
					
						 mod.setNombre(txtNombre1.getText());
						 mod.setApellido(txtApellido1.getText());
						 mod.setNombre_Usuario(txtUsuario1.getText());
			             mod.setTelefono(txtTelefono1.getText());
			             mod.setCorreo_electronico(txtCorreo1.getText());
						 mod.setContraseña(pass);
						 mod.setConfirmacio_contraseña(pass);
						
						 dispose();
						 JOptionPane.showMessageDialog(null, "Registro guardado", "EXITO",
								JOptionPane.INFORMATION_MESSAGE);
						 Ventana_Login Vp = new Ventana_Login();
						 Vp.setVisible(true);
					
				    }else {
						JOptionPane.showMessageDialog(null, "Las Contraseñas no coinciden", "ERROR",
								JOptionPane.ERROR_MESSAGE);
					}
				}	
			}
		});
		Nuevo.setBounds(51, 253, 141, 42);
		contentPane.add(Nuevo);
		
		JButton Actualizar = new JButton("Actualizar");
		Actualizar.setFont(new Font("Arial", Font.BOLD, 16));
		Actualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				SqlUsuarios modSql = new SqlUsuarios();
				Usuarios mod = new Usuarios();
				
				String pass = new String(Contrasena1.getPassword());
				String passCon = new String(((JPasswordField) Confirmacion1).getPassword());
				
				if(mod.getNombre().isEmpty() || mod.getApellido().isEmpty() || mod.getNombre_Usuario().isEmpty() 
						|| mod.getTelefono().isEmpty() || mod.getCorreo_electronico().isEmpty() || mod.getConfirmacio_contraseña().isEmpty() )					
				{ 
					JOptionPane.showMessageDialog(null, "Error falta llenar campos", "ERROR",
						JOptionPane.ERROR_MESSAGE);
					
				} else { 
					if(pass.equals(passCon)){
						 modSql.registrar(mod); 
					
						 mod.setNombre(txtNombre1.getText().trim());
						 mod.setNombre_Usuario(txtUsuario1.getText().trim());
			             mod.setTelefono(txtTelefono1.getText().trim());
			             mod.setCorreo_electronico(txtCorreo1.getText().trim());
						 mod.setContraseña(pass.trim());
						 mod.setConfirmacio_contraseña(passCon.trim());
						
						 dispose();
						 JOptionPane.showConfirmDialog(null, "Registro actualizado", "EXITO",
								JOptionPane.INFORMATION_MESSAGE);
						 Ventana_Login Vp = new Ventana_Login();
						 Vp.setVisible(true);
					
				    }else {
						JOptionPane.showMessageDialog(null, "Las Contraseñas no coinciden", "ERROR",
								JOptionPane.ERROR_MESSAGE);
					}
				
				
				dispose();
				Ventana_principal Vp = new Ventana_principal();
				Vp.setVisible(true);
				}
			}
		});
		Actualizar.setBounds(249, 253, 141, 42);
		contentPane.add(Actualizar);
		
		JButton Eliminar = new JButton("Eliminar");
		Eliminar.setFont(new Font("Arial", Font.BOLD, 16));
		Eliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				SqlUsuarios modSql = new SqlUsuarios();
				Usuarios mod = new Usuarios();
				
				String pass = new String(Contrasena1.getPassword());
				String passCon = new String(((JPasswordField) Confirmacion1).getPassword());
				
				if(mod.getNombre().isEmpty() || mod.getApellido().isEmpty() || mod.getNombre_Usuario().isEmpty() 
						|| mod.getTelefono().isEmpty() || mod.getCorreo_electronico().isEmpty() || mod.getConfirmacio_contraseña().isEmpty() )					
				{ 
					JOptionPane.showMessageDialog(null, "Error falta llenar campos", "ERROR",
						JOptionPane.ERROR_MESSAGE);
					
				} else { 
					if(pass.equals(passCon)){
						 modSql.registrar(mod); 
					
						 mod.setNombre(txtNombre1.getText().trim());
						 mod.setNombre_Usuario(txtUsuario1.getText().trim());
			             mod.setTelefono(txtTelefono1.getText().trim());
			             mod.setCorreo_electronico(txtCorreo1.getText().trim());
						 mod.setContraseña(pass.trim());
						 mod.setConfirmacio_contraseña(passCon.trim());
						
						 dispose();
						 JOptionPane.showConfirmDialog(null, "Registro guardado", "EXITO",
								JOptionPane.INFORMATION_MESSAGE);
						 Ventana_Login Vp = new Ventana_Login();
						 Vp.setVisible(true);
					
				    }else {
						JOptionPane.showMessageDialog(null, "Las Contraseñas no coinciden", "ERROR",
								JOptionPane.ERROR_MESSAGE);
					}
				
				}
				dispose();
				Ventana_principal Vp = new Ventana_principal();
				Vp.setVisible(true);
			}
		});
		Eliminar.setBounds(453, 253, 135, 42);
		contentPane.add(Eliminar);
		
		JButton Cerrar_sesion = new JButton("Cerrar sesion");
		Cerrar_sesion.setFont(new Font("Arial", Font.BOLD, 16));
		Cerrar_sesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				Ventana_Login Vl = new Ventana_Login();
				Vl.setVisible(true);
				
			}
		});
		Cerrar_sesion.setBounds(640, 253, 153, 42);
		contentPane.add(Cerrar_sesion);
		
		menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 916, 22);
		contentPane.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Registro");
		mnNewMenu.setBackground(new Color(64, 64, 64));
		mnNewMenu.setForeground(Color.GREEN);
		menuBar.add(mnNewMenu);
		
		Menu1 = new JMenu("Nuevo");
		mnNewMenu.add(Menu1);
		
		Usuario1 = new JMenuItem("New menu item");
		Menu1.add(Usuario1);
		
		Usuario2 = new JMenuItem("New menu item");
		Menu1.add(Usuario2);
		
		Usuario3 = new JMenuItem("New menu item");
		Menu1.add(Usuario3);
		
		Menu2 = new JMenu("Actualizar");
		mnNewMenu.add(Menu2);
		
		A_usuario1 = new JMenuItem("New menu item");
		Menu2.add(A_usuario1);
		
		A_usuario2 = new JMenuItem("New menu item");
		Menu2.add(A_usuario2);
		
		A_usuario3 = new JMenuItem("New menu item");
		Menu2.add(A_usuario3);
		
		Menu3 = new JMenu("Eliminar");
		mnNewMenu.add(Menu3);
		
		E_usuario1 = new JMenuItem("New menu item");
		Menu3.add(E_usuario1);
		
		E_usuario2 = new JMenuItem("New menu item");
		Menu3.add(E_usuario2);
		
		E_usuario3 = new JMenuItem("New menu item");
		Menu3.add(E_usuario3);
	    }
}
