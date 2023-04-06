package lambdas;

import java.util.function.Predicate;

public class Predicado {
	public static void main(String[] args) {
		Predicate<Produto> iscaro = // Todo predicado recebe 1 unico parametro e retornar True ou false
				prod -> (prod.preco * (1- prod.desconto)) >= 750;
		Produto produto = new Produto("Notebook", 3893.89, 0.85);
		System.out.println(iscaro.test(produto));
	}
}
