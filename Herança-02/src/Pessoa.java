//Criando Superclasse com atributos em comum para outras subclasses.
public class Pessoa {
	private String nome;
	private String cpf;
	private String dataNascimento;

//Constructor para inicialização dos atributos criados. 	
	public Pessoa(String nome, String cpf, String dataNascimento) {
		this.nome = nome;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento; 
		
	}
	
//Métodos getters e setters para acessar e mudar valores dos atributos privaods.
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
	
	public String getDataNascimento() {
		return dataNascimento; 
	}
	
	public void setDataNascimento() {
		this.dataNascimento = dataNascimento;
	}
	
//Formatação para exibição quando puxadas ao main.
	String exibicao() {
		return
			"Nome: " + this.nome + "\n" + 
			"CPF: " + this.cpf + "\n" +
			"Data de Nascimento: " + this.dataNascimento + "\n";
	}
	
}
