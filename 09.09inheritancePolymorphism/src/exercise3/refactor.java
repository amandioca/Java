package exercise3;

import java.util.ArrayList;

public class refactor {

	public class Estoque {


	    public static void main(String[] args) {


	    String dpt1 = "Quant de camisetas: 500";
	    String dpt2 = "Quant de calças: 400";
	    String dpt3 = "Quant de shots: 300";
	    String dpt4 = "Quant de meia-calça: 250";

	    ArrayList<String> Estoque = new ArrayList<>();
	    Estoque.add(dpt1);
	    Estoque.add(dpt2);
	    Estoque.add(dpt3);
	    Estoque.add(dpt4);

	    System.out.println("O estoque da loja" +Estoque);


	    System.out.println("Estoque");
	    Estoque.remove(2);
	    System.out.println("O estoque da loja foi atualizado" + Estoque); 

	    }
	}
}
