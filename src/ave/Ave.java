package ave;

import application.Animal;

public abstract class Ave extends Animal {

	protected Ave(String nome_, int tamanho_, String raca_, int saude_) {
		super(nome_, tamanho_, raca_, saude_);
	}

	public abstract void voar();

}
