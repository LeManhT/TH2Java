package bai1;
import java.util.Scanner;

public class NhanVien {
	private String maNhanVien,hoTen;
	protected int luong;
	public NhanVien() {
		super();
	}
	
	public NhanVien(String maNhanVien,String hoTen,int luong) {
		super();
		this.maNhanVien = maNhanVien;
		this.hoTen = hoTen;
		this.luong = luong;
	}
	
	public String getmaNhanVien() {
		return maNhanVien;
	}
	
	public String gethoTen() {
		return hoTen;
	}
	public void sethoTen(String hoTen) {
		this.hoTen=hoTen;
	}
	public int getluong() {
		return luong;
	}
	public void setluong(int luong) {
		this.luong = luong;
	}
	public int countLuongYear(int luong) {
		return 12*luong;
	}
	public float increaseLuong(int luong,int rate) {
		return luong * rate/100;
	}
	
}
