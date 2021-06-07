package ex2;

public class Doc {
	int qtDoc;
	
	public Doc() {
		qtDoc++;
	}
	
	public void transferir(Cliente c1, Cliente c2, double quantia) {
		boolean valido;
		valido = c1.sacar(quantia);
		if (valido == true) {
			c2.depositar(quantia);
		}
		else
			System.out.println("Erro na Transferencia, valor indisponivel");
	}
}
