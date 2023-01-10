package view;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.HeadlessException;
import java.sql.Date;

import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import java.awt.Color;

public class inBill extends JFrame {

	private JPanel contentPane;
	private String nameCustomer;
	private String date_check;
	private String staff;
	private String room;
	private String date_pay;
	private String total;
	private JLabel lblNewLabel_pay;
	private JLabel lblNewLabel_room;
	private JLabel lblNewLabel_total;
	private JLabel lblNewLabel_namecustomer;
	private JLabel lblNewLabel_checkin;
	private JLabel lblNewLabel_staff;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					inBill frame = new inBill();
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
	//String nameCustomer,String date_check,String staff,String room,String date_pay,String total
	public inBill(String nameCustomer,String date_check,String staff,String room,String date_pay,String total) {
		this.init();
		this.nameCustomer = nameCustomer;
		this.date_check = date_check;
		this.staff = staff;
		this.room = room;
		this.date_pay = date_pay;
		this.total = total;
		this.lblNewLabel_namecustomer.setText(nameCustomer);
		this.lblNewLabel_checkin.setText(date_check);
		this.lblNewLabel_staff.setText(staff);
		this.lblNewLabel_room.setText(room);
		this.lblNewLabel_pay.setText(date_pay);
		this.lblNewLabel_total.setText(total);
	}
	public inBill() throws HeadlessException {
		super();
	}

	private void init() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 473, 647);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Bill");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setBounds(194, 170, 61, 26);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Khái Tây 2 , Nam Kì Khởi Nghĩa , quận Ngũ Hành Sơn");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(33, 63, 416, 48);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("SĐT: 0395590963 - 0986609837");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(126, 124, 230, 36);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Hotel Tuan Kiet");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_3.setBounds(140, 39, 193, 31);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Total:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblNewLabel_4.setBounds(108, 502, 97, 36);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("Chúc Quý Khách Vui Vẽ, Hẹn Gặp Lại !!");
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_4_1.setBounds(92, 564, 292, 36);
		contentPane.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_5 = new JLabel("Name Customer:");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_5.setBounds(54, 225, 151, 36);
		contentPane.add(lblNewLabel_5);
		
		lblNewLabel_namecustomer = new JLabel("");
		lblNewLabel_namecustomer.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_namecustomer.setBounds(273, 225, 176, 36);
		contentPane.add(lblNewLabel_namecustomer);
		
		JLabel lblNewLabel_5_1 = new JLabel("Day Check In:");
		lblNewLabel_5_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_5_1.setBounds(64, 282, 120, 36);
		contentPane.add(lblNewLabel_5_1);
		
		lblNewLabel_checkin = new JLabel("");
		lblNewLabel_checkin.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_checkin.setBounds(273, 282, 169, 36);
		contentPane.add(lblNewLabel_checkin);
		
		JLabel lblNewLabel_6 = new JLabel("Staff:");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_6.setBounds(133, 336, 51, 36);
		contentPane.add(lblNewLabel_6);
		
		lblNewLabel_staff = new JLabel("");
		lblNewLabel_staff.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_staff.setBounds(273, 336, 176, 36);
		contentPane.add(lblNewLabel_staff);
		
		JLabel lblNewLabel_6_1 = new JLabel("Room:");
		lblNewLabel_6_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_6_1.setBounds(126, 382, 51, 36);
		contentPane.add(lblNewLabel_6_1);
		
		JLabel lblNewLabel_6_1_1 = new JLabel("Date of payment:");
		lblNewLabel_6_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_6_1_1.setBounds(54, 428, 135, 36);
		contentPane.add(lblNewLabel_6_1_1);
		
		lblNewLabel_pay = new JLabel("");
		lblNewLabel_pay.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_pay.setBounds(273, 428, 176, 36);
		contentPane.add(lblNewLabel_pay);
		
		lblNewLabel_room = new JLabel("");
		lblNewLabel_room.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_room.setBounds(273, 382, 138, 36);
		contentPane.add(lblNewLabel_room);
		
		lblNewLabel_total = new JLabel("");
		lblNewLabel_total.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel_total.setBounds(273, 490, 176, 48);
		contentPane.add(lblNewLabel_total);
		
		JLabel lblNewLabel_7 = new JLabel("TP Đà Nẵng");
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_7.setBounds(171, 99, 125, 36);
		contentPane.add(lblNewLabel_7);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(126, 158, 209, 2);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(64, 548, 333, 6);
		contentPane.add(separator_1);
	}
}
