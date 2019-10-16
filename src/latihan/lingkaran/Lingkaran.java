package latihan.lingkaran;

public class Lingkaran {
	private double diameter;
	private double radius;
	public Lingkaran(double diameter) {
		this.diameter = diameter;
		this.radius = diameter/2;
	}
	
	public double Keliling() {
		return Math.PI * diameter;
	}
	public double Luas() {
		return Math.PI * radius * radius;
	}
	public double getRadius() {
		return radius;
	}
}
