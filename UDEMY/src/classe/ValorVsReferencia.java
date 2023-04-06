package classe;

public class ValorVsReferencia {
	public static void main(String[] args) {

		double a = 2;
		double b = a; // atribuição por valor (tipo primitivo)

		a++;
		b--;
		System.out.println(a+" "+b);
		 Data d1 = new Data(1,6,2022);
		 Data d2 = d1; // Atribuição por referência (objeto)
		 
		 d1.dia = 31;
		 d2.mes = 12;
		 d1.ano = 2025;
		 // Logo acima está fazendo referencia ou seja o que mecher em 1 objeto 
		 // vai modificar também em outro
		 System.out.println(d1.obterDataFormatada());
		 System.out.println(d2.obterDataFormatada());
	}

}
