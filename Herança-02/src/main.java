
public class main {

	public static void main(String[] args) {
//Exibição dos dados de cliente:
		Cliente p1 = new Cliente("Lucas Yoshida", "123.345.678-74", "29/09/2004", "Lucas@gmail.com", "1256.184.1515-02", "(11)123456-9090");
			System.out.println("Dados do cliente: " + "\n");
			System.out.println(p1.exibicao());
			
//Exibição dos dados do Gerente:
		Gerente p2 = new Gerente("Irineu da Silva", "123.567.345-00", "08/10/2000", "08/10/2023", 5000.00, "Analista Financeiro");
			System.out.println("Dados do Gerente:" + "\n");
			System.out.println(p2.exibicao());
			
//Exibição dos dados do Vendedor:
		Vendedor p3 = new Vendedor("Alfredo Santos", "456.345.234-02", "29/08/1998", "02/03/2024", 2000.00, 10.00 );
			System.out.println("Dados do Vendedor: " + "\n");
			System.out.println(p3.exibicao());

	}

}
