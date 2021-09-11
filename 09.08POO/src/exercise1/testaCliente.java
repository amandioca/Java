package exercise1;

public class testaCliente {

	public static void main(String[] args) {
		
        cliente cli1=new cliente();

        cli1.setNome("Amanda");
        cli1.setCpf("123.345.678-90");
        cli1.setEmail("amandioca@amorim.com");
        cli1.setEndereço("Ruazinha, nº 123");
        cli1.setIdade(20);

            System.out.println("Nome do cliente: "+cli1.getNome());
            System.out.println("Idade: "+cli1.getIdade());
	}
}

