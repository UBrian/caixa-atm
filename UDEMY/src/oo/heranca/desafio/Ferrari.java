package oo.heranca.desafio;

public class Ferrari extends Carro implements Esportivo, Luxo {
	private boolean ligarTurbo;
	private boolean ligarAr;

	public Ferrari() {
		this(315); // caso eu nao informe a velocidade maxima, vai considerar essa
	}

	public Ferrari(int velocidadeMAxima) {
		super(velocidadeMAxima);
	}

	@Override
	public void acelerar() {

		velocidadeatual += 15;
	}

	@Override
	public void frear() {
		velocidadeatual -= 15;
	}

	@Override
	public void ligarTurbo() {
		ligarTurbo = true;
	}

	@Override
	public void desligarTurbo() {
		ligarTurbo = false;
	}

	@Override
	public void ligarAR() {
		ligarAr = true;
	}

	@Override
	public void desligarAR() {
		ligarAr = false;
	}

}
