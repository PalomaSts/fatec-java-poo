package ex2;
import java.util.Scanner;

public class Teste {
	
	public static void main(String args []){
		int aux1 = 0;
		
		Lampada l = new Lampada(0,0);
		Scanner s = new Scanner(System.in);
		
		do {
			
			System.out.println("\n 1 - Click\n 2 - Estado da lampada\n 3 - Sair");
			int aux = s.nextInt();
						
			switch (aux) {
			case 1:
				l.click();
				l.mostraEstado();
				break;
			case 2:
				l.mostraEstado();
				break;
			default:
				aux1 = aux;
			}			
		}while(aux1 != 3);
		
		s.close();
	}
}