package fundamentos1;

public class Desafioaritmeticos {
	public static void main(String[] args) {
		
		int div1 = 6*(3+2);
		double dive1 =Math.pow(div1, 2);
		dive1 = dive1/(3*2);
		System.out.println(dive1);
		
		int div2 = (1-5)*(2-7)/2;
		double dive2 = Math.pow(div2, 2);
		System.out.println(div2);
		
		double res1 = dive1-dive2;
		double res2 = Math.pow(res1, 3);
		double t = Math.pow(10, 3);
		double total = res2 / t;
		System.out.println(total);
		
		
	
		
}
}
