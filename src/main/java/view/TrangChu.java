package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import javax.swing.JScrollBar;
import javax.swing.JSlider;
import javax.swing.JProgressBar;
import javax.swing.JTree;
import javax.swing.JList;
import javax.swing.JSplitPane;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;
import javax.swing.JTextField;
import java.awt.CardLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import java.awt.SystemColor;

public class TrangChu extends JFrame  {

	private JPanel contentPane;
	private JPanel panel_menu;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TrangChu frame = new TrangChu();
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
	public TrangChu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(974, 645);
//		setBounds(100, 100, 799, 600);
		setLocationRelativeTo(null);
//		setUndecorated(true);
		ImageIcon icon = new ImageIcon("background.jpg");
//		setIconImage(icon.getImage());
		setTitle("Dinh Tuan Kiet");
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
//		panel.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseClicked(MouseEvent e) {
//				openmenubar();
//			}
//		});
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 965, 618);
		contentPane.add(panel);
		panel.setLayout(null);
		
		panel_menu = new JPanel();
		panel_menu.setBorder(new LineBorder(Color.BLACK));
		panel_menu.setLayout(null);
		panel_menu.setBackground(Color.WHITE);
		panel_menu.setBounds(0, 0, 1, 608);
		panel.add(panel_menu);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 185, 230, 2);
		panel_menu.add(separator);
		
		JLabel lblNewLabel_1 = new JLabel("#HoDinhTuanKiet");
		lblNewLabel_1.setBackground(Color.RED);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setBounds(34, 134, 169, 41);
		panel_menu.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\qwerl\\Downloads\\bun (2).jpg"));
		lblNewLabel.setBounds(65, 27, 100, 102);
		panel_menu.add(lblNewLabel);
		
		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				closemenubar();
			}
		});
		lblNewLabel_8.setIcon(new ImageIcon("C:\\Users\\qwerl\\Downloads\\Previous-icon.png"));
		lblNewLabel_8.setBounds(186, 10, 35, 41);
		panel_menu.add(lblNewLabel_8);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(139, 0, 0)	);
		panel_1.setBounds(0, 185, 230, 423);
		panel_menu.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Trang Chủ ");
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new Login().setVisible(true);
				dispose();
			}
		});
		lblNewLabel_2.setBounds(69, 22, 85, 21);
		panel_1.add(lblNewLabel_2);
		lblNewLabel_2.setForeground(new Color(245, 245, 245));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		
		JLabel lblNewLabel_2_3 = new JLabel("Đăng Nhập");
		lblNewLabel_2_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new SignUp().setVisible(true);
				dispose();
			}
		});
		lblNewLabel_2_3.setBounds(69, 53, 107, 65);
		panel_1.add(lblNewLabel_2_3);
		lblNewLabel_2_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_2_3.setFont(new Font("Tahoma", Font.PLAIN, 17));
		
		JLabel lblNewLabel_3 = new JLabel("Đăng Kí");
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new SignUp().setVisible(true);;
			}
		});
		lblNewLabel_3.setBounds(69, 106, 84, 55);
		panel_1.add(lblNewLabel_3);
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 17));
		
		JLabel lblNewLabel_2_2 = new JLabel("Pay Room");
		lblNewLabel_2_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new QuanLiKhachSan().setVisible(true);
				dispose();
			}
		});
		lblNewLabel_2_2.setBounds(84, 316, 84, 48);
		panel_1.add(lblNewLabel_2_2);
		lblNewLabel_2_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		
		JLabel lblNewLabel_9 = new JLabel("");
		lblNewLabel_9.setBounds(39, 372, 35, 41);
		panel_1.add(lblNewLabel_9);
		lblNewLabel_9.setIcon(new ImageIcon("C:\\Users\\qwerl\\Downloads\\Log-Out-icon.png"));
		
		JLabel lblNewLabel_2_1 = new JLabel("Đăng Xuất");
		lblNewLabel_2_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new Login().setVisible(true);
				dispose();
			}
		});
		lblNewLabel_2_1.setBounds(81, 381, 79, 21);
		panel_1.add(lblNewLabel_2_1);
		lblNewLabel_2_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setBounds(39, 323, 32, 32);
		panel_1.add(lblNewLabel_6);
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\qwerl\\Downloads\\infor.png"));
		
		JLabel lblNewLabel_10 = new JLabel("");
		lblNewLabel_10.setIcon(new ImageIcon("C:\\Users\\qwerl\\Downloads\\blue-home-icon.png"));
		lblNewLabel_10.setBounds(29, 11, 32, 32);
		panel_1.add(lblNewLabel_10);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(-1, 159, 230, 2);
		panel_1.add(separator_1);
		
		JLabel lblNewLabel_12 = new JLabel("");
		lblNewLabel_12.setIcon(new ImageIcon("C:\\Users\\qwerl\\Downloads\\log-icon.png"));
		lblNewLabel_12.setBounds(29, 66, 32, 32);
		panel_1.add(lblNewLabel_12);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("Book Room");
		lblNewLabel_2_2_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				xemSinhVien();
			}
		});
		lblNewLabel_2_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_2_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_2_2_1.setBounds(84, 271, 84, 21);
		panel_1.add(lblNewLabel_2_2_1);
		
		JLabel lblNewLabel_13 = new JLabel("");
		lblNewLabel_13.setIcon(new ImageIcon("C:\\Users\\qwerl\\Downloads\\put-inside-icon.png"));
		lblNewLabel_13.setBounds(39, 271, 32, 32);
		panel_1.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("");
		lblNewLabel_14.setIcon(new ImageIcon("C:\\Users\\qwerl\\Downloads\\Pay-Per-Click-icon.png"));
		lblNewLabel_14.setBounds(39, 208, 32, 32);
		panel_1.add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("Thống Kê");
		lblNewLabel_15.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				xemLichTrinh();
				
			}
		});
		lblNewLabel_15.setForeground(new Color(255, 255, 255));
		lblNewLabel_15.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_15.setBounds(80, 208, 74, 21);
		panel_1.add(lblNewLabel_15);
		
		JLabel lblNewLabel_16 = new JLabel("");
		lblNewLabel_16.setIcon(new ImageIcon("C:\\Users\\qwerl\\Downloads\\sign-check-icon.png"));
		lblNewLabel_16.setBounds(24, 117, 35, 32);
		panel_1.add(lblNewLabel_16);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				openmenubar();
			}
		});
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\qwerl\\Downloads\\menu.png"));
		lblNewLabel_4.setBounds(55, 22, 54, 63);
		panel.add(lblNewLabel_4);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 114, 965, 494);
		panel.add(panel_2);
		panel_2.setLayout(new CardLayout(0, 0));
		
		JPanel gioithieu = new JPanel();
		panel_2.add(gioithieu, "name_76472493761500");
		gioithieu.setLayout(null);
		
		JLabel lblNewLabel_11 = new JLabel("");
		lblNewLabel_11.setIcon(new ImageIcon("C:\\Users\\qwerl\\Downloads\\photo-1596386461350-326ccb383e9f.jpg"));
		lblNewLabel_11.setBounds(0, 0, 965, 494);
		gioithieu.add(lblNewLabel_11);
		
		JPanel panel_3 = new JPanel();
		panel_3.setForeground(new Color(0, 0, 0));
		panel_3.setBackground(Color.BLUE);
		panel_3.setBounds(328, 29, 346, 56);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("Quản Lí Khách Sạn");
		lblNewLabel_5.setBackground(Color.WHITE);
		lblNewLabel_5.setBounds(-15, 0, 375, 57);
		panel_3.add(lblNewLabel_5);
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setFont(new Font("Arial", Font.BOLD, 33));
		Border boder = BorderFactory.createLineBorder(Color.black, 3);
	}
	protected void xemSinhVien() {
		new QLKSview().setVisible(true);
		this.dispose();
	}

	protected void xemLichTrinh() {
		new LichTrinh().setVisible(true);
		this.dispose();
	}
	int width = 230 ;
	int height = 608 ;
	protected void openmenubar() {
		new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i < width; i++) {
					panel_menu.setSize(i,height);
					try {
						Thread.sleep(1,5);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
				
		}).start();
		
	}
	protected void closemenubar() {
		new Thread(new Runnable() {
			
			public void run() {
				for (int i = width; i > 0; i--) {
					panel_menu.setSize(i,height);
					try {
						Thread.sleep(3);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
				
		}).start();
		
			
	}
}
