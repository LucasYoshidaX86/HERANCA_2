//Subclasse Cliente onde contém atributos da superclasse e atributos próprios.
public class Cliente  extends Pessoa {
	private String email;
	private String cartaoFidelidade;
	private String telefone;

//Constructor para inicialização dos atributos da superclasse e subclasse.
	public Cliente(String nome, String cpf, String dataNascimento, String email, String cartaoFidelidade, String telefone) {
		super(nome, cpf, dataNascimento);
		this.email = email;
		this.cartaoFidelidade = cartaoFidelidade;
		this.telefone = telefone;
	}
	
//Métodos getters e setters para acessar e alterar atributos criados.
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getCartaoFidelidade() {
		return cartaoFidelidade;
	}
	
	public void setCartaoFidelidade(String cartãoFidelidade) {
		this.cartaoFidelidade = cartaoFidelidade;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone() {
		this.telefone = telefone;
	}
	
//Formatação das informações para serem puxadas ao main.
	String exibicao() {
		return
			super.exibicao() +
			"Email: " + this.email + "\n" +
			"Cartão Fidelidade: " + this.cartaoFidelidade + "\n" +
			"Telefone: " + this.telefone + "\n";
	}
	
	
}
