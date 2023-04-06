package oo.encapsulamento.casa.b;

public class Pessoa {
	private int idade;
	private String nome;

	public Pessoa(String nome, int idade) {
		setNome(nome);
		alterarIdade(idade);

	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome=nome;
	}

	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}
	

	public void alterarIdade(int novaIdade) {
		novaIdade = Math.abs(novaIdade);
		if (novaIdade >= 0 && novaIdade <= 120) {
			this.idade = novaIdade;
		}
	}
	public String toString() {
		return "Ola eu sou o"+getNome()+"tenho"+getIdade()+"anos.";
	}
}
