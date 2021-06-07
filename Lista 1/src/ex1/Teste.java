package ex1;

public class Teste {
	
	public static void main (String[] args) throws Exception {
		Pessoa p = new Pessoa("Julio","M",2,false);
		
		Churrasco.verificarConsumo(p);
	}
}