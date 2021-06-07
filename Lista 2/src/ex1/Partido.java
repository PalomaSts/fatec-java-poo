package ex1;

import java.util.ArrayList;

public class Partido {
	private String nome;
	private String ideologia; //trabalhista, ambientalista, socialista, liberal etc...
	private String sigla;
	private int num;
	private ArrayList<Candidato> candidatos;
	
	public Partido(String nome, String ideologia, String sigla, int num) {
		this.nome = nome;
		this.ideologia = ideologia;
		this.sigla = sigla;
		this.num = num;
		this.candidatos = new ArrayList<Candidato>();
	}
	
	public void incluir(Candidato candidato) {
		boolean aux1 = candidato.isBrasileiro();
		if (candidato != null) {
			if (aux1 == true) {
				candidatos.add(candidato);
				candidato.associar(this);
			}
			else
				System.out.println("\nCandidato não é brasileiro\n");
		}
	}
	
	public void excluir(Candidato candidato) {
		if(candidato != null) {
			candidatos.remove(candidato);
			candidato.desassociar(this);
		}
	}
	
	public void listar() {
		System.out.println("\nPartido: " + nome + " Sigla: " + sigla + " Num: " + num + " Ideo: " + ideologia);
		for(Candidato candidato : candidatos) {
			candidato.mostrarDados();
		}
	}
	
}
