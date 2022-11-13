package bai2;

public class KiemTra {
	public static void main(String[] args) {
		HoaDon hoadon1 = new HoaDon("hoaDon1","Mua dien thoai",1,200000);
		System.out.println(hoadon1.getMoTa());
		System.out.println(hoadon1.countMoney(2,40000));
	}
}
