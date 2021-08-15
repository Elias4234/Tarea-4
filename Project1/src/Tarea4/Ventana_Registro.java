package Tarea4;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Ventana_Registro extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtUsuario;
	private JPasswordField Contrasena;
	private JPasswordField Confirmacion;
	private JTextField txtTelefono;
	private JTextField txtCorreo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana_Registro frame = new Ventana_Registro();
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
	public Ventana_Registro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 427, 489);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Registro");
		lblNewLabel.setForeground(Color.GREEN);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel.setBounds(147, 11, 101, 32);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel_1.setBounds(23, 79, 68, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Apellido");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel_2.setBounds(23, 124, 68, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Nombre de usuario");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel_3.setBounds(23, 167, 134, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Contrase\u00F1a");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel_4.setBounds(23, 297, 92, 14);
		contentPane.add(lblNewLabel_4);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(211, 76, 146, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtApellido = new JTextField();
		txtApellido.setBounds(211, 121, 146, 20);
		contentPane.add(txtApellido);
		txtApellido.setColumns(10);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(211, 164, 146, 20);
		contentPane.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Confirmacion de contrase\u00F1a");
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel_5.setBounds(23, 333, 184, 14);
		contentPane.add(lblNewLabel_5);
		
		JButton btnNewButton = new JButton("Registrar");
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 14));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			 
				SqlUsuarios modSql = new SqlUsuarios();
				Usuarios mod = new Usuarios();
				
				String pass = new String(Contrasena.getPassword());
				String passCon = new String(Confirmacion.getPassword());
				
				if(mod.getNombre().isEmpty() || mod.getApellido().isEmpty() || mod.getNombre_Usuario().isEmpty() 
						|| mod.getTelefono().isEmpty() || mod.getCorreo_electronico().isEmpty() || mod.getConfirmacio_contraseña().isEmpty() )					
				{ 
					JOptionPane.showMessageDialog(null, "Error falta llenar campos", "ERROR",
						JOptionPane.ERROR_MESSAGE);
					
				} else { 
					if(pass.equals(passCon)){
						 modSql.registrar(mod); 
					
						 mod.setNombre(txtNombre.getText());
						 mod.setApellido(txtApellido.getText());
						 mod.setNombre_Usuario(txtUsuario.getText());
			             mod.setTelefono(txtTelefono.getText());
			             mod.setCorreo_electronico(txtCorreo.getText());
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
		btnNewButton.setBounds(133, 391, 134, 32);
		contentPane.add(btnNewButton);
		
		Contrasena = new JPasswordField();
		Contrasena.setBounds(211, 294, 146, 20);
		contentPane.add(Contrasena);
		
		Confirmacion = new JPasswordField();
		Confirmacion.setBounds(211, 330, 146, 20);
		contentPane.add(Confirmacion);
		
		JLabel lblNewLabel_6 = new JLabel("Telefono");
		lblNewLabel_6.setForeground(Color.WHITE);
		lblNewLabel_6.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel_6.setBounds(23, 206, 92, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Correo electronico");
		lblNewLabel_7.setForeground(Color.WHITE);
		lblNewLabel_7.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel_7.setBounds(23, 253, 128, 14);
		contentPane.add(lblNewLabel_7);
		
		txtTelefono = new JTextField();
		txtTelefono.setBounds(211, 203, 146, 20);
		contentPane.add(txtTelefono);
		txtTelefono.setColumns(10);
		
		txtCorreo = new JTextField();
		txtCorreo.setBounds(211, 250, 146, 20);
		contentPane.add(txtCorreo);
		txtCorreo.setColumns(10);
	}

}
