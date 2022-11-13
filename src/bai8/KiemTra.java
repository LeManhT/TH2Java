package bai8;

public class KiemTra {

	public static void main(String[] args) {
		KhachHang kh1 = new KhachHang("kh1","ten 1",20);
		HoaDon hd1 = new HoaDon ("hd1",kh1,200000);
		System.out.println(hd1.reckonMoney(200000));
	}
}
