package arrays;

public class Foreach { // Forech significa pra cada
	public static void main(String[] args) {

		double[] notas = { 9.9, 8.7, 7.2, 9.4 };
		for (double nota : notas) { // criou variavel nota que vai receber
									// as informações de cada elemento de notas
			System.out.println(nota);
		}

	}

}
