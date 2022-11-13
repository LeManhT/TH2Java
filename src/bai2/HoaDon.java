package bai2;

public class HoaDon {
	private String maHoaDon,moTa;
	private int soLuong,DonGia;
	public HoaDon() {
		super();
	}
	public HoaDon(String maHoaDon,String moTa,int soLuong,int DonGia) {
		super();
		this.maHoaDon = maHoaDon;
		this.moTa = moTa;
		this.soLuong = soLuong;
		this.DonGia = DonGia;
	}
	public String getMaHoaDon() {
		return maHoaDon;
	}
	
	public String getMoTa() {
		return moTa;
	}
	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	public int getDonGia() {
		return DonGia;
	}
	public void setDonGia(int DonGia) {
		this.DonGia = DonGia;
	}
	public int countMoney(int soLuong,int DonGia) {
		return soLuong * DonGia;
	}
}
