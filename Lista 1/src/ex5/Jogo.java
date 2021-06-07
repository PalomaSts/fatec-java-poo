package ex5;
import java.util.Random;

public class Jogo {
	public int sorteado;
	public int nmin=0;
	public int nmax=99;
	public int aux;
	
	public int sorteio() {
		Random geradorDeAleatorios = new Random();
        sorteado = geradorDeAleatorios.nextInt(100);
        return sorteado;
	}
	
	public void adivinha() {
		Random adivinharAleatorio = new Random();
		do {
			aux = adivinharAleatorio.nextInt(nmax - nmin + 1) + nmin;
			
			if (aux > sorteado) {
				nmax = aux;
			}
			if (aux < sorteado) {
				nmin = aux;
			}
		}while(aux != sorteado);
		
		System.out.println("Sorteado: " + sorteado + " Adivinhado: " + aux);
	}
	
}
