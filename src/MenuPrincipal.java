import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuPrincipal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String opPrincipal, cpf;
		int op;

		do {
			System.out.println("***********************************************************\n"
					+ "*			                                  *\n"
					+ "*-------------------Locadora-DO-JORJÃO--------------------*\n"
					+ "*			                                  *\n"
					+ "***********************************************************\n"
					+ "*			                                  *\n"
					+ "*          1 - Categorias de Veículos disponiveis         *\n"
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

				System.out.println("\nCategorias Disponíveis:");
				System.out.println("\n1-Sedã");
				System.out.println("\n2-Hatch");
				System.out.println("\n3-Suv");
				System.out.println("\n4-Utilitario");

				break;
			
			case 2: 
				System.out.println("\nDigite o CPF para consultar locação: ");
				
				cpf = sc.nextLine();
				System.out.println("\nConsulta de locação realizada com sucesso para o cpf: "+cpf);
				break;
			case 3: 
				System.out.println("\nDigite o CPF para atualizar dados de locação: ");
				
				cpf = sc.nextLine();
				System.out.println("\nAtualização dos dados da locação realizada com sucesso para o cpf: "+cpf);
				break;
			case 4:
				System.out.println("\nDigite o CPF para cancelar uma locação: ");
				
				cpf = sc.nextLine();
				System.out.println("\nCancelamento da locação realizado com suscesso para o cpf: "+cpf);
				break;
			default:
				System.out.println("Opção inválida!!!");
				break;
			}

			System.out.println("\nDeseja voltar ao menu principal(sim/não): ? ");
			
			opPrincipal = sc.nextLine();
			
			
			
		} while (opPrincipal.equalsIgnoreCase("sim"));
		System.out.println("\nObrigada por usar a Locadora Do Jorjão. Volte sempre!!!!");

	}

}
