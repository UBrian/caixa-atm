package oo.composicao;

public class CarroTeste {
	public static void main(String[] args) {
		Carro c1 = new Carro();
		System.out.println(c1.estaLigado());

		c1.ligar();
		System.out.println(c1.estaLigado());

		System.out.println(c1.motor.giros());

		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();

		System.out.println(c1.motor.giros());

		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();

		//Relação bidirecional, um carro tem um motor e um motor tem um carro
		//Relação bidirecional não utiliza sempre tem que tomar cuidado
		System.out.println(c1.motor.carro.motor.giros());

		// Faltou Encapsulamento!!! c1.motorfatorInjecao= -30;

		System.out.println(c1.motor.giros());

	}
}
