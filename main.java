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

public class main extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtAsd;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JLabel label;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_9;
	private JLabel lblNewLabel_10;
	private JLabel lblNewLabel_11;
	private JLabel lblNewLabel_12;
	private JLabel lblNewLabel_13;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main frame = new main();
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
	public main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1200, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		lblNewLabel_12 = new JLabel("Permanent Address");
		lblNewLabel_12.setForeground(new Color(192, 192, 192));
		lblNewLabel_12.setBounds(328, 285, 154, 14);
		contentPane.add(lblNewLabel_12);

		lblNewLabel_13 = new JLabel("Zip Code");
		lblNewLabel_13.setForeground(new Color(192, 192, 192));
		lblNewLabel_13.setBounds(328, 344, 154, 14);
		contentPane.add(lblNewLabel_13);

		lblNewLabel_4 = new JLabel("Date of Birth");
		lblNewLabel_4.setForeground(new Color(192, 192, 192));
		lblNewLabel_4.setBounds(82, 285, 154, 14);
		contentPane.add(lblNewLabel_4);

		lblNewLabel_7 = new JLabel("Place of Birth");
		lblNewLabel_7.setForeground(new Color(192, 192, 192));
		lblNewLabel_7.setBounds(82, 344, 154, 14);
		contentPane.add(lblNewLabel_7);

		lblNewLabel_9 = new JLabel("Email Address");
		lblNewLabel_9.setForeground(new Color(192, 192, 192));
		lblNewLabel_9.setBounds(328, 188, 154, 14);
		contentPane.add(lblNewLabel_9);

		lblNewLabel_2 = new JLabel("Gender");
		lblNewLabel_2.setForeground(new Color(192, 192, 192));
		lblNewLabel_2.setBounds(82, 188, 154, 14);
		contentPane.add(lblNewLabel_2);

		lblNewLabel_10 = new JLabel("Contact Number");
		lblNewLabel_10.setForeground(new Color(192, 192, 192));
		lblNewLabel_10.setBounds(328, 242, 154, 14);
		contentPane.add(lblNewLabel_10);

		lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setForeground(new Color(192, 192, 192));
		lblNewLabel_1.setBounds(82, 134, 154, 14);
		contentPane.add(lblNewLabel_1);

		lblNewLabel_3 = new JLabel("Civil Status");
		lblNewLabel_3.setForeground(new Color(192, 192, 192));
		lblNewLabel_3.setBounds(82, 242, 154, 14);
		contentPane.add(lblNewLabel_3);

		lblNewLabel_8 = new JLabel("Citizenship");
		lblNewLabel_8.setForeground(new Color(192, 192, 192));
		lblNewLabel_8.setBounds(328, 134, 154, 14);
		contentPane.add(lblNewLabel_8);

		lblNewLabel_11 = new JLabel("");
		lblNewLabel_11.setBounds(328, 344, 46, 14);
		contentPane.add(lblNewLabel_11);

		textField_10 = new JTextField();
		textField_10.setBounds(328, 355, 154, 20);
		contentPane.add(textField_10);
		textField_10.setColumns(10);

		textField_5 = new JTextField();
		textField_5.setBounds(82, 355, 154, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);

		textField_7 = new JTextField();
		textField_7.setBounds(328, 202, 154, 20);
		contentPane.add(textField_7);
		textField_7.setColumns(10);

		textField_9 = new JTextField();
		textField_9.setBounds(328, 301, 154, 20);
		contentPane.add(textField_9);
		textField_9.setColumns(10);

		textField_8 = new JTextField();
		textField_8.setBounds(328, 254, 154, 20);
		contentPane.add(textField_8);
		textField_8.setColumns(10);

		textField_6 = new JTextField();
		textField_6.setBounds(328, 147, 154, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);

		lblNewLabel_6 = new JLabel("PERSONAL INFORMATION");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_6.setForeground(new Color(192, 192, 192));
		lblNewLabel_6.setBounds(185, 89, 189, 14);
		contentPane.add(lblNewLabel_6);

		lblNewLabel_5 = new JLabel("Student Registration Form");
		lblNewLabel_5.setForeground(new Color(192, 192, 192));
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_5.setBounds(161, 61, 253, 17);
		contentPane.add(lblNewLabel_5);

		JButton btnNewButton = new JButton("Next");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Educational second = new Educational();
				second.setVisible(true);
			}
		});
		btnNewButton.setBounds(241, 446, 89, 23);
		contentPane.add(btnNewButton);

		txtAsd = new JTextField();
		txtAsd.setBounds(82, 147, 154, 20);
		contentPane.add(txtAsd);
		txtAsd.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setBounds(82, 201, 154, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setBounds(82, 254, 154, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);

		textField_3 = new JTextField();
		textField_3.setBounds(82, 301, 154, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setForeground(new Color(192, 192, 192));
		lblNewLabel.setBounds(0, 0, 1184, 561);
		lblNewLabel.setIcon(new ImageIcon("D:\\eclipse-workspace\\toni\\src\\images\\kinukulayan2.png"));
		contentPane.add(lblNewLabel);

		label = new JLabel("New label");
		label.setBounds(265, 64, 46, 14);
		contentPane.add(label);
	}
}
