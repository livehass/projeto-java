
import java.util.Scanner;
import veiculo.model.Caminhao;
import veiculo.model.Carro;
import veiculo.model.Moto;

public class MenuPrincipal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String opPrincipal, cpf;
		int op;

		Carro carro = new Carro("Honda", "Civic", 350.00, true, "sedã", 5);

		Moto moto = new Moto("Honda", "Cb500", 75.00, true, "Naked", 479);

		Caminhao caminhao = new Caminhao("Volvo", "FH16", 1500.00, true, "Pesada", 6);

		do {
			System.out.println("***********************************************************\n"
					+ "*			                                  *\n"
					+ "*-------------------Locadora-DO-JORJÃO--------------------*\n"
					+ "*			                                  *\n"
					+ "***********************************************************\n"
					+ "*			                                  *\n"
					+ "*          1 - Veículos disponiveis                       *\n"
					+ "*          2 - Consultar uma locação                      *\n"
					+ "*          3 - Atualizar dados da locação                 *\n"
					+ "*          4 - Cancelar uma locação                       *\n"
					+ "*          0 - Sair                                       *\n"
					+ "*			                                  *\n"
					+ "***********************************************************\n"
					+ "*              Entre com a opção desejada                 *\n"
					+ "***********************************************************\n");
			op = sc.nextInt();
			sc.nextLine();
			switch (op) {
			case 1:
				carro.visualizarVeiculo();
				moto.visualizarVeiculo();
				caminhao.visualizarVeiculo();

				break;

			case 2:
				System.out.println("\nDigite o CPF para consultar locação: ");

				cpf = sc.nextLine();
				System.out.println("\nConsulta de locação realizada com sucesso para o cpf: " + cpf);
				break;
			case 3:
				System.out.println("\nDigite o CPF para atualizar dados de locação: ");

				cpf = sc.nextLine();
				System.out.println("\nAtualização dos dados da locação realizada com sucesso para o cpf: " + cpf);
				break;
			case 4:
				System.out.println("\nDigite o CPF para cancelar uma locação: ");

				cpf = sc.nextLine();
				System.out.println("\nCancelamento da locação realizado com suscesso para o cpf: " + cpf);
				break;
			default:
				System.out.println("Opção inválida!!!");
				break;
			}

			System.out.println("\nDeseja voltar ao menu principal(sim/não): ? ");

			opPrincipal = sc.nextLine();

		} while (opPrincipal.equalsIgnoreCase("sim"));
		System.out.println("\nObrigada por usar a Locadora Do Jorjão. Volte sempre!!!!");
		sc.close();
	}

}
