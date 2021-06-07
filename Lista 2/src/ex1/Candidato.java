package ex1;

import java.util.ArrayList;

public class Candidato {
	private String nome;
	private boolean brasileiro;
	private ArrayList<Partido> partido;
		
	public Candidato(String nome, boolean brasileiro) {
		this.nome = nome;
		this.brasileiro = brasileiro;
		this.partido = new ArrayList<Partido>();
	}
			
	public boolean isBrasileiro() {
		return brasileiro;
	}

	void associar(Partido c) {
		if (c != null)
			partido.add(c);
	}
	
	void desassociar(Partido c) {
		if (c != null)
			partido.remove(c);
	}
	
	void mostrarDados() {
		System.out.println("Candidato: "+ nome);
	}
}
