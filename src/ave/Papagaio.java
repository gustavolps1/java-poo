package ave;

import interfaces.AnimalSelvagem;

public class Papagaio extends Ave implements AnimalSelvagem {

	public Papagaio(String nome_, int tamanho_, String raca_, int saude_) {
		super(nome_, tamanho_, raca_, saude_);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Papagaio [getTamanho()=" + getTamanho() + ", getRaca()=" + getRaca() + ", getNome()=" + getNome()
				+ ", getSaude()=" + getSaude() + "]";
	}

	@Override
	public void voar() {
		System.out.println("Loro esta voando");

	}

	@Override
	public void emitirSom() {
		System.out.println("Barulho do loro");

	}

	@Override
	public void atacar() {
		System.out.println("Loro ataca");

	}

	@Override
	public void alimentar() {
		System.out.println("Loro esta comendo");

	}
}
