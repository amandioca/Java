package exercise3;

public class testEletronic {

	public static void main(String[] args) {
	
		eletronic eletro = new eletronic();
		
		eletro.category = "Notebook";
		eletro.material = "Magnesium";
		eletro.model = "Avell A60 MUV";
		
		System.out.println("Category: " + eletro.category);
		System.out.println("Material: " + eletro.material);
		System.out.println("Model: " + eletro.model);
	}
}
