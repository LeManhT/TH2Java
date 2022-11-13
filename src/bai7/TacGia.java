package bai7;

public class TacGia {
	private String maTacGia,ten,email,thongTinTacGia;
	public TacGia() {
		super();
	}
	public TacGia(String maTacGia,String ten,String email, String thongTinTacGia) {
		super();
		this.maTacGia = maTacGia;
		this.ten = ten;
		this.email = email;
		this.thongTinTacGia = thongTinTacGia;
	}
	public String getMaTacGia () {
		return maTacGia;
	}
	public String getTen() {
		return ten;
	}
	public String getEmail () {
		return email;
	}
	public String getThongTinTacGia() {
		return thongTinTacGia;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setThongTinTacGia (String thongTinTacGia) {
		this.thongTinTacGia = thongTinTacGia;
	}
	public String toString() {
		return "[Mã Tác Giả: " + maTacGia + 
				", tên tác giả: " + ten + 
				", email: " + email + 
				", thông tin tác giả: " + thongTinTacGia +
				"]";
	}
}
