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

public class Educational extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Educational frame = new Educational();
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
	public Educational() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1200, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel_3 = new JLabel("Grade & Section");
		lblNewLabel_3.setForeground(new Color(192, 192, 192));
		lblNewLabel_3.setBounds(134, 128, 115, 14);
		contentPane.add(lblNewLabel_3);

		JLabel lblNewLabel_7 = new JLabel("Class Adviserv");
		lblNewLabel_7.setForeground(new Color(192, 192, 192));
		lblNewLabel_7.setBounds(134, 373, 115, 14);
		contentPane.add(lblNewLabel_7);

		JLabel lblNewLabel_4 = new JLabel("Track & Strand");
		lblNewLabel_4.setForeground(new Color(192, 192, 192));
		lblNewLabel_4.setBounds(134, 195, 115, 14);
		contentPane.add(lblNewLabel_4);

		JLabel lblNewLabel_5 = new JLabel("Student Number");
		lblNewLabel_5.setForeground(new Color(192, 192, 192));
		lblNewLabel_5.setBounds(134, 253, 103, 14);
		contentPane.add(lblNewLabel_5);

		JLabel lblNewLabel_6 = new JLabel("Learner's Reference Number (LRN)");
		lblNewLabel_6.setForeground(new Color(192, 192, 192));
		lblNewLabel_6.setBounds(134, 313, 289, 14);
		contentPane.add(lblNewLabel_6);

		JButton btnNewButton = new JButton("Next");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Family second = new Family();
				second.setVisible(true);
			}
		});
		btnNewButton.setBounds(253, 456, 89, 23);
		contentPane.add(btnNewButton);

		textField_5 = new JTextField();
		textField_5.setBounds(134, 143, 325, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);

		textField_3 = new JTextField();
		textField_3.setBounds(134, 326, 325, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);

		textField_4 = new JTextField();
		textField_4.setBounds(134, 385, 325, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setBounds(134, 208, 325, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setBounds(134, 266, 325, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("EDUCATIONAL BACKGROUND");
		lblNewLabel_2.setForeground(new Color(192, 192, 192));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(196, 74, 216, 14);
		contentPane.add(lblNewLabel_2);

		JLabel lblNewLabel_1 = new JLabel("Student Registration Form");
		lblNewLabel_1.setForeground(new Color(192, 192, 192));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setBounds(186, 49, 237, 14);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setForeground(new Color(192, 192, 192));
		lblNewLabel.setBounds(0, 0, 1194, 593);
		lblNewLabel.setIcon(new ImageIcon("D:\\eclipse-workspace\\toni\\src\\images\\kinukulayan2.png"));
		contentPane.add(lblNewLabel);
	}

}
