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
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Family extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_9;
	private JLabel lblNewLabel_10;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Family frame = new Family();
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
	public Family() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1200, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		btnNewButton = new JButton("Next");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				emergency second = new emergency();
				second.setVisible(true);
			}
		});
		btnNewButton.setBounds(248, 391, 89, 23);
		contentPane.add(btnNewButton);

		lblNewLabel_8 = new JLabel("Name");
		lblNewLabel_8.setForeground(new Color(192, 192, 192));
		lblNewLabel_8.setBounds(347, 158, 46, 14);
		contentPane.add(lblNewLabel_8);

		lblNewLabel_10 = new JLabel("Contact Number");
		lblNewLabel_10.setForeground(new Color(192, 192, 192));
		lblNewLabel_10.setBounds(347, 284, 88, 14);
		contentPane.add(lblNewLabel_10);

		lblNewLabel_9 = new JLabel("Date of Birth");
		lblNewLabel_9.setForeground(new Color(192, 192, 192));
		lblNewLabel_9.setBounds(347, 224, 88, 14);
		contentPane.add(lblNewLabel_9);

		lblNewLabel_7 = new JLabel("Contact Number");
		lblNewLabel_7.setForeground(new Color(192, 192, 192));
		lblNewLabel_7.setBounds(98, 284, 86, 14);
		contentPane.add(lblNewLabel_7);

		lblNewLabel_6 = new JLabel("Date of Birth");
		lblNewLabel_6.setForeground(new Color(192, 192, 192));
		lblNewLabel_6.setBounds(98, 224, 74, 14);
		contentPane.add(lblNewLabel_6);

		lblNewLabel_5 = new JLabel("Name");
		lblNewLabel_5.setForeground(new Color(192, 192, 192));
		lblNewLabel_5.setBounds(98, 158, 46, 14);
		contentPane.add(lblNewLabel_5);

		textField_2 = new JTextField();
		textField_2.setBounds(98, 296, 144, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);

		textField_5 = new JTextField();
		textField_5.setBounds(347, 296, 163, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);

		textField = new JTextField();
		textField.setBounds(98, 171, 144, 20);
		contentPane.add(textField);
		textField.setColumns(10);

		textField_3 = new JTextField();
		textField_3.setBounds(347, 171, 163, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setBounds(98, 236, 144, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);

		textField_4 = new JTextField();
		textField_4.setBounds(347, 236, 163, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);

		JLabel lblNewLabel_3 = new JLabel("FATHER");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setForeground(new Color(192, 192, 192));
		lblNewLabel_3.setBounds(98, 129, 74, 14);
		contentPane.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("MOTHER");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_4.setForeground(new Color(192, 192, 192));
		lblNewLabel_4.setBounds(347, 129, 81, 14);
		contentPane.add(lblNewLabel_4);

		JLabel lblNewLabel_1 = new JLabel("Student Registration Form");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setForeground(new Color(192, 192, 192));
		lblNewLabel_1.setBounds(188, 47, 268, 14);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("FAMILY INFORMATION");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setForeground(new Color(192, 192, 192));
		lblNewLabel_2.setBounds(218, 72, 217, 14);
		contentPane.add(lblNewLabel_2);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(0, 0, 1194, 593);
		lblNewLabel.setIcon(new ImageIcon("D:\\eclipse-workspace\\toni\\src\\images\\kinukulayan2.png"));
		contentPane.add(lblNewLabel);
	}

}
