package ex3;

public class Bateria {
	private int carga;
	
	public Bateria() {
		carga = 100;
	}

	public int getCarga() {
		return carga;
	}
	
	public void ligou() {
		carga = carga - 20;
	}
	
	public void desligou() {
		carga = carga - 10;
	}
}
