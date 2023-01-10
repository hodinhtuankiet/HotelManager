package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JSpinner;
import javax.swing.JToggleButton;
import javax.swing.JToolBar;
import javax.swing.JSplitPane;
import java.awt.Component;

import javax.swing.BorderFactory;
import javax.swing.Box;
import java.awt.Dimension;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;
import java.awt.SystemColor;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import controller.DAO;
import model.thiSinh;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class QuanLiKhachSan extends JFrame {
	DefaultTableModel default_table;
	private JPanel contentPane;
	private JTextField textField_number;
	private JTextField textField_name;
	private JTextField textField_address;
	private JTextField textField_date;
	private JTextField textField_gender;
	private JTextField textField_cmnd;
	private JTextField textField_room;
	private JTextField textField_7;
	private JTable table;
	private JTextField txtThanhTon;
	private JTextField textField_8;
	private JTextField textField_thanhtoan;
	private JTextField textField_songaythue;
	private JTextField textField_tienkhachdua;
	private JTextField textField_tralai;
	private JTextField textField_hinhthucthanhtoan;
	private JTextField textField_phuthu;
	private JTextField textField_tiendatcoc;
	private JTextField txtTrPhng;
	public 	QLKSview view ;
	private JTextField textField;
	private JTextField textField_tong;
	private Connection con;
	ArrayList<thiSinh> list;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QuanLiKhachSan frame = new QuanLiKhachSan();
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
	
	public QuanLiKhachSan() {
		init();
			try {
				Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
				
				String url = "jdbc:sqlserver://localhost:1433;database=Doan;encrypt=true;trustServerCertificate=true;";
				String user = "sa";
				String password = "123456";
				con = DriverManager.getConnection(url, user, password);
				System.out.println("Get a connection");
				PreparedStatement st = con.prepareStatement("Select*from KhachHang");
				ResultSet rs = st.executeQuery();
				DefaultTableModel model = (DefaultTableModel) table.getModel();
//				DefaultTableModel model = new DefaultTableModel();
				while(rs.next()) {
					Object ob[] = {rs.getInt("NumberRoom"),rs.getString("NameCustomer"),rs.getString("Hometown"),rs.getDate("Date"),rs.getString("Gender"),rs.getString("DateCheckin"),
							rs.getString("Room"),rs.getString("Price")};
					model.addRow(ob);
//					table.setModel(model);
				}
				
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	}
		public void init() {
		list = new ArrayList<thiSinh>();
//		this.view = new QLKSview();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1319, 743);
		contentPane = new JPanel();
		setLocationRelativeTo(null);
		contentPane.setBackground(new Color(63, 186, 192));
		contentPane.setForeground(new Color(128, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(Color.DARK_GRAY);
		separator.setBounds(0, 53, 875, 8);
		contentPane.add(separator);
		
		Border b = BorderFactory.createLineBorder(Color.blue, 2);
		
		JLabel lblNewLabel_2 = new JLabel("Number Room:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2.setBounds(68, 90, 135, 25);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Name Customer:");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2_1.setBounds(52, 125, 135, 25);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Address:");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2_2.setBounds(96, 160, 82, 25);
		contentPane.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("Date:");
		lblNewLabel_2_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2_3.setBounds(111, 195, 42, 25);
		contentPane.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_4 = new JLabel("Gender:");
		lblNewLabel_2_4.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2_4.setBounds(107, 230, 52, 25);
		contentPane.add(lblNewLabel_2_4);
		
		JLabel lblNewLabel_daycheckin = new JLabel("Date Check in:");
		lblNewLabel_daycheckin.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_daycheckin.setBounds(68, 265, 100, 25);
		contentPane.add(lblNewLabel_daycheckin);
		
		JLabel lblNewLabel_2_5_1 = new JLabel("Room:");
		lblNewLabel_2_5_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2_5_1.setBounds(111, 297, 52, 25);
		contentPane.add(lblNewLabel_2_5_1);
		
		textField_number = new JTextField();
		textField_number.setBounds(168, 93, 248, 21);
		contentPane.add(textField_number);
		textField_number.setColumns(10);
		
		textField_name = new JTextField();
		textField_name.setColumns(10);
		textField_name.setBounds(168, 125, 248, 21);
		contentPane.add(textField_name);
		
		textField_address = new JTextField();
		textField_address.setColumns(10);
		textField_address.setBounds(168, 160, 248, 21);
		contentPane.add(textField_address);
		
		textField_date = new JTextField();
		textField_date.setColumns(10);
		textField_date.setBounds(168, 195, 247, 21);
		contentPane.add(textField_date);
		
		textField_gender = new JTextField();
		textField_gender.setColumns(10);
		textField_gender.setBounds(169, 234, 248, 21);
		contentPane.add(textField_gender);
		
		textField_cmnd = new JTextField();
		textField_cmnd.setColumns(10);
		textField_cmnd.setBounds(168, 268, 248, 21);
		contentPane.add(textField_cmnd);
		
		textField_room = new JTextField();
		textField_room.setColumns(10);
		textField_room.setBounds(168, 300, 248, 21);
		contentPane.add(textField_room);
		
		textField_7 = new JTextField();
		textField_7.setBackground(Color.WHITE);
		textField_7.setBounds(-7, 383, 892, 16);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane((Component) null);
		scrollPane.setToolTipText("");
		scrollPane.setBounds(25, 422, 852, 170);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.PLAIN, 14));
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				getData();
			}
		});
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Number Room", "Name Customer", "Address", "Date", "Gender", "Day Chech in", "Room", "Price"
			}
		));
		scrollPane.setViewportView(table);
		Border b1 = BorderFactory.createLineBorder(Color.WHITE, 2);
		JPanel panel = new JPanel();
		panel.setBounds(895, 10, 410, 686);
		contentPane.add(panel);
		panel.setLayout(null);
		panel.setBorder(b1);
		
		txtThanhTon = new JTextField();
		txtThanhTon.setBounds(0, 0, 410, 34);
		panel.add(txtThanhTon);
		txtThanhTon.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtThanhTon.setBackground(new Color(75, 0, 130));
		txtThanhTon.setForeground(new Color(255, 255, 255));
		txtThanhTon.setText("Thanh Toán");
		txtThanhTon.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(10, 530, 380, 127);
		panel.add(textField_8);
		textField_8.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Ghi Chú:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_4.setForeground(new Color(0, 0, 0));
		lblNewLabel_4.setBounds(10, 495, 86, 25);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_traphong = new JLabel("Ngày trả phòng:");
		lblNewLabel_traphong.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_traphong.setBounds(28, 44, 118, 31);
		panel.add(lblNewLabel_traphong);
		
		JLabel lblNewLabel_5_1 = new JLabel("Số ngày thuê:");
		lblNewLabel_5_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_5_1.setBounds(28, 118, 105, 31);
		panel.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_5_1_1 = new JLabel("Tiền Khách Đưa:");
		lblNewLabel_5_1_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_5_1_1.setBounds(28, 193, 160, 31);
		panel.add(lblNewLabel_5_1_1);
		
		JLabel lblNewLabel_5_1_2 = new JLabel("Trả Lại:");
		lblNewLabel_5_1_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_5_1_2.setBounds(28, 276, 92, 31);
		panel.add(lblNewLabel_5_1_2);
		
		JLabel lblNewLabel_nhanvien = new JLabel("Nhân viên:");
		lblNewLabel_nhanvien.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_nhanvien.setBounds(210, 44, 92, 31);
		panel.add(lblNewLabel_nhanvien);
		
		JLabel lblNewLabel_5_1_4 = new JLabel("Hình thức Thanh Toán:");
		lblNewLabel_5_1_4.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_5_1_4.setBounds(197, 118, 149, 31);
		panel.add(lblNewLabel_5_1_4);
		
		JLabel lblNewLabel_5_1_5 = new JLabel("Tiền Đặt Cọc:");
		lblNewLabel_5_1_5.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_5_1_5.setBounds(198, 193, 105, 31);
		panel.add(lblNewLabel_5_1_5);
		
		textField_thanhtoan = new JTextField();
		textField_thanhtoan.setBounds(28, 79, 140, 25);
		panel.add(textField_thanhtoan);
		textField_thanhtoan.setColumns(10);
		
		textField_songaythue = new JTextField();
		textField_songaythue.setColumns(10);
		textField_songaythue.setBounds(28, 159, 140, 25);
		panel.add(textField_songaythue);
		
		textField_tienkhachdua = new JTextField();
		textField_tienkhachdua.setColumns(10);
		textField_tienkhachdua.setBounds(28, 234, 140, 25);
		panel.add(textField_tienkhachdua);
		
		textField_tralai = new JTextField();
		textField_tralai.setColumns(10);
		textField_tralai.setBounds(28, 317, 140, 25);
		panel.add(textField_tralai);
		
		textField_hinhthucthanhtoan = new JTextField();
		textField_hinhthucthanhtoan.setColumns(10);
		textField_hinhthucthanhtoan.setBounds(197, 159, 140, 25);
		panel.add(textField_hinhthucthanhtoan);
		
		textField_phuthu = new JTextField();
		textField_phuthu.setColumns(10);
		textField_phuthu.setBounds(197, 79, 140, 25);
		panel.add(textField_phuthu);
		
		textField_tiendatcoc = new JTextField();
		textField_tiendatcoc.setColumns(10);
		textField_tiendatcoc.setBounds(197, 234, 140, 25);
		panel.add(textField_tiendatcoc);
		
		JButton btnNewButton = new JButton("Calculator");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tinhtien();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(209, 422, 149, 41);
		panel.add(btnNewButton);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setForeground(SystemColor.window);
		btnReset.setBackground(SystemColor.menuText);
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_hinhthucthanhtoan.setText("");
				textField_phuthu.setText("");
				textField_thanhtoan.setText("");
				textField_songaythue.setText("");
				textField_tiendatcoc.setText("");
				textField_tienkhachdua.setText("");
				textField_tralai.setText("");
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnReset.setBounds(39, 422, 149, 41);
		panel.add(btnReset);
		
		textField_tong = new JTextField();
		textField_tong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		textField_tong.setBounds(233, 349, 140, 52);
		panel.add(textField_tong);
		textField_tong.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Total:");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 33));
		lblNewLabel_5.setBounds(38, 352, 118, 52);
		panel.add(lblNewLabel_5);
		
		txtTrPhng = new JTextField();
		txtTrPhng.setText("Trả Phòng:");
		txtTrPhng.setForeground(Color.WHITE);
		txtTrPhng.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtTrPhng.setColumns(10);
		txtTrPhng.setBackground(new Color(75, 0, 130));
		txtTrPhng.setBounds(25, 10, 850, 33);
		contentPane.add(txtTrPhng);
		
		JButton btnNewButton_1 = new JButton("Trang Chủ");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new TrangChu().setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1.setBounds(642, 628, 135, 48);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("In Bill");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				new inBill().setVisible(true);
				inbill();
			
			}
		});
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1_1.setBounds(379, 628, 135, 48);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_2 = new JButton("Edit");
//		btnNewButton_2.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				int r = table.getSelectedRow() ; 
//		        if(r == - 1) {
//		            if(table.getRowCount() == 0) {
//		                   JOptionPane.showMessageDialog( rootPane, "Table is Empty !" );
//		            }
//		            
//		            else {
//		                   JOptionPane.showMessageDialog(rootPane, "You must select a Row !");
//		            }
//		        }
//		        else {
//		          mHangxemodel.removeRow(r);
//		          list.add(table.getValueAt(r,0) + " " + table.getValueAt(r,1)+ " " +
//		        		  table.getValueAt(r,2) + " " + table.getValueAt(r,3)+ " " +
//		        		  table.getValueAt(r,4) + " " + table.getValueAt(r,5) + " " +
//		        		  table.getValueAt(r,6) );
//		        }     
//		        JOptionPane.showMessageDialog(rootPane, listHangXeDaBan);
//			}
//		});
//		btnNewButton_2.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				hienthi();
//			}
//		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton_2.setBounds(96, 628, 124, 48);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_5_2 = new JLabel("- Phòng A(Phòng đôi) : ");
		lblNewLabel_5_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_5_2.setBounds(608, 102, 284, 13);
		contentPane.add(lblNewLabel_5_2);
		
		JLabel lblNewLabel_5_1_6 = new JLabel("- Phòng B(Phòng gia đình) : ");
		lblNewLabel_5_1_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_5_1_6.setBounds(600, 156, 317, 31);
		contentPane.add(lblNewLabel_5_1_6);
		
		JLabel lblNewLabel = new JLabel("500.000đ/đêm");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(618, 130, 109, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_3 = new JLabel("1.000.000đ/đêm");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setBounds(621, 190, 135, 33);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_5_2_1 = new JLabel("- Phòng C(Phòng đơn) : ");
		lblNewLabel_5_2_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_5_2_1.setBounds(608, 224, 198, 31);
		contentPane.add(lblNewLabel_5_2_1);
		
		JLabel lblNewLabel_6 = new JLabel("200.000đ/đêm");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_6.setBounds(621, 250, 135, 29);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_5_3 = new JLabel("- Phòng D(Phòng Vip) : ");
		lblNewLabel_5_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_5_3.setBounds(608, 277, 182, 31);
		contentPane.add(lblNewLabel_5_3);
		
		JLabel lblNewLabel_7 = new JLabel("1.300.000đ/đêm");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_7.setBounds(618, 308, 120, 25);
		contentPane.add(lblNewLabel_7);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(44, 610, 803, 8);
		contentPane.add(separator_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setBounds(566, 77, 294, 296);
		contentPane.add(lblNewLabel_1_1);
		lblNewLabel_1_1.setBorder(b);
		
		JLabel lblNewLabel_2_5_1_1 = new JLabel("Price:");
		lblNewLabel_2_5_1_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2_5_1_1.setBounds(111, 332, 52, 25);
		contentPane.add(lblNewLabel_2_5_1_1);
		
		textField = new JTextField();
		textField.setBounds(168, 336, 248, 25);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(25, 77, 489, 296);
		contentPane.add(lblNewLabel_1);
		lblNewLabel_1.setBorder(b);
	
//	public void hienthi() {
//		thiSinh sv = new thiSinh();
//		
//		sv.setMaThiSinh(Integer.parseInt(this.view.textField_id.getText()));
//		sv.setTenThiSinh(this.view.textField_name.getText());
//		sv.setQueQuan(this.view.textField.getText());
//		try {
//			sv.setNgaySinh(new SimpleDateFormat("dd/MM/yyyy").parse(this.view.textField_date.getText()));
//		} catch (ParseException e1) {
//			e1.printStackTrace();
//		}
//		sv.setGioiTinh(this.view.textField_gioitinh.getText());
//		try {
//			sv.setDiemMon1(new SimpleDateFormat("dd/MM/yyyy").parse(this.view.textField_mon1.getText()));
//		} catch (ParseException e1) {
//			e1.printStackTrace();
//		}
//		sv.setDiemMon2(Float.valueOf(this.view.textField_mon2.getText()));
//		sv.setDiemMon3(Float.valueOf(this.view.textField_mon3.getText()));
//		
//		list.add(sv);
//		if(new DAO().addStudent(sv)) {
//			JOptionPane.showMessageDialog(rootPane, "Sucess!!");
//		}else {
//			JOptionPane.showConfirmDialog(rootPane, "Fail");
//		}
//		showresult();
//	}
	}
	private void showresult() {
		// TODO Auto-generated method stub
//		ArrayList<thiSinh> list ;
		thiSinh ts = list.get(list.size()-1);
		default_table.addRow(new Object[] {
		 ts.getMaThiSinh() , ts.getTenThiSinh() , ts.getQueQuan() , ts.getNgaySinh(), ts.isGioiTinh() , ts.getDiemMon1() , ts.getDiemMon2() , ts.getDiemMon3() 
				
		});
	}
	private void inbill() {
		inBill b = new inBill(textField_name.getText(), textField_cmnd.getText(), textField_phuthu.getText(), textField_room.getText(), textField_thanhtoan.getText(), textField_tong.getText());
		b.setVisible(true);
	}
	public thiSinh getThiSinhDangChon() {
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		int i_row = table.getSelectedRow();

		// lấy thông tin thí sinh

		int maThiSinh = Integer.valueOf(model.getValueAt(i_row, 0) + "");

		String tenThiSinh = model.getValueAt(i_row, 1) + "";

		String tinh = model.getValueAt(i_row, 2) + "";

		String ngaysinh_1 = model.getValueAt(i_row, 3) + "";
		@SuppressWarnings("deprecation")
		Date ngaySinh = new Date(ngaysinh_1);

		String testGioiTinh = model.getValueAt(i_row, 4) + "";

		String ngaysinh_2 = model.getValueAt(i_row, 5) + "";
		@SuppressWarnings("deprecation")
		Date ngay_checkin = new Date(ngaysinh_2);
		
		float diemMon2 = Float.valueOf(model.getValueAt(i_row, 6) + "");
		float diemMon3 = Float.valueOf(model.getValueAt(i_row, 7) + "");

		thiSinh ts = new thiSinh(maThiSinh, tenThiSinh, ngaysinh_2, ngaySinh, testGioiTinh, ngay_checkin, diemMon2, diemMon3);
		return ts;
	}
	private void hienthi() {
		thiSinh thisinh = getThiSinhDangChon();

		this.textField_room.setText(thisinh.getMaThiSinh() + "");
		this.textField_name.setText(thisinh.getTenThiSinh() + "");
		this.textField_address.setText(thisinh.getQueQuan()+"");
		this.textField_date.setText(thisinh.getNgaySinh().getDate() + "/" + thisinh.getNgaySinh().getMonth() + "/"
				+ thisinh.getNgaySinh().getYear());
		this.textField_gender.setText(thisinh.isGioiTinh()+"");
		this.textField_cmnd.setText(thisinh.getDiemMon1().getDate() + "/" + thisinh.getDiemMon1().getMonth() + "/"
				+ thisinh.getDiemMon1().getYear());
		this.textField_room.setText(thisinh.getDiemMon2() + "");
		this.textField.setText(thisinh.getDiemMon3() + "");
	}
	public void tinhtien() {
		if(textField_room.getText().equals("A")) {
			float tien = Float.valueOf(textField_tienkhachdua.getText()) - ((Float.valueOf(textField_songaythue.getText())*500000 + Float.valueOf(textField_tiendatcoc.getText())));
			textField_tong.setText(String.valueOf(tien));
		}
		if(textField_room.getText().equals("B")) {
			float tien = Float.valueOf(textField_tienkhachdua.getText()) - ((Float.valueOf(textField_songaythue.getText())*1000000 + Float.valueOf(textField_tiendatcoc.getText())));
			textField_tong.setText(String.valueOf(tien));
		}
		if(textField_room.getText().equals("C")) {
			float tien = Float.valueOf(textField_tienkhachdua.getText()) - ((Float.valueOf(textField_songaythue.getText())*200000 + Float.valueOf(textField_tiendatcoc.getText())));
			textField_tong.setText(String.valueOf(tien));
		}
		if(textField_room.getText().equals("D")) {
			float tien = Float.valueOf(textField_tienkhachdua.getText()) - ((Float.valueOf(textField_songaythue.getText())*1300000 + Float.valueOf(textField_tiendatcoc.getText())));
			textField_tong.setText(String.valueOf(tien));
		}
	}   

	public void hienthi2() {
//			int i = table.getSelectedRow();
//			thiSinh ts = list.get(i+1);
//			this.textField_name.setText(ts.getMaThiSinh() + "");
		int r = table.getSelectedRow() ; 
        if(r == - 1) {
            if(table.getRowCount() == 0) {
                   JOptionPane.showMessageDialog( rootPane, "Table is Empty !" );
            }
            
            else {
                   JOptionPane.showMessageDialog(rootPane, "You must select a Row !");
            }
        }
	}
//	ArrayList<thiSinh> list;
	public void getData() {
	int i = table.getSelectedRow();

	thiSinh ts = list.get(i);

	this.textField_number.setText(ts.getMaThiSinh() + "");
	
//	this.textField_name.setText(thisinh.getTenThiSinh() + "");
//	this.textField_address.setText(thisinh.getQueQuan()+"");
//	this.textField_date.setText(thisinh.getNgaySinh().getDate() + "/" + thisinh.getNgaySinh().getMonth() + "/"
//			+ thisinh.getNgaySinh().getYear());
//	this.textField_gender.setText(thisinh.isGioiTinh()+"");
//	this.textField_cmnd.setText(thisinh.getDiemMon1().getDate() + "/" + thisinh.getDiemMon1().getMonth() + "/"
//			+ thisinh.getDiemMon1().getYear());
//	this.textField_room.setText(thisinh.getDiemMon2() + "");
//	this.textField.setText(thisinh.getDiemMon3() + "");
}
}


