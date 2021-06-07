package ex6;

public class Teste {
	public static void main(String args []) throws Exception{
		Eq2Grau p = new Eq2Grau(1,8,-9); //1, 8, -9 tem raizes 1 e -9 mas 1,2,3 não tem raiz real 
				
		double aux = p.delta();
		p.raiz1(aux);
		p.raiz2(aux);
	}
}
