package ex7;

public class Teste {
	public static void main (String args []) {
		Porta a = new Porta();
		Porta b = new Porta();
		Porta c = new Porta();
		
		a.abrir();
		b.abrir();
		c.abrir();
		b.fechar();
		c.fechar();
		b.abrir();
		c.fechar();
		b.fechar();
		c.abrir();
		
		Porta.mostrarAberturas();
	}
}
