package ex2;

public class Lampada {
	int estado;
	int contador;
	
	Lampada(int estado, int contador){
		this.estado = estado;
		this.contador = contador;
	}
	
	public void click() {
		if (contador >= 3) {
			estado = 0;
			System.out.println("A lampada está queimada");
		}
		
		else if (estado == 0) {
			estado = 1;
			contador++;
			System.out.println("Ligando a lampada...");
		}
		
			else {
				estado = 0;
				System.out.println("Desligando a lampada...");
			}
		
	}
	
	public void mostraEstado(){
		String z;
		if (estado == 0)
				z = "off";
		else
			z = "on";
		System.out.println("Estado da lampada = " + z);
	}
		
}