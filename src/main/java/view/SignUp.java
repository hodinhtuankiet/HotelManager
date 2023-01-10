package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JPasswordField;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;
import java.awt.SystemColor;

public class SignUp extends JFrame {

	private JPanel contentPane;
	private JTextField txtSignUp;
	private JTextField textField;
	private JTextField textField_1;
	public JTextField textField_user;
	private JTextField textField_5;
	public JPasswordField passwordField;
	private JPasswordField passwordField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUp frame = new SignUp();
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
	public SignUp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 718, 627);
		Border b = BorderFactory.createLineBorder(Color.WHITE, 2);
//		setUndecorated(true);
		setLocationRelativeTo(null);
		ImageIcon icon = new ImageIcon("bun.jpg");
		setIconImage(icon.getImage());
		setTitle("Dinh Tuan Kiet");
		contentPane = new JPanel();
		contentPane.setBackground(new Color(160, 82, 45));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBorder(b);
		
		setContentPane(contentPane);
		contentPane.setLayout(null);

		txtSignUp = new JTextField();
		txtSignUp.setBackground(SystemColor.activeCaption);
		txtSignUp.setForeground(new Color(255, 255, 255));
		txtSignUp.setFont(new Font("Tahoma", Font.BOLD, 34));
		txtSignUp.setText("Sign Up");
		txtSignUp.setHorizontalAlignment(SwingConstants.CENTER);
		txtSignUp.setBounds(135, 31, 418, 70);
		contentPane.add(txtSignUp);
		txtSignUp.setColumns(10);

		JLabel lblNewLabel = new JLabel("User: ");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(76, 209, 97, 79);
		contentPane.add(lblNewLabel);

		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPassword.setBounds(76, 264, 112, 79);
		contentPane.add(lblPassword);

		JLabel lblConfirmPassword = new JLabel("Confirm Password:");
		lblConfirmPassword.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblConfirmPassword.setBounds(76, 335, 212, 70);
		contentPane.add(lblConfirmPassword);

		JLabel lblGmail = new JLabel("Gmail:");
		lblGmail.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblGmail.setBounds(76, 388, 97, 79);
		contentPane.add(lblGmail);

		JLabel lblName = new JLabel("Surname: ");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblName.setBounds(76, 154, 112, 70);
		contentPane.add(lblName);

		JLabel lblFirtname = new JLabel("FirstName: ");
		lblFirtname.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblFirtname.setBounds(352, 154, 136, 70);
		contentPane.add(lblFirtname);

		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField.setBounds(180, 168, 142, 43);
		contentPane.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_1.setBounds(453, 168, 136, 43);
		contentPane.add(textField_1);
		textField_1.setColumns(10);

		textField_user = new JTextField();
		textField_user.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_user.setBounds(180, 227, 206, 43);
		contentPane.add(textField_user);
		textField_user.setColumns(10);

		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_5.setColumns(10);
		textField_5.setBounds(183, 406, 305, 43);
		contentPane.add(textField_5);

		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		passwordField.setBounds(177, 282, 212, 43);
		contentPane.add(passwordField);

		passwordField_1 = new JPasswordField();
		passwordField_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		passwordField_1.setBounds(230, 349, 247, 43);
		contentPane.add(passwordField_1);

		JButton btnNewButton = new JButton("Sign Up");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Login().setVisible(true);
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton.setBounds(164, 531, 124, 43);
		contentPane.add(btnNewButton);

		JLabel lblNewLabel_1 = new JLabel(">>Already have an account , Click here !");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				new Login().setVisible(true);
				dispose();
			}
		});
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(366, 459, 329, 25);
		contentPane.add(lblNewLabel_1);
		
		Border border = BorderFactory.createLineBorder(Color.white, 2);
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(39, 136, 640, 374);
		contentPane.add(lblNewLabel_2);
		lblNewLabel_2.setBorder(border);
		
		JButton btnLogIn = new JButton("Log in");
		btnLogIn.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnLogIn.setBounds(409, 531, 124, 43);
		contentPane.add(btnLogIn);
	}
}
