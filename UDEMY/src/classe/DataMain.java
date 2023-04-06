package classe;

public class DataMain {
public static void main(String[] args) {
	 Data d = new Data();
	 
	 
	
	 var d1 = new Data(31,12,2020); // criei outra instancia com os mesmos objetos
	
	 System.out.println(d.obterDataFormatada());
	 System.out.println(d1.obterDataFormatada());
}
}
