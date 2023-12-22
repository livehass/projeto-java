
import java.util.Scanner;

import veiculo.controller.VeiculoController;

public class MenuPrincipal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String opPrincipal;
		int op;

		VeiculoController vc = new VeiculoController();

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
					+ "*			                                  *\n"
					+ "***********************************************************\n"
					+ "*              Entre com a opção desejada                 *\n"
					+ "***********************************************************\n");
			op = sc.nextInt();
			sc.nextLine();
			switch (op) {
			case 1:
				vc.veiculosDisponiveis();

				break;

			case 2:

				vc.consultarLocacao();
				break;
			case 3:

				vc.atualizarLocacao();

				break;
			case 4:

				vc.cancelarLocacao();

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
