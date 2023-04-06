package classe.desafio;

public class Pessoa {
	String nome;
	double peso;

	Pessoa(String nome, double peso) {
		this.peso = peso;
		this.nome = nome;
	}

	void comer(Comida comida) {
		if (comida != null) {
			this.peso += comida.peso;
		}
	}

	String apresentar() {
		return "Olá eu sou o"  + nome + "e tenho" + peso + "KG";
	}
}
