package bai8;

public class KhachHang {
	private String maKhachHang ,hoTen;
	private double giamGia;
	public KhachHang(String maKhachHang,String hoTen,double giamGia) {
		this.maKhachHang = maKhachHang;
		this.hoTen = hoTen;
		this.giamGia =  giamGia/100;
	}
	public String getMaKhachHang () {
		return maKhachHang;
	}
	public String getHoTen() {
		return hoTen;
	}
	public double getGiamGia () {
		return giamGia;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public void setGiamGia (double giamGia) {
		this.giamGia = giamGia;
	}
}
