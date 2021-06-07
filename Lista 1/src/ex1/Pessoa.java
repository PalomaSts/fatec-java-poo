package ex1;

public class Pessoa {
	String nome;
	String sexo;
	int idade;
	boolean vegetariana;
	
	/**
	public Pessoa (String nome, String sexo, int idade, boolean vegetariana) {
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.vegetariana = vegetariana;
	}
	**/
	
	
	public Pessoa(String nome, String sexo, int idade, boolean vegetariana) throws Exception {
		if(!nome.contentEquals("")) 
			this.nome = nome;
		else 
			throw new Exception("Nome nao pd ser vazio.");
		
		
		if(idade >= 0) 
			this.idade = idade;
		else
			throw new Exception("Idade nao pd ser vazia.");
		
		
		if(sexo.contentEquals("F") || sexo.contentEquals("M")) 
			this.sexo = sexo;
		else
			throw new Exception("Sexo diferente de F ou M");
		
		
		if(vegetariana == true || vegetariana == false)
			this.vegetariana = vegetariana;
		else
			throw new Exception("Veg precisa ser true ou false");
	}
	
}