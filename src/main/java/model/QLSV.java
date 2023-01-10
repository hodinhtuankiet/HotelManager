package model;

import java.util.ArrayList;

public class QLSV {
	private ArrayList<thiSinh> thisinh ;
	private String choose;

	public QLSV() {
		this.thisinh = new ArrayList<thiSinh>();
		this.choose = "";
	}

	public void setChoose(String choose) {
		this.choose = choose;
	}

	public QLSV(ArrayList<thiSinh> thisinh) {
		this.thisinh = thisinh;
	}

	public ArrayList<thiSinh> getThisinh() {
		return thisinh;
	}

	public void setThisinh(ArrayList<thiSinh> thisinh) {
		this.thisinh = thisinh;
	}
	public void insert(thiSinh o ) {
		this.thisinh.add(o);
	}
	public void remove(thiSinh o ) {
		this.thisinh.remove(o);
	}
	public void update(thiSinh o) {
		this.thisinh.remove(o);
		this.thisinh.add(o);
	}
	public String getChoose() {
		return choose;
	}


	public boolean kiemtrathisinhtontai(thiSinh thisinh2) {
		for (thiSinh thiSinh2 : thisinh) {
			if(thiSinh2.getMaThiSinh() == thisinh2.getMaThiSinh()) {
				return true;
			}
		}
		return false;
	}

}
