package oo.encapsulamento.casa.b;

public class PessoaTeste {
public static void main(String[] args) {
	Pessoa p1 = new Pessoa("Pedro",30);
	p1.alterarIdade(100); // altera a idade
	
	System.out.println(p1.getIdade());
	System.out.println(p1);
}
}
