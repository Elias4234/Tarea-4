package Tarea4;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Ventana_Login extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPasswordField passwordField;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana_Login frame = new Ventana_Login();
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
	public Ventana_Login() {
		getContentPane().setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 475, 269);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLUE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("LOGIN");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel.setBounds(155, 23, 82, 26);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Usuario");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(31, 82, 56, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Contrase\u00F1a");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBackground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2.setBounds(31, 123, 89, 14);
		contentPane.add(lblNewLabel_2);
		
		setPasswordField(new JPasswordField());
		getPasswordField().addKeyListener(new KeyAdapter() {
			@SuppressWarnings("deprecation")
			@Override
			public void keyPressed(KeyEvent e) {
				/**
				int var = e.getKeyCode();
				
				if(var == KeyEvent.VK_ENTER);
				
				String Usuario = getTextField().getText();
				String Contraseña = getPasswordField().getText();
				
				Usuarios us = new Usuarios();
				
				if(Usuario.isEmpty() || Contraseña.isEmpty())
				{
					JOptionPane.showMessageDialog(null, "Algun campo esta vacio");
				}
				else
				{
					try
					{
						Object[] [] itemUsuario = us.Acceder(Usuario, us.MD5(Contraseña));
						@SuppressWarnings("unused")
						String x_idUsuario = itemUsuario[0] [0].toString();
						String x_Usuario = itemUsuario[0] [1].toString();
						String x_Contrasena = itemUsuario[0] [2].toString();
						
						if((x_Usuario != "" ) && (x_Contrasena != ""))
						{
							JOptionPane.showMessageDialog(null, "Bienvenido"+ x_Usuario);
						}else 
						{
							JOptionPane.showMessageDialog(null, " El usuario o contrasena no existe ");
						}
					}catch(Exception ev) {
						JOptionPane.showMessageDialog(null, ev, "Su usuario no existe",
								JOptionPane.INFORMATION_MESSAGE);
					}
				} */
			}
		});
		getPasswordField().setBounds(125, 121, 142, 20);
		contentPane.add(getPasswordField());
		
		setTextField(new JTextField());
		getTextField().setBounds(125, 80, 142, 20);
		contentPane.add(getTextField());
		getTextField().setColumns(10);
		
		JButton btnNewButton = new JButton("Entrar");
		btnNewButton.addActionListener(new ActionListener() {
			
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				
				try {
					ConexionMySQL con = new ConexionMySQL();
					String u = getTextField().getText();
					String p = getPasswordField().getText();
					con.ConectarBasedeDatos();
					String resultado1 = "";
					
					String stSQL = "SELECT idventana_registro, Nombre de Usuario, Contraseña WHERE Nombre de usuario = '"+ u +"' AND Contraseña ='"+ p +"'";
					
					con.resultado = con.resultado.executeQuery(p);
					if(con.resultado.next()) {
						
						dispose();
						JOptionPane.showConfirmDialog(null, "Bienvenido al Sistema", "INGRESASTE",
								JOptionPane.INFORMATION_MESSAGE);
						Ventana_principal Vp = new Ventana_principal();
						Vp.setVisible(true);
						
					}else { 
						JOptionPane.showConfirmDialog(null, "Usuario o Contrasena son incorrectos", "ERROR",
								JOptionPane.INFORMATION_MESSAGE);
					}
					
					getTextField().setText("");
					getPasswordField().setText("");
					getTextField().requestFocus();
					
				} catch(Exception ex) {
					JOptionPane.showMessageDialog(null, ex, "ERROR", 
							JOptionPane.INFORMATION_MESSAGE);
				
			}
			}
		});
				
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBackground(Color.CYAN);
		btnNewButton.setBounds(125, 167, 142, 26);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Registrarse");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				Ventana_Registro VR = new Ventana_Registro();
				VR.setVisible(true);
				
			}
		});
		btnNewButton_1.setBackground(Color.CYAN);
		btnNewButton_1.setBounds(313, 47, 118, 26);
		contentPane.add(btnNewButton_1);
        }

	public JPasswordField getPasswordField() {
		return passwordField;
	}

	public void setPasswordField(JPasswordField passwordField) {
		this.passwordField = passwordField;
	}

	public JTextField getTextField() {
		return textField;
	}

	public void setTextField(JTextField textField) {
		this.textField = textField;
	}
}
		
