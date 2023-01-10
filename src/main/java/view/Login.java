package view;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.Image;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFormattedTextField;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JToolBar;
import view.SignUp;
public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	SignUp sign;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Login(SignUp sign) throws HeadlessException {
		super();
		this.sign = sign;
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 684, 492);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		setTitle("Dinh Tuan Kiet");
		contentPane.setBackground(new Color(26, 26, 26));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
//		ImageIcon icon = new ImageIcon("login.jpg");
//		setIconImage(icon.getImage());
		ImageIcon icon = new ImageIcon("bun.jpg");
		setIconImage(icon.getImage());
		Border b = BorderFactory.createLineBorder(Color.BLACK, 1);

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("Username: ");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1.setBounds(88, 124, 108, 55);
		contentPane.add(lblNewLabel_1);

		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField.setBounds(206, 135, 249, 35);
		contentPane.add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("Password:");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_2.setBounds(88, 184, 95, 55);
		contentPane.add(lblNewLabel_2);

		JCheckBox chckbxNewCheckBox = new JCheckBox(" Remember Password");
		chckbxNewCheckBox.setForeground(Color.WHITE);
		chckbxNewCheckBox.setBackground(new Color(27, 27, 27));
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 14));
		chckbxNewCheckBox.setBounds(206, 249, 202, 21);
		contentPane.add(chckbxNewCheckBox);

		JButton btnNewButton = new JButton("Log In");
		btnNewButton.setBackground(Color.RED);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				check();
			}
		});
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 20));
		btnNewButton.setBounds(206, 299, 249, 41);
		contentPane.add(btnNewButton);
		btnNewButton.setBorder(b);

		JButton btnCancle = new JButton("Cancle");
		btnCancle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				passwordField.setText("");
			}
		});
		btnCancle.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnCancle.setBounds(69, 400, 114, 41);
		contentPane.add(btnCancle);

		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		passwordField.setBounds(206, 195, 249, 35);
		contentPane.add(passwordField);

		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnExit.setBounds(511, 400, 108, 41);
		contentPane.add(btnExit);

		JButton btnNewButton_1 = new JButton("Log In");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setFont(new Font("Arial", Font.BOLD, 35));
		btnNewButton_1.setBackground(SystemColor.textHighlight);
		btnNewButton_1.setBounds(201, 10, 249, 66);
		contentPane.add(btnNewButton_1);
		btnNewButton_1.setBorder(b);
		
		JLabel lblNewLabel = new JLabel("don't have account >> Click here !");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new SignUp().setVisible(true);
				dispose();
			}
		});
		Border b1 = BorderFactory.createLineBorder(Color.RED,2);
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(329, 276, 221, 13);
		contentPane.add(lblNewLabel);
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(49, 101, 558, 289);
		contentPane.add(lblNewLabel_3);
		lblNewLabel_3.setBorder(b1);
	}

	public void check() {
		String username = textField.getText();
		String password = new String(passwordField.getPassword());
		if (username.equals("hodinhtuankiet") && password.equals("1")) {
			JOptionPane.showMessageDialog(this, "chào bro , đặt phòng khách sạn nào");
			new TrangChu().setVisible(true);
			this.dispose();
		}else if(textField.getText().equals("")|| passwordField.getPassword().equals("")) {
			JOptionPane.showMessageDialog(this, "Cmm chưa ghi đéo gì đòi đăng nhập");
		}
		else {
			JOptionPane.showMessageDialog(this, "Login Fail", "Warning", JOptionPane.ERROR_MESSAGE);
		}
//		String pass = String.valueOf(passwordField.getPassword());
//		String user = this.sign.textField_user.getText();
//		if (username.equals(pass) && password.equals(user)) {
//			JOptionPane.showMessageDialog(this, "Hi HoDinhTuan Kiet" + " Login Successfull");
//			new TrangChu().setVisible(true);
//			this.dispose();
//		} else {
//			JOptionPane.showMessageDialog(this, "Login Fail", "Warning", JOptionPane.ERROR_MESSAGE);
//		}
	}
}
