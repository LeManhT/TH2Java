package bai3;
import java.util.Scanner;
public class TaiKhoan {
	private String soTaiKhoan,hoTen;
	private int soTien;
	Scanner scanner = new Scanner(System.in);
	public TaiKhoan() {
		super();
	}
	public TaiKhoan(String soTaiKhoan,String hoTen,int soTien) {
		this.soTaiKhoan = soTaiKhoan;
		this.hoTen = hoTen;
		this.soTien = soTien;
	}
	public String getSoTaiKhoan() {
		return soTaiKhoan;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public int getSoTien() {
		return soTien;
	}
	public String napTien() {
		int tienNap;
		System.out.print("Moi nhap so tien can nap :");
		tienNap = scanner.nextInt();
		this.soTien = soTien + tienNap;
		String result = "Tong so tien cua ban la : " + soTien;
		return result;
	}
	public String rutTien( ) {
		int tienRut;
		System.out.print("Moi nhap so tien can rut :");
		tienRut = scanner.nextInt();
		this.soTien = soTien - tienRut;
		String result = "So du cua ban la : " + soTien;
		return result;
	}
}
