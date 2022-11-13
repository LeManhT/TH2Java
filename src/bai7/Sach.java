package bai7;

public class Sach {
	private String maSach,ten;
	private int gia,soTrang;
	private TacGia tacGia;
	public Sach() {
		super();	
		}
	public Sach (String maSach,String ten,int gia,int soTrang , TacGia tacGia) {
		super();
		this.maSach =maSach;
		this.ten = ten;
		this.gia = gia;
		this.soTrang= soTrang;
		this.tacGia = tacGia;
	}
	public String getMaSach() {
		return maSach;
	}
	public String getTen () {
		return ten;
	}
	public int getGia () {
		return gia;
	}
	public int getSoTrang () {
		return soTrang;
	}
	public TacGia getTacGia () {
		return tacGia;
	}
	public void setMaSach (String maSach) {
		this.maSach = maSach;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public void setGia (int gia) {
		this.gia = gia;
	}
	public void setSoTrang(int soTrang) {
		this.soTrang = soTrang;
	}
	public void setTacGia (TacGia tacGia) {
		this.tacGia = tacGia;
	}
	public String toString () {
		return "[Mã sách: " + maSach + 
				", Tên sách: " + ten + 
				", Giá: " + gia + 
				", Số trang: " + soTrang +
				", Tác giả: " + tacGia.toString() + "]";
	}
}
