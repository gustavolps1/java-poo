package application;

public abstract class Animal {

	private String nome;
	private int tamanho;
	private String raca;
	private int saude;

	public abstract void emitirSom();

	public Animal(String nome, int tamanho, String raca, int saude) {
		super();
		this.nome = nome;
		this.tamanho = tamanho;
		this.raca = raca;
		this.saude = saude;
	}

	public Animal() {

	}

	public abstract void alimentar();

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getSaude() {
		return saude;
	}

	public void setSaude(int saude) {
		this.saude = saude;
	}
}
