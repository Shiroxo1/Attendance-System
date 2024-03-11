package toni;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class login extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField username;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login frame = new login();
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
	public login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1200, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel_4 = new JLabel("Management System");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_4.setForeground(new Color(192, 192, 192));
		lblNewLabel_4.setBounds(211, 118, 221, 20);
		contentPane.add(lblNewLabel_4);

		JLabel lblNewLabel_3 = new JLabel("Sign In to Web Attendance ");
		lblNewLabel_3.setForeground(new Color(192, 192, 192));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_3.setBounds(184, 87, 248, 20);
		contentPane.add(lblNewLabel_3);

		passwordField = new JPasswordField();
		passwordField.setBounds(180, 309, 231, 20);
		contentPane.add(passwordField);

		JButton btnNewButton_1 = new JButton("Sign up");
		btnNewButton_1.setBounds(313, 390, 89, 23);
		contentPane.add(btnNewButton_1);

		JButton btnNewButton = new JButton("Sign in");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String user = username.getText();
				String password = passwordField.getText();
				if (user.equals("user") && password.equals("password")) {
					JOptionPane.showMessageDialog(null, "Login Success!");

					main second = new main();
					second.setVisible(true);
					dispose();
				} else {
					JOptionPane.showMessageDialog(null, "Login Failed!");
				}
			}
		});
		btnNewButton.setBounds(183, 390, 89, 23);
		contentPane.add(btnNewButton);

		username = new JTextField();
		username.setBounds(180, 226, 231, 20);
		contentPane.add(username);
		username.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("User");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(180, 195, 118, 20);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setBounds(180, 268, 118, 20);
		contentPane.add(lblNewLabel_2);

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("D:\\eclipse-workspace\\toni\\src\\images\\kinukulayan2.png"));
		lblNewLabel.setBounds(0, 0, 1184, 561);
		contentPane.add(lblNewLabel);
	}
}
