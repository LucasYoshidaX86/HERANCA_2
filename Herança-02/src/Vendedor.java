//Subclasse de trabalhadores para criação de novos atributos e herdar atributos criados em outra classe.
public class Vendedor extends trabalhadores {
	private double percentualComissao;
	
//Constructor para inicialização dos atributos criados e herdados.	
	public Vendedor(String nome, String cpf, String dataNascimento, String dataContratacao, double salarioBase, double percentualComissao) {
		super(nome, cpf, dataNascimento, dataContratacao, salarioBase);
		this.percentualComissao = percentualComissao;
	}
	
//Métodos getters e setters para acessar e alterar informações dos atributos criados.
	
	public double getPercentualComissao() {
		return percentualComissao;
	}
	
	public void setPercentualComissao(double percentualComissao) {
		this.percentualComissao = percentualComissao;
	}
	
//Formatação das informações para serem puxadas ao main.
	String exibicao() {
		return
				super.exibicao() +
				"Comissão: " + this.percentualComissao + "%" + "\n";
	}
}
