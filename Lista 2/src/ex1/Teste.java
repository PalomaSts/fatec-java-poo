package ex1;

public class Teste {
	public static void main (String args []) {
		Partido p1 = new Partido("amor","ambientalista","aa",20);
		Partido p2 = new Partido("banco","capitalista","bc",30);
		Partido p3 = new Partido("cachorro","liberal","cl",40);
		
		Candidato c1 = new Candidato("joao",true);
		Candidato c2 = new Candidato("maria",true);
		Candidato c3 = new Candidato("chato",false);
		Candidato c4 = new Candidato("luiz",true);
		Candidato c5 = new Candidato("nina",true);
		Candidato c6 = new Candidato("cretino",false);
		
		p1.incluir(c1);		
		p1.incluir(c2);
		p1.incluir(c3);
		p2.incluir(c4);
		p3.incluir(c5);
		p3.incluir(c6);
		
		p1.listar();
		p2.listar();
		p3.listar();
		
		p1.excluir(c1);
		p3.incluir(c1);
		
		p1.listar();
		p2.listar();
		p3.listar();		
	}
}
