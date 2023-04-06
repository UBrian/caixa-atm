package oo.heranca.teste;

import oo.heranca.Heroi;
import oo.heranca.Jogador;

public class Jogo  {
	public static void main(String[] args) {
		Monstro jogador = new Monstro();
		jogador.x = 10;
		jogador.y = 10;

		Heroi heroi = new Heroi();
		heroi.x = 10;
		heroi.y = 11;

		System.out.println("Monstro tem:" + jogador.vida);
		System.out.println("Heroi tem:" + heroi.vida);
		
		jogador.atacar(heroi);
		heroi.atacar(jogador);
		jogador.atacar(heroi);
		heroi.atacar(jogador);
		jogador.atacar(heroi);
		heroi.atacar(jogador);

		System.out.println("Monstro tem:" + jogador.vida);
		System.out.println("Heroi tem:" + heroi.vida);

	}
}
