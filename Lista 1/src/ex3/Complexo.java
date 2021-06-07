package ex3;

public class Complexo{
	double a;
	double b;
	
	public Complexo(double a, double b) {
		this.a = a;
		this.b = b;
	}
	
	public void soma(double c, double d) {
		double aux1;
		double aux2;
		
		aux1 = a + c;
		aux2 = b + d;
		
		System.out.println("Soma: " + aux1 + " + " + aux2 + "i");
	}
	
	public void multiplica (double c, double d) {
		double aux1;
		double aux2;
		
		aux1 = ((a*c)-(b*d));
		aux2 = ((a*d)+(b*c));
		
		System.out.println("Multiplicação: " + aux1 + " + " + aux2 + "i");
	}
	
	public void ttoString () {
		System.out.println("Notação: " + a + " + " + b + "i");
	}
	
	public void modulo () {
		double aux1;
		
		aux1 = Math.sqrt(((Math.pow(a, 2))+(Math.pow(b, 2))));
		
		System.out.println("Modulo: " + aux1);
	}
	
	public void argumentoPrincipal () {
		double aux1;
		double aux2;
		
		aux1 = b / a;
		aux2 = Math.tan(aux1);
		
		System.out.println("ângulo formado pelo número complexo no plano de argand-gauss: " + aux2);
	}
}