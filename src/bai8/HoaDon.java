package bai8;

public class HoaDon {
	private String maHoaDon;
	private KhachHang khachHang;
	private int tienTra;
	public HoaDon(String maHoaDon,KhachHang khachHang,int tienTra) {
		this.maHoaDon=maHoaDon;
		this.khachHang=khachHang;
		this.tienTra= tienTra;
	}
	public String getMaHoaDon() {
		return maHoaDon;
	}
	public int tienTra () {
		return tienTra;
	}
	public KhachHang getKhachHang (KhachHang khachHang) {
		return khachHang;
	}
	public String getHoTenKH (KhachHang khachHang) {
		return khachHang.getHoTen();
	}
	public void setTienTra (int tienTra) {
		this.tienTra = tienTra;
	}
	public double reckonMoney (int tienTra) {
		return tienTra - tienTra * khachHang.getGiamGia();
	}
	
}
