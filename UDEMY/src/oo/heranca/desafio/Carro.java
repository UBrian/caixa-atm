	package oo.heranca.desafio;

public class Carro {
	protected int velocidadeatual;
	public final int VELOCIDADE_MAXIMA; // por padrao atributo final tem que ser maiusculo


	protected Carro(int velocidadeMaxima) {
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}

	public void acelerar() {
		if (velocidadeatual + 5 > VELOCIDADE_MAXIMA) {
			velocidadeatual = VELOCIDADE_MAXIMA;
		} else
			velocidadeatual += 5;
	}

	public void frear() {

		if (velocidadeatual >= 5) {
			velocidadeatual -= 5;

		} else {
			velocidadeatual = 0;
		}
	}

	public String toString() {
		return "Velocidade atual do carro é:" + velocidadeatual + "KM/h";
	}
}
