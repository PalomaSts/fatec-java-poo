package ex1;

import java.util.HashMap;
import java.util.Map.Entry;

public class Biblioteca {
	private String nome;
	private HashMap<String,Estante> estantes;
	
	public Biblioteca(String nome) {
		this.nome = nome;
		this.estantes = new HashMap<String,Estante>();
	}

	public String getNome() {
		return nome;
	}

	public void inserirEstante (Estante estante) {
		estantes.put(estante.getNome(), estante);
		System.out.println("\nEstante criada na Biblioteca " + nome);
	}
	
	public Estante buscarEstante(String nomeE) /*throws Exception*/{ //como retornar erro caso nao ache a estante sem parar a compilação?
		Estante aux = estantes.get(nomeE);
		if (aux == null)
			return null;
			//throw new Exception("Estante n encontrada em " + nome);
		else
			return aux;
	}
	
	public void listarFilosofia() {
		int cont=0;
		for(Entry<String,Estante> registro : estantes.entrySet()) {
			Estante aux = registro.getValue();
			if (aux.getCategoria() == Categoria.FILOSOFIA) {
				aux.listarLivros();
				cont++;
			}
			if (cont == 0) {
				System.out.println("\nNão há livros de Filosofia");
			}
		}
	}
		
	public int contarCiencia() throws Exception{
		int cont=0;
		for(Entry<String,Estante> registro : estantes.entrySet()) {
			Estante aux = registro.getValue();
			if (aux.getCategoria() == Categoria.CIENCIA)
				cont++;
		}
		return cont;
	}
	
	//tem como eu chamar todos os livros e todos os autores diretos pela classe Biblioteca sem passar pela classe Estante?
	public void listarTudo() {
		for(Entry<String,Estante> registro : estantes.entrySet()) {
			registro.getValue().listarLivros();
		}
	}
	
	public void listarAutores() {
		for(Entry<String,Estante> registro : estantes.entrySet()) {
			registro.getValue().mostrarAutores();
		}
	}
}
