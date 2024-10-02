//Subclasse criado para herdar atributos de pessoa e criar atributos para ambos os casos de "Gerente" e "Vendedor".
public class trabalhadores extends Pessoa {
	private String dataContratacao;
	private double salarioBase;
	
//Constructor para iniciar atributos criados e herdados da superclasse Pessoa.
	public trabalhadores(String nome, String cpf, String dataNascimento, String dataContratacao, double salarioBase ) {
		super(nome, cpf, dataNascimento);
		this.dataContratacao = dataContratacao;
		this.salarioBase = salarioBase;
	}
	
//Métodos getters e setters para acessar e alterar atributos privados.
	
	public String getDataContratacao() {
		return dataContratacao;
	}
	
	public void setDataContratacao(String dataContratacao) {
		this.dataContratacao = dataContratacao;
	}
	
	public double getSalarioBase() {
		return salarioBase;
	}
	
	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	
	String exibicao() {
		return
			super.exibicao() + 
			"Data de Contratação: " + this.dataContratacao + "\n" +
			"Salário Base: " + this.salarioBase + "\n";
	}
}
