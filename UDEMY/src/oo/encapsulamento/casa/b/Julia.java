package oo.encapsulamento.casa.b;

import oo.encapsulamento.casa.a.Ana;

public class Julia {
	void teteAcessos() {
		Ana sogra = new Ana();

		System.out.println(sogra.segredo); // private
		System.out.println(sogra.facoDentroDeCasa); // default (mesmo pacote)
		System.out.println(sogra.formaDeFalar); // protected (Consegue acessar só por herança, nao precisa de instancia)
		System.out.println(sogra.todosSabem); // public
	}
}
