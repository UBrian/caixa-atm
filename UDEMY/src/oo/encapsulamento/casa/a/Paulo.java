package oo.encapsulamento.casa.a;

public class Paulo {
	void testeAcessos() {
		Ana esposa = new Ana();
		System.out.println(esposa.segredo); // private
		System.out.println(esposa.facoDentroDeCasa); // default (mesmo pacote)
		System.out.println(esposa.formaDeFalar); // protected (Consegue acessar só por herança, nao precisa de instancia)
		System.out.println(esposa.todosSabem); // public
	}
}
