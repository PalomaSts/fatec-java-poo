package ex1;

public class Churrasco{
	double qtdCarne;
	
	public static void verificarConsumo(Pessoa x){
		if (x.vegetariana == true || x.idade <= 3)
				System.out.println("Essa pessoa não consome");
		else if (x.idade >= 4 && x.idade <= 12)
			System.out.println("Essa pessoa consome 1kg");
		else if (x.idade >12)
			System.out.println("Essa pessoa consome 2kg");
		else
			System.out.println("Idade invalida");
	}
}