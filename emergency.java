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
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class emergency extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					emergency frame = new emergency();
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
	public emergency() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1200, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel_6 = new JLabel("Address");
		lblNewLabel_6.setForeground(new Color(192, 192, 192));
		lblNewLabel_6.setBounds(341, 194, 155, 14);
		contentPane.add(lblNewLabel_6);

		JLabel lblNewLabel_5 = new JLabel("Contact Number");
		lblNewLabel_5.setForeground(new Color(192, 192, 192));
		lblNewLabel_5.setBounds(341, 135, 155, 14);
		contentPane.add(lblNewLabel_5);

		JLabel lblNewLabel_4 = new JLabel("Relationship");
		lblNewLabel_4.setForeground(new Color(192, 192, 192));
		lblNewLabel_4.setBounds(106, 194, 390, 14);
		contentPane.add(lblNewLabel_4);

		JLabel lblNewLabel_3 = new JLabel("Guardian's Name");
		lblNewLabel_3.setForeground(new Color(192, 192, 192));
		lblNewLabel_3.setBounds(106, 135, 390, 14);
		contentPane.add(lblNewLabel_3);

		JButton btnNewButton = new JButton("DONE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Registration complete");
			}
		});
		btnNewButton.setBounds(251, 282, 89, 23);
		contentPane.add(btnNewButton);

		textField_3 = new JTextField();
		textField_3.setBounds(343, 208, 153, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);

		textField = new JTextField();
		textField.setBounds(106, 148, 153, 20);
		contentPane.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setBounds(106, 208, 153, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setBounds(343, 148, 153, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("IN CASE OF EMERGENCY");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setForeground(new Color(192, 192, 192));
		lblNewLabel_2.setBounds(217, 63, 208, 14);
		contentPane.add(lblNewLabel_2);

		JLabel lblNewLabel_1 = new JLabel("Student Registration Form");
		lblNewLabel_1.setForeground(new Color(192, 192, 192));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setBounds(189, 38, 256, 14);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 0, 1194, 593);
		lblNewLabel.setIcon(new ImageIcon("D:\\eclipse-workspace\\toni\\src\\images\\kinukulayan2.png"));
		contentPane.add(lblNewLabel);
	}

}
