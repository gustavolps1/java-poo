package mamifero;

import application.Animal;

public abstract class Mamifero extends Animal {

	protected Mamifero(String nome_, int tamanho_, String raca_, int saude_) {
		super(nome_, tamanho_, raca_, saude_);
		// TODO Auto-generated constructor stub
	}

	public abstract void amamentar();

}
