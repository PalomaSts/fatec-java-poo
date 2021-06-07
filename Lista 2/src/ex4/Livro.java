package ex4;

public class Livro {
	private String nome;
	private String codigo;
	private Categoria categoria;
	private double valor;
		
	public Livro(String nome, String codigo, Categoria categoria) {
		this.nome = nome;
		this.codigo = codigo;
		this.categoria = categoria;
		
		if(categoria.equals(Categoria.EPUB)) {
			valor = 20;
		}
		if(categoria.equals(Categoria.PDF)) {
			valor = 40;
		}
		if(categoria.equals(Categoria.FISICO)) {
			valor = 80;
		}
		
	}

	public void infos() {		
		System.out.println("\nLivro: " + nome + " / Categoria: " + categoria + " / Preço: " + valor);
	}

	public String getCodigo() {
		return codigo;
	}

}
