package ex4;

public class Teste {
	public static void main (String[] args) throws Exception{
		Loja a = new Loja(1);
		a.cadastrar(new Livro("Patinho feio","111",Categoria.EPUB));
		a.cadastrar(new Livro("Cachinhos Dourados","222", Categoria.PDF));
		a.cadastrar(new Livro("Os três porquinhos","333", Categoria.FISICO));
		
		a.listar();
		a.buscar("222").infos();
		
		a.cadastrar(new Livro("Mariazinha na estrada","444", Categoria.FISICO));
		a.listar();
	}
}
