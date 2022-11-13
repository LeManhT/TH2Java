package bai7;

public class KiemTra {
	public static void main(String[] args) {
		TacGia tacgia1 = new TacGia ("tg1","Dinh Cong Tuan", "tuanyeuTra@gmail.com","tt1");
		Sach sach = new Sach("s1","sach 1",20000,200, tacgia1);
		System.out.print(sach);
	}
}
