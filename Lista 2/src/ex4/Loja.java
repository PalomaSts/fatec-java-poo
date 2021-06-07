package ex4;

import java.util.HashMap;
import java.util.Map.Entry;

public class Loja {
	private int codLoja;
	private HashMap<String,Livro> livros;
	
	public Loja(int codLoja) {
		this.codLoja = codLoja;
		this.livros = new HashMap<String,Livro>();
	}
	
	public void cadastrar(Livro l) {
		livros.put(l.getCodigo(), l);
	}
	
	public Livro buscar(String codigo) throws Exception{
		Livro aux = livros.get(codigo);
		if (aux == null) 
			throw new Exception("Livro nao encontrado na Loja " + codLoja);
		else
			return aux;
	}
	
	public void listar() {
		for(Entry<String,Livro> registro : livros.entrySet()) {
			registro.getValue().infos();
		}
	}
}
