package arrays;

import java.util.Arrays;

public class Exercicio {
	public static void main(String[] args) {
		double[] notasAlunoA = new double[3]; // atribuindo qtd de notas

		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 5.0;

		System.out.println(Arrays.toString(notasAlunoA)); // toString faz exibir os dados salvos no array

		double totalAlunoA = 0;
		for (int i = 0; i < notasAlunoA.length; i++) { // .length percorre pelo array pra saber quantas
														// posições tem criadas nele
			totalAlunoA += notasAlunoA[i];

		}
		System.out.println(totalAlunoA / notasAlunoA.length);

		double[] notasAlunoB = { 6.9, 8.9, 5.5, 10 };// neste cado iniciei um array ja colocando os dados
														// mas dessa forma é pouco usado
		
		double totalAlunoB = 0;
		for (int i = 0; i < notasAlunoB.length; i++) {
			totalAlunoB += notasAlunoB[i];

		}
		System.out.println(totalAlunoB / notasAlunoB.length);

	}
}
