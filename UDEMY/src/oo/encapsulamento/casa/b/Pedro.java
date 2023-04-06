package oo.encapsulamento.casa.b;

import oo.encapsulamento.casa.a.Ana;

public class Pedro extends Ana {
	

	void testeAcessos() {
		
		// segredo
		// facoDentroDeCasa
		// formaDeFalar
		// todosSabem
		System.out.println(mae.segredo); // private
		System.out.println(mae.facoDentroDeCasa); // default (mesmo pacote)
		System.out.println(formaDeFalar); // protected (Consegue acessar só por herança, nao precisa de instancia)
		System.out.println(todosSabem); // public

		
	}

}
