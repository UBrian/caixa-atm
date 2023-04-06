package oo.composicao;

public class CompraTeste {
public static void main(String[] args) {
	 Compra compra1 = new Compra();
	 compra1.cliente = "joão Pedro";
	 compra1.itens.add(new Item("Caneta",20,7.45));
	 compra1.itens.add(new Item("Borracha",12,3.89));
	 compra1.itens.add(new Item("Caderno",3,18.79));
	 
	 System.out.println(compra1.itens.size());// quantidade de cadastro
System.out.println(compra1);
}
}
