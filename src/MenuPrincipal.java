
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import veiculo.controller.VeiculoController;
import veiculo.model.Caminhao;
import veiculo.model.Carro;
import veiculo.model.Moto;
import veiculo.model.Veiculo;

public class MenuPrincipal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String opPrincipal;
		int op;

		Carro carro = new Carro(1, "Honda", "Civic", 350.00, true, "sedã", 5);

		Moto moto = new Moto(2, "Honda", "Cb500", 75.00, true, "Naked", 479);

		Caminhao caminhao = new Caminhao(3, "Volvo", "FH16", 1500.00, true, "Pesada", 6);

		Carro carro2 = new Carro();
		Moto moto2 = new Moto();
		Caminhao caminhao2 = new Caminhao();

		List<Veiculo> listaVeiculos = new ArrayList<Veiculo>();

		listaVeiculos.add(caminhao);
		listaVeiculos.add(carro);
		listaVeiculos.add(moto);

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
				vc.veiculosDisponiveis(listaVeiculos);

				break;

			case 2:
				System.out.println("Digite o código do veículo locado: ");
				int cod = sc.nextInt();
				try {

					if (cod == 1) {
						carro2 = (Carro) vc.consultarLocacao(cod);
						carro2.visualizarVeiculo();
					} else if (cod == 2) {
						moto2 = (Moto) vc.consultarLocacao(cod);
						moto2.visualizarVeiculo();
					} else if (cod == 3) {
						caminhao2 = (Caminhao) vc.consultarLocacao(cod);
						caminhao2.visualizarVeiculo();
					} else {
						System.out.println("Carro não encontrado!");
					}

				} catch (NullPointerException e) {
					System.out.println("Veículo não existe!");
				}
				sc.nextLine();

				break;
			case 3:
				System.out.println("Digite o Código do veículo que deseja atualizar: ");
				cod = sc.nextInt();
				vc.atualizarLocacao(cod);

				break;
			case 4:
				System.out.println("Digite o Código do veículo que deseja deletar: ");
				cod = sc.nextInt();
				vc.cancelarLocacao(cod);

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
