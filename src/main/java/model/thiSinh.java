package model;

import java.util.Date;
import java.util.Objects;

public class thiSinh {
	private int maThiSinh;
	private String tenThiSinh;
	private String queQuan;
	public Date ngaySinh;
	private String gioiTinh;
	private Date diemMon1;
	private float diemMon2, diemMon3;

	public thiSinh(int maThiSinh, String tenThiSinh, String queQuan, Date ngaySinh, String gioiTinh, Date diemMon1,
			float diemMon2, float diemMon3) {
		super();
		this.maThiSinh = maThiSinh;
		this.tenThiSinh = tenThiSinh;
		this.queQuan = queQuan;
		this.ngaySinh = ngaySinh;
		this.gioiTinh = gioiTinh;
		this.diemMon1 = diemMon1;
		this.diemMon2 = diemMon2;
		this.diemMon3 = diemMon3;
	}

	public thiSinh() {

	}

	public int getMaThiSinh() {
		return maThiSinh;
	}

	public void setMaThiSinh(int maThiSinh) {
		this.maThiSinh = maThiSinh;
	}

	public String getTenThiSinh() {
		return tenThiSinh;
	}

	public void setTenThiSinh(String tenThiSinh) {
		this.tenThiSinh = tenThiSinh;
	}

	public String getQueQuan() {
		return queQuan;
	}

	public void setQueQuan(String queQuan) {
		this.queQuan = queQuan;
	}

	public Date getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public String isGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public Date getDiemMon1() {
		return diemMon1;
	}

	public void setDiemMon1(Date diemMon1) {
		this.diemMon1 = diemMon1;
	}

	public float getDiemMon2() {
		return diemMon2;
	}

	public void setDiemMon2(float diemMon2) {
		this.diemMon2 = diemMon2;
	}

	public float getDiemMon3() {
		return diemMon3;
	}

	public void setDiemMon3(float diemMon3) {
		this.diemMon3 = diemMon3;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((diemMon1 == null) ? 0 : diemMon1.hashCode());
		result = prime * result + Float.floatToIntBits(diemMon2);
		result = prime * result + Float.floatToIntBits(diemMon3);
		result = prime * result + ((gioiTinh == null) ? 0 : gioiTinh.hashCode());
		result = prime * result + maThiSinh;
		result = prime * result + ((ngaySinh == null) ? 0 : ngaySinh.hashCode());
		result = prime * result + ((queQuan == null) ? 0 : queQuan.hashCode());
		result = prime * result + ((tenThiSinh == null) ? 0 : tenThiSinh.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		thiSinh other = (thiSinh) obj;
		if (diemMon1 == null) {
			if (other.diemMon1 != null)
				return false;
		} else if (!diemMon1.equals(other.diemMon1))
			return false;
		if (Float.floatToIntBits(diemMon2) != Float.floatToIntBits(other.diemMon2))
			return false;
		if (Float.floatToIntBits(diemMon3) != Float.floatToIntBits(other.diemMon3))
			return false;
		if (gioiTinh == null) {
			if (other.gioiTinh != null)
				return false;
		} else if (!gioiTinh.equals(other.gioiTinh))
			return false;
		if (maThiSinh != other.maThiSinh)
			return false;
		if (ngaySinh == null) {
			if (other.ngaySinh != null)
				return false;
		} else if (!ngaySinh.equals(other.ngaySinh))
			return false;
		if (queQuan == null) {
			if (other.queQuan != null)
				return false;
		} else if (!queQuan.equals(other.queQuan))
			return false;
		if (tenThiSinh == null) {
			if (other.tenThiSinh != null)
				return false;
		} else if (!tenThiSinh.equals(other.tenThiSinh))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "thiSinh [maThiSinh=" + maThiSinh + ", tenThiSinh=" + tenThiSinh + ", queQuan=" + queQuan + ", ngaySinh="
				+ ngaySinh + ", gioiTinh=" + gioiTinh + ", diemMon1=" + diemMon1 + ", diemMon2=" + diemMon2
				+ ", diemMon3=" + diemMon3 + "]";
	}

}
