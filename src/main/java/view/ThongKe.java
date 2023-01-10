package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JLabel;

public class ThongKe extends JFrame {

	private JPanel contentPane;
	private JTextField txtThngKNgy;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ThongKe frame = new ThongKe();
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
	public ThongKe() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 959, 727);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtThngKNgy = new JTextField();
		txtThngKNgy.setHorizontalAlignment(SwingConstants.CENTER);
		txtThngKNgy.setFont(new Font("Tahoma", Font.PLAIN, 30));
		txtThngKNgy.setText("Thống Kê Ngày Hôm Nay");
		txtThngKNgy.setBounds(245, 21, 457, 68);
		contentPane.add(txtThngKNgy);
		txtThngKNgy.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Số tiền thu được:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(56, 154, 173, 56);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(239, 169, 214, 37);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblSKhchHng = new JLabel("Số khách hàng:");
		lblSKhchHng.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblSKhchHng.setBounds(56, 227, 153, 56);
		contentPane.add(lblSKhchHng);
		
		textField_1 = new JTextField();
		textField_1.setBounds(239, 241, 214, 37);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
	}

}
