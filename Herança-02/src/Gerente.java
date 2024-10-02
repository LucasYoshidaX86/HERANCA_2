//Subclasse para criar e herdar atributos de uma superclasse.
public class Gerente extends trabalhadores{
	private String departamento;
	
//Constructor para inicializar atributos criados. 
	public Gerente(String nome, String cpf, String dataNascimento, String dataContratacao, double salarioBase, String departamento) {
		super(nome, cpf, dataNascimento, dataContratacao, salarioBase);
		this.departamento = departamento;
	}
	
//Métodos getters e setters para acessar e alterar atributos privados criados.
	public String getDepartamento() {
		return departamento;
	}
	
	public void setDepartamento (String departamento) {
		this.departamento = departamento; 
	}

//Formatação das informações para serem puxadas ao main.
	
	String exibicao() {
		return
				super.exibicao() +
				"Departamento: " + this.departamento + "\n";
	}
}
