package ex2;

//import java.util.Scanner;

public class Teste {
	public static void main (String args []) {
		Doc x = new Doc();
				
		Cliente a = new Cliente("João",200.0,300.0);
		Cliente b = new Cliente("Maria",1000.0,500.0);
		
		a.sacar(300);
		a.checarSaldo();
		
		x.transferir(a, b, 100);
		
		a.checarSaldo();
		b.checarSaldo();
		
		//RODAR COM ENTRADA DE DADOS PELO TECLADO. (LEMBRAR DE TIRAR O COMENTARIO DO IMPORT)	
		/*
		Scanner ler = new Scanner(System.in);
		String n1, n2;
		Double s1, s2;
		Double l1, l2;
		int aux = 0;
		Double quantia;
		
		System.out.println("Declare o primeiro Cliente:");
		System.out.println("Nome:");
		n1 = ler.next();
		System.out.println("Saldo:");
		s1 = ler.nextDouble();
		System.out.println("Limite:");
		l1 = ler.nextDouble();
		System.out.println("Declare o segundo Cliente:");
		System.out.println("Nome:");
		n2 = ler.next();
		System.out.println("Saldo:");
		s2 = ler.nextDouble();
		System.out.println("Limite:");
		l2 = ler.nextDouble();
		
		Cliente a = new Cliente(n1,s1,l1);
		Cliente b = new Cliente(n2,s2,l2);
		
		System.out.println("\n***CAIXA DO CLIENTE 1***\n");
		
		do {
			System.out.println("\n1 - Mostrar saldo \n2 - Sacar \n3 - Depositar \n4 - Tranferir \n5 - Fim");
			aux = ler.nextInt();
			switch (aux) {
			case 1: 
				a.checarSaldo();
				break;
			case 2:
				System.out.println("Valor do saqui:");
				quantia = ler.nextDouble();
				a.sacar(quantia);
				break;
			case 3:
				System.out.println("Valor do deposito:");
				quantia = ler.nextDouble();
				a.depositar(quantia);
				break;
			case 4:
				System.out.println("Valor da transferencia:");
				quantia = ler.nextDouble();
				x.transferir(a, b, quantia);
				break;
			default:
				break;
			}					
		}while(aux!=5);
		
		ler.close();
		*/
		
	
	}
}
