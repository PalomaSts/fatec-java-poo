package ex2;

public class Cliente {
	private String nome;
	private double saldo;
	private double limite;
		
	public Cliente(String nome, double saldo, double limite) {
		this.nome = nome;
		this.saldo = saldo;
		this.limite = limite;
	}

	boolean sacar (double valor) {
		boolean valido;
		double disponivel = saldo + limite;
		double aux1;
		if(valor<=disponivel) {
			if(saldo>0) {
				if(saldo>=valor) {
					saldo = saldo - valor;
				}
				else {
					aux1 = valor - saldo; //qtd que sobra depois de tirar do saldo
					saldo = 0;
					limite = limite - aux1;
					System.out.println("\nSaque realizado");
					valido = true;
					return valido;
				}
			}
			else {
				limite = limite - valor;
				System.out.println("\nSaque realizado");
				valido = true;
				return valido;
			}
		}
		else
			System.out.println("\nValor de saque maior que o disponível");
			valido = false;
			return valido;
	}
	
	void depositar(double valor) {
		saldo = saldo + valor;
	}

	public String getNome() {
		return nome;
	}
	
	public double getSaldo() {
		return saldo;
	}

	public double getLimite() {
		return limite;
	}

	public void checarSaldo() {
		System.out.println("\nSaldo: " + getSaldo() + " + Limite: " + getLimite());
	}

	
	
}
