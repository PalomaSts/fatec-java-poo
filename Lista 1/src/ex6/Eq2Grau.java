package ex6;

public class Eq2Grau {
	public double a;
	public double b;
	public double c;
	
		
	public Eq2Grau(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public double delta() {
		double d = ((Math.pow(b, 2)) - (4*a*c));
		return d;
	}
	
	public void raiz1(double d) throws Exception{
		if (d>(-1)) {
			double r1 = ((-b)+(Math.sqrt(d)))/(2*a);
			System.out.println("Primeira raiz: " + r1);
		}
		else 
			throw new Exception("NaN");
	}
	
	public void raiz2(double d) throws Exception {
		if (d>(-1)) {
			double r2 = ((-b)-(Math.sqrt(d)))/(2*a);
			System.out.println("Segunda raiz: " + r2);
		}
		else 
			throw new Exception("NaN");
	}
}
