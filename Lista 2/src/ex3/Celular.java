package ex3;

public class Celular {
	private int numero;
	private String nomeUser;
	private Bateria bat;
	private boolean ligado;
	
	public Celular(int numero, String nomeUser) {
		this.numero = numero;
		this.nomeUser = nomeUser;
		this.bat = new Bateria();
	}
	

	void ligar() {
		if (ligado == false) {
			if(bat.getCarga() == 20) {
				System.out.println("\nBateria Fraca");
				bat.ligou();
				ligado = true;
			}
			if(bat.getCarga() > 20) {
				System.out.println("\nIdentificador: " + numero + " Usuario: " + nomeUser + " Bateria: " + bat.getCarga());
				bat.ligou();
				ligado = true;
			}
			else
				System.out.println("\n...");
		}
		else
			System.out.println("\nJá está ligado.");
	}
	
	void desligar() {
		if (ligado == true) {
			if(bat.getCarga() > 20) {
				System.out.println("\nTchau...");
				bat.desligou();
				ligado = false;
			}
			else {
				bat.desligou();
				ligado = false;
			}
		}
		else
			System.out.println("\nJá está desligado.");		
	}
	
	void tocarSom() {
		if (ligado == true) {
			if (bat.getCarga() > 10) {
				System.out.println("\nTocando um som...");
			}
			else
				System.out.println("\nBateria fraca para tocar um som");
		}
		else
			System.out.println("\n...");
	}
	
	void trocarBateria() {
		this.bat = new Bateria();
	}
}
