package bai5;

public class Diem {
	private double x,y;
	public Diem() {
		super();
	}
	public Diem(double x, double y) {
		this.x = x;
		this.y = y;
	}
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	public void setX(double x) {
		this.x = x;
	}
	public void setY(double y) {
		this.y = y;
	}
	public double reckonSpace(double x, double y) {
		return Math.abs(y-x);
	}
	
//	public double reckonSpace(Diem diem) {
//		
//	}
}
