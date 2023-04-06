package classe;

public class DesafioProduto {
	String nome;
	double preco;
	static final double desconto = 0.25;
	
	double Produto(double preco1){
		
		
		return preco1 * (1-desconto);
	}
}
