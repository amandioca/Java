package exercise1;

public class cliente {
	
	//protect e public
	//get e set "apenas private"
	
	private String nome; 
	private String cpf; 
	private String email;
	private String enderešo;
	private int idade;

	public String getNome() {
	    return nome;
	}
	public void setNome(String nome) {
	    this.nome = nome;
	}
	public String getCpf() {
	    return cpf;
	}
	public void setCpf(String cpf) {
	    this.cpf = cpf;
	}
	public String getEmail() {
	    return email;
	}
	public void setEmail(String email) {
	    this.email = email;
	}
	public String getEnderešo() {
	    return enderešo;
	}
	public void setEnderešo(String enderešo) {
	    this.enderešo = enderešo;
	}
	public int getIdade() {
	    return idade;
	}
	public void setIdade(int idade) {
	    this.idade = idade;
	}
}

