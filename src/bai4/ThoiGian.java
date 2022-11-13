package bai4;

public class ThoiGian {
	private int hour,minute,second;
	public ThoiGian() {
		super();
	}
	public ThoiGian(int hour,int minute,int second) {
	if(hour > 24 || hour < 0) {
		System.out.println("So gio khong hop le. Moi ban nhap lai !");
	} else {
		this.hour = hour;
	}

	if(minute > 60 || minute < 0) {
		System.out.println("So phut khong hop le. Moi ban nhap lai !");
	} else {
		this.minute = minute;
	}
	
	if(second > 60 || second < 0) {
		System.out.println("So giay khong hop le. Moi ban nhap lai !");
	}else {
		this.second = second;
	}
	}
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	public int getMinute () {
		return minute;
	}
	public void setMinute(int minute) {
		this.minute = minute;
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		this.second = second;
	}
	public void increaseSecond() {
		this.second = this.second + 1;
	}
	public void decreaseSecond() {
		this.second = this.second - 1;
	}
}
