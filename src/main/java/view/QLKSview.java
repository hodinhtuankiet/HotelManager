package view;

import java.awt.Color;



import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.SystemColor;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.SimpleAttributeSet;

import controller.DAO;
//import controller.QLSVcontroller;
import model.QLSV;
import model.thiSinh;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class QLKSview extends JFrame {
	/**
	 * 
	 */
//	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public QLSV model;
	JTextField textField;
	private JTable table;
	public JTextField textField_id;
	public JTextField textField_name;
	public JTextField textField_date;
	public JTextField textField_mon1;
	public JTextField textField_mon2;
	public JTextField textField_mon3;
	public ButtonGroup button;
	
//	private ArrayList<thiSinh> list ;
	DefaultTableModel default_table;
	public JTextField textField_que;
	public JTextField textField_gioitinh;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QLKSview frame = new QLKSview();
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
	public QLKSview() {
		this.model = new QLSV();
				
//		list  = new DAO().getListStudent();
		list = new ArrayList<thiSinh>();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1241, 814);
		ImageIcon icon = new ImageIcon("bun.jpg");
		this.setTitle("Quản Lí Sinh Viên ");
		this.setIconImage(icon.getImage());
//		QLSVcontroller controller = new QLSVcontroller(this);
		setLocationRelativeTo(null);
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		Border border = BorderFactory.createLineBorder(Color.BLACK, 1);

		JMenu menufile = new JMenu("File");
		menufile.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		menuBar.add(menufile);

		JMenuItem menuopen = new JMenuItem("Open");
		menuopen.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		menufile.add(menuopen);

		JMenuItem mntmNewMenuItem = new JMenuItem("Close");
		mntmNewMenuItem.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		menufile.add(mntmNewMenuItem);

		JSeparator separator_1 = new JSeparator();
		menufile.add(separator_1);

		JMenuItem menuabout = new JMenuItem("Exit");
		menuabout.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		menufile.add(menuabout);

		JMenu mnNewMenu = new JMenu("About");
		mnNewMenu.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		menuBar.add(mnNewMenu);

		JMenuItem mntmNewMenuItem_1 = new JMenuItem("About Me");
		mntmNewMenuItem_1.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		mnNewMenu.add(mntmNewMenuItem_1);
		contentPane = new JPanel();
		contentPane.setForeground(SystemColor.activeCaptionText);
		contentPane.setBackground(SystemColor.activeCaptionBorder);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		Box verticalBox = Box.createVerticalBox();
		verticalBox.setBounds(10, 142, 148, -30);
		contentPane.add(verticalBox);

		JLabel lblNewLabel = new JLabel("Customer List:");
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 27));
		lblNewLabel.setBounds(822, 4, 205, 44);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Number Room: ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_1.setBounds(786, 334, 135, 50);
		contentPane.add(lblNewLabel_1);

		textField = new JTextField();
		textField.setBorder(border);
		textField.setBackground(new Color(255, 250, 205));
		textField.setBounds(931, 346, 249, 35);
		contentPane.add(textField);
		textField.setColumns(10);

		JButton Buttonsearch = new JButton("Search");
		Buttonsearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				timkiem();
			}
		});
		Buttonsearch.setBorder(border);
		Buttonsearch.setFont(new Font("Tahoma", Font.PLAIN, 21));
		Buttonsearch.setBounds(1039, 399, 110, 42);
		contentPane.add(Buttonsearch);

		JSeparator separator = new JSeparator();
		separator.setBounds(408, 106, 730, 2);
		contentPane.add(separator);

		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				getDataFromTable();
			}
		});
		table.setFont(new Font("Tahoma", Font.PLAIN, 14));
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Number", "Name Customer", "Address", "Date", "Gender", "Day Checkin:", "Room:", "Price:"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(54);
		table.getColumnModel().getColumn(0).setMinWidth(17);
		table.getColumnModel().getColumn(1).setPreferredWidth(72);
		table.getColumnModel().getColumn(2).setPreferredWidth(86);
		table.getColumnModel().getColumn(3).setPreferredWidth(86);
		table.getColumnModel().getColumn(3).setMinWidth(20);
		table.getColumnModel().getColumn(3).setMaxWidth(1232131210);
		table.getColumnModel().getColumn(4).setPreferredWidth(81);
		table.getColumnModel().getColumn(5).setPreferredWidth(78);
		table.getColumnModel().getColumn(6).setPreferredWidth(78);
		table.getColumnModel().getColumn(7).setPreferredWidth(78);
		
		default_table = (DefaultTableModel) table.getModel();

		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setToolTipText("");
		scrollPane.setBounds(414, 122, 803, 206);
		contentPane.add(scrollPane);

		JLabel lblNewLabel_3 = new JLabel("Students Information: ");
		lblNewLabel_3.setForeground(Color.RED);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(381, 392, 256, 35);
		contentPane.add(lblNewLabel_3);

		JLabel lblNewLabel_id = new JLabel("Number Room: ");
		lblNewLabel_id.setForeground(new Color(0, 0, 0));
		lblNewLabel_id.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_id.setBounds(23, 445, 148, 35);
		contentPane.add(lblNewLabel_id);

		JLabel lblNewLabel_name = new JLabel("Name Customer:");
		lblNewLabel_name.setForeground(SystemColor.activeCaptionText);
		lblNewLabel_name.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_name.setBounds(10, 503, 149, 35);
		contentPane.add(lblNewLabel_name);

		JLabel lblNewLabel_3_3 = new JLabel("Hometown:");
		lblNewLabel_3_3.setForeground(SystemColor.activeCaptionText);
		lblNewLabel_3_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_3_3.setBounds(48, 555, 110, 35);
		contentPane.add(lblNewLabel_3_3);

		textField_id = new JTextField();
		textField_id.setBackground(new Color(255, 250, 205));
		textField_id.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				String id = textField_id.getText();
				String regular = "^[0-9]{3}$";
				String regular2 = "^[0-9]+$";
				if(id.length()>0) {
					if(!id.matches(regular2)) {
						JOptionPane.showMessageDialog(null, "Số Phòng Phải Là Kí Tự Số","warning",JOptionPane.INFORMATION_MESSAGE);
					}
					if(!id.matches(regular)) {
						JOptionPane.showMessageDialog(null, "Số Phòng Gồm 3 Kí Tự Số","warning",JOptionPane.INFORMATION_MESSAGE);
					}
					}else {
						JOptionPane.showMessageDialog(null, "Số phòng không được để trống","warning",JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		textField_id.setBorder(border);
		textField_id.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_id.setBounds(167, 446, 160, 41);
		contentPane.add(textField_id);
		textField_id.setColumns(10);

		JLabel lblNewLabel_date = new JLabel("Date:");
		lblNewLabel_date.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_date.setBounds(101, 600, 62, 35);
		contentPane.add(lblNewLabel_date);

		textField_name = new JTextField();
		textField_name.setBackground(new Color(255, 250, 205));
		textField_name.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				String id = textField_name.getText();
				String regular = "^[a-vxyỳọáầảấờễàạằệếýộậốũứĩõúữịỗìềểẩớặòùồợãụủíỹắẫựỉỏừỷởóéửỵẳẹèẽổẵẻỡơôưăêâđ][a-zA-Z]+$";
				if(id.length()>0) {
					if(!id.matches(regular)) {
						JOptionPane.showMessageDialog(null, "Tên Khách Hàng Phải Không Phải Kí Tự Số",
								"warning",JOptionPane.INFORMATION_MESSAGE);
					}
				}
//					}else {
//						JOptionPane.showMessageDialog(null, "Tên Khách Hàng Không Được Để Trống"
//								+ "","warning",JOptionPane.INFORMATION_MESSAGE);
//				}
			}
		});
		textField_name.setBorder(border);
		textField_name.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_name.setBounds(167, 505, 160, 35);
		contentPane.add(textField_name);
		textField_name.setColumns(10);

		textField_date = new JTextField();
		textField_date.setBackground(new Color(255, 250, 205));
		textField_date.setBorder(border);
		textField_date.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_date.setBounds(167, 607, 160, 35);
		contentPane.add(textField_date);
		textField_date.setColumns(10);

		JLabel lblNewLabel_3_5 = new JLabel("Gender:");
		lblNewLabel_3_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_3_5.setBounds(362, 445, 94, 35);
		contentPane.add(lblNewLabel_3_5);

		button = new ButtonGroup();

		JLabel lblNewLabel_3_6 = new JLabel("Day Checkin:");
		lblNewLabel_3_6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_3_6.setBounds(337, 505, 119, 35);
		contentPane.add(lblNewLabel_3_6);

		JLabel lblNewLabel_3_7 = new JLabel("Room:");
		lblNewLabel_3_7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_3_7.setBounds(362, 555, 76, 35);
		contentPane.add(lblNewLabel_3_7);

		JLabel lblNewLabel_3_8 = new JLabel("Price:");
		lblNewLabel_3_8.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_3_8.setBounds(362, 607, 102, 35);
		contentPane.add(lblNewLabel_3_8);

		textField_mon1 = new JTextField();
		textField_mon1.setBackground(new Color(255, 250, 205));
		textField_mon1.setBorder(border);
		textField_mon1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_mon1.setBounds(451, 507, 233, 35);
		contentPane.add(textField_mon1);
		textField_mon1.setColumns(10);

		textField_mon2 = new JTextField();
		textField_mon2.setBackground(new Color(255, 250, 205));
		textField_mon2.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				String id = textField_mon2.getText();
				String regular = "^[0-9]{3}$";
				String regular2 = "^[0-9]+$";
				if(id.length()>0) {
					if(!id.matches(regular2)) {
						JOptionPane.showMessageDialog(null, "Số Phòng Phải Là Kí Tự Số","warning",JOptionPane.INFORMATION_MESSAGE);
					}
					if(!id.matches(regular)) {
						JOptionPane.showMessageDialog(null, "Số Phòng Gồm 3 Kí Tự Số","warning",JOptionPane.INFORMATION_MESSAGE);
					}
					}else {
						JOptionPane.showMessageDialog(null, "Số phòng không được để trống","warning",JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		textField_mon2.setBorder(border);
		textField_mon2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_mon2.setBounds(451, 557, 234, 35);
		contentPane.add(textField_mon2);
		textField_mon2.setColumns(10);

		textField_mon3 = new JTextField();
		textField_mon3.setBackground(new Color(255, 250, 205));
		textField_mon3.setBorder(border);
		textField_mon3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_mon3.setBounds(451, 609, 233, 35);
		contentPane.add(textField_mon3);
		textField_mon3.setColumns(10);

		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(43, 652, 953, 2);
		contentPane.add(separator_2);

		JButton btnNewButton_1_reset = new JButton("Reset");
		btnNewButton_1_reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showConfirmDialog(rootPane, "dcmm mày muốn reset không ? ");
				textField.setText("");
				textField_id.setText("");
				textField_name.setText("");
//				comboBox_1_quequan.s
				textField_date.setText("");
				textField_mon1.setText("");
				textField_mon2.setText("");
				textField_mon3.setText("");
				
			}
		});
		btnNewButton_1_reset.setForeground(Color.BLACK);
		btnNewButton_1_reset.setBackground(Color.PINK);
		btnNewButton_1_reset.setBorder(border);
		btnNewButton_1_reset.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1_reset.setBounds(40, 664, 118, 53);
		contentPane.add(btnNewButton_1_reset);
//		btnNewButton_1.addActionListener(controller);

		JButton btnNewButton_1_1 = new JButton("Remove");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				removenho();
			}
		});
		btnNewButton_1_1.setForeground(Color.BLACK);
		btnNewButton_1_1.setBackground(Color.PINK);
		btnNewButton_1_1.setBorder(border);
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1_1.setBounds(242, 664, 118, 53);
		contentPane.add(btnNewButton_1_1);
//		btnNewButton_1_1.addActionListener(controller);

		JButton btnNewButton_1_2 = new JButton("Edit");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getDataFromTable();
			}

			
		});
		btnNewButton_1_2.setBackground(Color.PINK);
		btnNewButton_1_2.setBorder(border);
		btnNewButton_1_2.setForeground(Color.BLACK);
		btnNewButton_1_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1_2.setBounds(447, 664, 118, 53);
		contentPane.add(btnNewButton_1_2);
//		btnNewButton_1_2.addActionListener(controller);

		JButton btnNewButton_1_3 = new JButton("Add");
		btnNewButton_1_3.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
//				JOptionPane.showConfirmDialog(rootPane, "Thêm Sinh viên này không ? ");
				thiSinh sv = new thiSinh();
				
				sv.setMaThiSinh(Integer.parseInt(textField_id.getText()));
				sv.setTenThiSinh(textField_name.getText());
				sv.setQueQuan(textField_que.getText());
				sv.setGioiTinh(textField_gioitinh.getText());
				try {
					sv.setNgaySinh(new SimpleDateFormat("dd/MM/yyyy").parse(textField_date.getText()));
				} catch (ParseException e1) {
					e1.printStackTrace();
				}
				sv.setGioiTinh(textField_gioitinh.getText());
				try {
					sv.setDiemMon1(new SimpleDateFormat("dd/MM/yyyy").parse(textField_mon1.getText()));
				} catch (ParseException e1) {
					e1.printStackTrace();
				}
				sv.setDiemMon2(Float.valueOf(textField_mon2.getText()));
				sv.setDiemMon3(Float.valueOf(textField_mon3.getText()));
				
				list.add(sv);
				if(new DAO().addStudent(sv)) {
					JOptionPane.showMessageDialog(rootPane, "Sucess!!");
				}else {
					JOptionPane.showConfirmDialog(rootPane, "Fail");
				}
				showresult();
			}
		});
		
		
		btnNewButton_1_3.setBackground(Color.PINK);
		btnNewButton_1_3.setBorder(border);
		btnNewButton_1_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1_3.setBounds(630, 664, 118, 53);
		contentPane.add(btnNewButton_1_3);
//		btnNewButton_1_3.addActionListener(controller);

		JButton btnNewButton_1_4 = new JButton("Cancle");
		btnNewButton_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_1_4.setBackground(Color.PINK);
		btnNewButton_1_4.setBorder(border);
		btnNewButton_1_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1_4.setBounds(838, 664, 118, 53);
		contentPane.add(btnNewButton_1_4);
//		btnNewButton_1_4.addActionListener(controller);

		ImageIcon icon4 = new ImageIcon("vku.png");
		Image icon1 = icon4.getImage();
		Image cai = icon1.getScaledInstance(130, 120, Image.SCALE_FAST);
		icon4 = new ImageIcon(cai);

		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(10, 148, 0, 234);
		contentPane.add(separator_3);

		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(61, 346, -49, -202);
		contentPane.add(separator_4);

		JSeparator separator_5 = new JSeparator();
		separator_5.setBounds(20, 130, -12, 263);
		contentPane.add(separator_5);

		JSeparator separator_6 = new JSeparator();
		separator_6.setBackground(Color.BLACK);
		separator_6.setForeground(SystemColor.inactiveCaptionText);
		separator_6.setBounds(23, 408, 339, 2);
		contentPane.add(separator_6);

		JSeparator separator_7 = new JSeparator();
		separator_7.setBackground(Color.BLACK);
		separator_7.setForeground(SystemColor.inactiveCaptionText);
		separator_7.setBounds(594, 408, 411, 2);
		contentPane.add(separator_7);
		
		textField_que = new JTextField();
		textField_que.setBackground(new Color(255, 250, 205));
		textField_que.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_que.setBounds(167, 557, 160, 40);
		contentPane.add(textField_que);
		textField_que.setColumns(10);
		textField_que.setBorder(border);
		textField_gioitinh = new JTextField();
		textField_gioitinh.setBackground(new Color(255, 250, 205));
		textField_gioitinh.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_gioitinh.setBounds(451, 447, 230, 39);
		contentPane.add(textField_gioitinh);
		textField_gioitinh.setColumns(10);
		textField_gioitinh.setBorder(border);
		
		JButton btnNewButton = new JButton("Trang Chủ");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new TrangChu().setVisible(true);
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnNewButton.setBounds(1069, 11, 148, 35);
		contentPane.add(btnNewButton);
		Border b = BorderFactory.createLineBorder(Color.BLACK, 2);
		
		JLabel lblNewLabel_4 = new JLabel("Bảng Giá Phòng");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setForeground(Color.RED);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_4.setBounds(695, 445, 332, 31);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("- Phòng A(Phòng đôi) : 500.000đ/đêm");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_5.setBounds(709, 479, 309, 31);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_5_2 = new JLabel("- Phòng C(Phòng đơn) : 200.000đ/đêm");
		lblNewLabel_5_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_5_2.setBounds(705, 570, 309, 31);
		contentPane.add(lblNewLabel_5_2);
		
		JLabel lblNewLabel_5_3 = new JLabel("- Phòng D(Phòng Vip) : 1.300.000đ/đêm");
		lblNewLabel_5_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_5_3.setBounds(705, 607, 347, 31);
		contentPane.add(lblNewLabel_5_3);
		
		JLabel lblNewLabel_6 = new JLabel("1.000.000đ/đêm");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_6.setBounds(717, 548, 148, 13);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_5_1 = new JLabel("- Phòng B(Phòng gia đình) : ");
		lblNewLabel_5_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_5_1.setBounds(707, 507, 224, 31);
		contentPane.add(lblNewLabel_5_1);
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(695, 445, 323, 203);
		contentPane.add(lblNewLabel_2);
		lblNewLabel_2.setBorder(b);
		this.setVisible(true);
	}
	public void getThiSinhDangChon() {
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
		
		this.textField_id.setText(maThiSinh + "");
		this.textField_name.setText(tenThiSinh + "");
		this.textField_que.setText(tinh+"");
		this.textField_date.setText(ngaySinh+"");
				
		this.textField_gioitinh.setText(testGioiTinh+"");
		this.textField_mon1.setText(ngay_checkin+"");
			
		this.textField_mon2.setText(diemMon2 + "");
		this.textField_mon3.setText(diemMon3 + "");
		
//		thiSinh ts2 = new thiSinh(maThiSinh, tenThiSinh, tinh, ngaySinh, testGioiTinh, ngay_checkin, diemMon2, diemMon3);
//		return ts2;
	}
//	private void hienthi() {
//		// TODO Auto-generated method stub
//		thiSinh thisinh = getThiSinhDangChon();
//
//		this.textField_id.setText(thisinh.getMaThiSinh() + "");
//		this.textField_name.setText(thisinh.getTenThiSinh() + "");
//		this.textField_que.setText(thisinh.getQueQuan()+"");
//		this.textField_date.setText(thisinh.getNgaySinh().getDate() + "/" + thisinh.getNgaySinh().getMonth() + "/"
//				+ thisinh.getNgaySinh().getYear());
//		this.textField_gioitinh.setText(thisinh.isGioiTinh()+"");
//		this.textField_mon1.setText(thisinh.getDiemMon1().getDate() + "/" + thisinh.getDiemMon1().getMonth() + "/"
//				+ thisinh.getDiemMon1().getYear());
//		this.textField_mon2.setText(thisinh.getDiemMon2() + "");
//		this.textField_mon3.setText(thisinh.getDiemMon3() + "");
//	}

	public void removenho() {
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		int i_row = table.getSelectedRow();
		int luaChon = JOptionPane.showConfirmDialog(this, "Mi có muốn xóa không ? ");
		if (luaChon == JOptionPane.YES_OPTION) {
			model.removeRow(i_row);
		}

	}
	public void showresult() {
		thiSinh ts = list.get(list.size()-1);
		default_table.addRow(new Object[] {
		 ts.getMaThiSinh() , ts.getTenThiSinh() , ts.getQueQuan() , ts.getNgaySinh(), ts.isGioiTinh() , ts.getDiemMon1() , ts.getDiemMon2() , ts.getDiemMon3() 
				
		});
	}
	public void timkiem() {
		String idStudentSearch = this.textField.getText();
		DefaultTableModel model_table = (DefaultTableModel) table.getModel();
		int row = model_table.getRowCount();
		
		Set<Integer> idCuaThiSinhCanXoa = new TreeSet<Integer>();
		
		if (idStudentSearch.length() > 0) {
			for (int i = 0; i < row; i++) {
				String id = model_table.getValueAt(i, 0) + "";
				if (!id.equals(idStudentSearch)) {
					idCuaThiSinhCanXoa.add(Integer.valueOf(id));
				}
			}
		}
		for (Integer idCanXoa : idCuaThiSinhCanXoa) {
			System.out.println(idCanXoa);
			int soLuongDong = model_table.getRowCount();
			for (int i = 0; i < soLuongDong; i++) {
				String idTrongTable = model_table.getValueAt(i, 0) + "";
				System.out.println("idTrongTable: " + idTrongTable);
				if (idTrongTable.equals(idCanXoa.toString())) {
					System.out.println("Đã xóa: " + i);
					try {
						model_table.removeRow(i);
					} catch (Exception e) {
						e.printStackTrace();
					}
					break;
				}
			}
		}
		
	}
	ArrayList<thiSinh> list;
	DefaultTableModel model_table;
//	List<thiSinh> list = new ArrayList<thiSinh>();
	public void getDataFromTable() {
		int i = table.getSelectedRow();
		thiSinh ts = list.get(i);

		this.textField_id.setText(ts.getMaThiSinh() + "");
		this.textField_name.setText(ts.getTenThiSinh() + "");
		this.textField_date.setText(ts.getNgaySinh()+"");
		this.textField_date.setText(ts.getNgaySinh().getDate() + "/" + ts.getNgaySinh().getMonth() + "/"
				+ ts.getNgaySinh().getYear());
		this.textField_gioitinh.setText(ts.isGioiTinh()+"");
		this.textField_mon1.setText(ts.getDiemMon1()+"");
			
		this.textField_mon2.setText(String.valueOf(ts.getDiemMon2()) + "");
		this.textField_mon3.setText(String.valueOf(ts.getDiemMon2()) + "");
//		int r = table.getSelectedRow() ; 
//        if(r == - 1) {
//            if(table.getRowCount() == 0) {
//                   JOptionPane.showMessageDialog( rootPane, "Table is Empty !" );
//            }
//            
//            else {
//                   JOptionPane.showMessageDialog(rootPane, "You must select a Row !");
//            }
//        }
//        else {
//          mHangxemodel.removeRow(r);
//          listHangXeDaBan.add(jTable1.getValueAt(r,0) + " " + jTable1.getValueAt(r,1)+ " " +
//                              jTable1.getValueAt(r,2) + " " + jTable1.getValueAt(r,3)+ " " +
//                              jTable1.getValueAt(r,4) + " " + jTable1.getValueAt(r,5) + " " +
//                              jTable1.getValueAt(r,6) );
//        }     
//        JOptionPane.showMessageDialog(rootPane, listHangXeDaBan);
//  
	}
}
