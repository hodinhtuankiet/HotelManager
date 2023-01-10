package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JTextField;

public class LichTrinh extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField txtTruynThngVit;
	private JTextField txtLchTrnhn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LichTrinh frame = new LichTrinh();
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
	public LichTrinh() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 885, 607);
		contentPane = new JPanel();
//		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
//		setUndecorated(true);
		setLocationRelativeTo(null);
		ImageIcon icon = new ImageIcon("bun.jpg");
		setIconImage(icon.getImage());
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setTitle("Dinh Tuan Kiet");
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 112, 851, 245);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setSurrendersFocusOnKeystroke(true);
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setFont(new Font("Tahoma", Font.PLAIN, 13));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"1", "Nam K\u00EC Kh\u1EDFi Ngh\u0129a, qu\u1EADn Ng\u0169 H\u00E0nh S\u01A1n", "7h30 , ng\u00E0y 1 th\u00E1ng 1 n\u0103m 2022", "VKU,Y D\u01B0\u1EE3c", "Qu\u1EA3ng B\u00ECnh"},
				{"2", "Nam K\u00EC Kh\u1EDFi Ngh\u0129a, qu\u1EADn Ng\u0169 H\u00E0nh S\u01A1n", "9h00, ng\u00E0y 1 th\u00E1ng 1 n\u0103m 2022", "VKU,Y D\u01B0\u1EE3c", "Qu\u1EA3ng B\u00ECnh"},
				{"3", "B\u1EBFn Xe Ph\u00EDa Nam", "7h30 , ng\u00E0y 2 th\u00E1ng 1 n\u0103m 2022", "VKU", "Th\u1EEBa Thi\u00EAn Hu\u1EBF"},
				{"4", "B\u1EBFn Xe Ph\u00EDa Nam", "9h00, ng\u00E0y 2 th\u00E1ng 1 n\u0103m 2022", "VKU", "Th\u1EEBa Thi\u00EAn Hu\u1EBF"},
				{"5", "Tr\u01B0\u1EDDng Vi\u1EC7t H\u00E0n", "7h30 , ng\u00E0y 2 th\u00E1ng 1 n\u0103m 2022", "VKU", "Qu\u1EA3ng Tr\u1ECB"},
				{"6", "Tr\u01B0\u1EDDng Vi\u1EC7t H\u00E0n", "9h00, ng\u00E0y 2 th\u00E1ng 1 n\u0103m 2022", "VKU", "Qu\u1EA3ng Tr\u1ECB"},
				{"7", "\u0110\u01B0\u1EDDng T\u1ED1 H\u1EEFu", "7h30 , ng\u00E0y 3 th\u00E1ng 1 n\u0103m 2022", "Y D\u01B0\u1EE3c", "H\u00E0 T\u0129nh"},
				{"8", "\u0110\u01B0\u1EDDng T\u1ED1 Huu", "9h00, ng\u00E0y 3 th\u00E1ng 1 n\u0103m 2022", "Y D\u01B0\u1EE3c", "H\u00E0 T\u0129nh"},
				{"9", "Tr\u01B0\u1EDDng Vi\u1EC7t H\u00E0n", "11h00 , ng\u00E0y 3 th\u00E1ng 1 n\u0103m 2022", "VKU,Y D\u01B0\u1EE3c,S\u01B0 Ph\u1EA1m K\u0129 Thu\u1EADt", "Ngh\u1EC7 An"},
				{"10", "Vi\u1EC7t H\u00E0n", "115h00 , ng\u00E0y 3 th\u00E1ng 1 n\u0103m 2022", "VKU,Y D\u01B0\u1EE3c,S\u01B0 Ph\u1EA1m K\u0129 Thu\u1EADt", "Ngh\u1EC7 An"},
				{"11", null, null, null, null},
			},
			new String[] {
				"Chuy\u1EBFn :", "\u0110\u1ECBa \u0110i\u1EC3m", "Th\u1EDDi Gian", "H\u1ECDc Sinh", "N\u01A1i \u0111\u1EBFn"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(20);
		table.getColumnModel().getColumn(0).setMinWidth(16);
		table.getColumnModel().getColumn(1).setPreferredWidth(190);
		table.getColumnModel().getColumn(1).setMinWidth(30);
		table.getColumnModel().getColumn(2).setPreferredWidth(153);
		table.getColumnModel().getColumn(2).setMinWidth(22);
		table.getColumnModel().getColumn(3).setPreferredWidth(66);
		table.getColumnModel().getColumn(4).setPreferredWidth(60);
		scrollPane.setViewportView(table);
		
		JButton btnNewButton = new JButton("Thoát");
		btnNewButton.setBackground(Color.RED);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(774, 520, 87, 40);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Trang Chủ");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				trangChuClick();
			}
		});
		btnNewButton_1.setBackground(Color.RED);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1.setBounds(26, 520, 132, 40);
		contentPane.add(btnNewButton_1);
		
		txtTruynThngVit = new JTextField();
		txtTruynThngVit.setBackground(Color.ORANGE);
		txtTruynThngVit.setHorizontalAlignment(SwingConstants.CENTER);
		txtTruynThngVit.setFont(new Font("Tahoma", Font.BOLD, 21));
		txtTruynThngVit.setForeground(Color.BLACK);
		txtTruynThngVit.setText("Khách Sạn Dinh Tuan Kiet Xin Hân Hạnh Được Phục Vụ Qúy Khách");
		txtTruynThngVit.setBounds(100, 407, 718, 69);
		contentPane.add(txtTruynThngVit);
		txtTruynThngVit.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(174, 77, 546, 2);
		contentPane.add(separator);
		
		txtLchTrnhn = new JTextField();
		txtLchTrnhn.setBackground(Color.RED);
		txtLchTrnhn.setForeground(Color.WHITE);
		txtLchTrnhn.setHorizontalAlignment(SwingConstants.CENTER);
		txtLchTrnhn.setFont(new Font("Tahoma", Font.BOLD, 24));
		txtLchTrnhn.setText("Danh Sách Các Phòng");
		txtLchTrnhn.setBounds(217, 15, 449, 52);
		contentPane.add(txtLchTrnhn);
		txtLchTrnhn.setColumns(10);
	}
	public void trangChuClick() {
		new TrangChu().setVisible(true);
		this.dispose();
	}
}
