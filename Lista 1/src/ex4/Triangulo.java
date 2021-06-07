package ex4;

public class Triangulo{
	public double lado;
	public double perimetro;
	public double area;
	
	public Triangulo(double lado) {
		this.lado = lado;
	}
	
	public double calcArea() {
		area = (lado * ((Math.sqrt(3))/2));
		return area;
	}
	
	public double calcPerimetro() {
		perimetro = 3 * lado;
		return perimetro;
	}
	
	public void exibir() {
		System.out.println("Area = " + getArea());
		System.out.println("Perimetro = " + getPerimetro());
	}

	public double getPerimetro() {
		return perimetro;
	}

	public double getArea() {
		return area;
	}
	
}