package controller;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

//import model.Tinh;
import model.thiSinh;


public class DAO {
	private Connection conn;
	public  DAO() {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			
			String url = "jdbc:sqlserver://localhost:1433;database=Doan;encrypt=true;trustServerCertificate=true;";
			String user = "sa";
			String password = "123456";
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("Get a connection");
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
	public boolean addStudent(thiSinh s) {
		String sql = "INSERT INTO KhachHang(NumberRoom,NameCustomer,Hometown,Date,Gender,DateCheckin,Room,Price)"
				+ "VALUES(?,?,?,?,?,?,?,?)";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, s.getMaThiSinh()+"");
			ps.setString(2, s.getTenThiSinh());
			ps.setString(3, s.getQueQuan()+"");
			ps.setDate(4, new Date(s.getNgaySinh().getTime()));
			ps.setString(5, s.isGioiTinh()+"");
			ps.setDate(6, new Date(s.getDiemMon1().getTime()));
			ps.setString(7, s.getDiemMon2()+"");
			ps.setString(8, s.getDiemMon3()+"");
			
			return ps.executeUpdate()>0; 
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	public ArrayList<thiSinh> getListStudent(){
		ArrayList<thiSinh> list = new ArrayList<thiSinh>();
		String sql = "SELECT * FROM KhachHang";
		try {
			PreparedStatement ps2 = conn.prepareStatement(sql);
			ResultSet rs = ps2.executeQuery();
			while(rs.next()) {
				thiSinh ts = new thiSinh();
				ts.setMaThiSinh(rs.getInt("NumberRoom"));
				ts.setTenThiSinh(rs.getString("NameCustomer"));
				ts.setQueQuan( rs.getString("Hometown"));
				ts.setNgaySinh(rs.getDate("Date"));
				ts.setGioiTinh(rs.getString("Gender"));
				ts.setDiemMon1(rs.getDate("DateCheckin"));
				ts.setDiemMon2(rs.getFloat("Room"));
				ts.setDiemMon3(rs.getFloat("Price"));
				
				list.add(ts);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	public static void main(String[] args) {
		DAO connect = new DAO();
		System.out.println(connect.toString());
	}
}
