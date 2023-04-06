package lambdas;

import java.util.Arrays;
import java.util.List;

public class Foreach {
	public static void main(String[] args) {
		List<String> aprovados = Arrays.asList("Ana", "Bia", "Lia", "Gui");
		for (String nome : aprovados) {
			System.out.println(nome);
		}

		aprovados.forEach((nome) -> {
			System.out.println(nome + "!"); // forma mais simples usando lambda
		});

		aprovados.forEach(System.out::println);// imprimir passando direto pro print ln

		aprovados.forEach(nome -> meuImprimir(nome));
		
		aprovados.forEach(Foreach::meuImprimir);// imprimir passando direto pro print ln

	}

	static void meuImprimir(String nome) {
		System.out.println("oi, meu nome é" + nome);
	}
}
