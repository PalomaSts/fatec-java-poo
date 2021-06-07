package ex1;

import java.util.Scanner;

public class TesteControle {
	public static void main (String[] args) throws Exception{
		Scanner ler = new Scanner(System.in);
		String auxBib;
		String auxNomes1;
		String auxNomes2;
		int auxInteiros = 0;
		Categoria auxCat = Categoria.CIENCIA;
		Estante auxEstante;
		Livro auxLivros;
		int menu = 0;
		int submenu = 0;
		
		System.out.println("\nNome da biblioteca:");
		auxBib = ler.next();
		Biblioteca bib = new Biblioteca(auxBib);
		
		do {
			System.out.println("\nMenu da Biblioteca "+ bib.getNome()
							+ "\n1 - Registrar Estante"
							+ "\n2 - Inserir livro"
							+ "\n3 - Remover livro"
							+ "\n4 - Listar livros de Filosofia"
							+ "\n5 - Contar livros de Ciencia"
							+ "\n6 - Listar todos os livros"
							+ "\n7 - Listar todos os autores"
							+ "\n0 - Encerrar");
			menu = ler.nextInt();
			
			switch(menu) {
				case 1:
					//registrar estante
					System.out.println("\nNome da estante: ");
					auxNomes1 = ler.next();
					do {
						System.out.println("\nCategoria da estante: "
								+ "\n1 - Ciencia"
								+ "\n2 - Literatura"
								+ "\n3 - Filosofia");
						submenu = ler.nextInt();
					}while(submenu != 1 && submenu != 2 && submenu != 3);
					if(submenu == 1)
						auxCat = Categoria.CIENCIA;
					if(submenu == 2)
						auxCat = Categoria.LITERATURA;
					if(submenu == 3)
						auxCat = Categoria.FILOSOFIA;
					bib.inserirEstante(new Estante(auxNomes1,auxCat));
					break;
				case 2:
					//inserir um livro
					System.out.println("\nEstante do livro: ");
					auxNomes1= ler.next();
					auxEstante = bib.buscarEstante(auxNomes1); //se der erro para o sistema? throws exception
					if (auxEstante == null) {
						System.out.println("Estante não encontrada");
					}
					else {
						System.out.println("\nNome do livro: ");
						auxNomes1= ler.next();
						System.out.println("\nAutor do livro: ");
						auxNomes2= ler.next();
						System.out.println("\nAno da publicacao do livro: ");
						auxInteiros= ler.nextInt();
						auxEstante.inserirLivro(new Livro(auxNomes1, auxNomes2, auxInteiros));
					}
					
					break;
				case 3:
					//remover um livro
					System.out.println("\nEstante do livro: ");
					auxNomes1= ler.next();
					auxEstante = bib.buscarEstante(auxNomes1); //se der erro para o sistema? throws exception
					System.out.println("\nNome do livro: ");
					auxNomes1= ler.next();
					auxLivros = auxEstante.buscarLivro(auxNomes1);
					auxEstante.removerLivro(auxLivros);
					break;
				case 4:
					//listar livros de filo
					bib.listarFilosofia();
					break;
				case 5:
					//contar livros de ciencia
					auxInteiros = bib.contarCiencia();
					System.out.println("\nQuantidade geral de livros de Ciencia: " + auxInteiros);
					break;
				case 6:
					//listar todos os livros
					bib.listarTudo();
					break;
				case 7:
					//listar todos os autores;
					bib.listarAutores();
					break;
				case 0:
					System.out.println("\nEncerrando...");
					break;
				default:
					System.out.println("\nTente novamente");
					break;
			}
		}while(menu != 0);
		
		ler.close();
	}
}
