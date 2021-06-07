package ex7;

public class Porta {
	private boolean isOpen;
	private static int numAberturas;
	
	public Porta() {
		isOpen = false;
	}
	
	public void abrir() {
		if (isOpen == false) {
			isOpen = true;
			numAberturas++;
		}
		else
			System.out.println("Porta ja esta aberta");
	}
	
	public void fechar(){
		if (isOpen == true) {
			isOpen = false;
		}
		else
			System.out.println("Porta ja esta fechada");
	}
	
	public static void mostrarAberturas() {
		System.out.println("Quantidade de aberturas de portas: " + numAberturas);
	}
}
