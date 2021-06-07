package ex1;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.ArrayList;

public class Estante {
	private String nome;
	private Categoria categoria;
	private HashMap<String,Livro> livros;
	private ArrayList<String> autores;
	
	public Estante(String nome, Categoria categoria) {
		this.nome = nome;
		this.categoria = categoria;
		this.livros = new HashMap<String,Livro>();
		this.autores = new ArrayList<String>();
	}
	
	public String getNome() {
		return nome;
	}

	public Categoria getCategoria() {
		return categoria;
	}
	
	public void inserirLivro(Livro livro) {
		livros.put(livro.getNome(), livro);
		autores.add(livro.getAutor());
		System.out.println("\nLivro Inserido na Estante " + nome);
	}
	
	public void removerLivro(Livro livro) {
		livros.remove(livro.getNome(), livro);
		autores.remove(livro.getAutor());
		System.out.println("\nLivro Removido da Estante " + nome);
	}
	
	public Livro buscarLivro(String nome) throws Exception{
		Livro aux = livros.get(nome);
		if (aux == null)
			throw new Exception("Livro n encontrado em " + nome);
		else
			return aux;
	}
	
	public void listarLivros() {
		for(Entry<String,Livro> registro : livros.entrySet()) {
			registro.getValue().infos();
		}
	}
	
	public void mostrarAutores() {
		int n = autores.size();
		int i=0;
		System.out.println("Autores da estante " + nome + ":");
		for(i=0; i<n; i++) {
			System.out.println(autores.get(i));
		}
	}
}
