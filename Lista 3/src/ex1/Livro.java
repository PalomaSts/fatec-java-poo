package ex1;

public class Livro {
	private String nome;
	private String autor;
	private int anoPubli;
	
	public Livro(String nome, String autor, int anoPubli) {
		this.nome = nome;
		this.autor = autor;
		this.anoPubli = anoPubli;
	}

	public String getNome() {
		return nome;
	}
		
	public String getAutor() {
		return autor;
	}

	public int getAnoPubli() {
		return anoPubli;
	}
	
	public void infos() {
		System.out.println("\nLivro: " + getNome() + " / Autor: " + getAutor() + " / Ano Publicacao: " + getAnoPubli());
	}
}
