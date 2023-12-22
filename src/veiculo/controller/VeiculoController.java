package veiculo.controller;

import veiculo.model.Caminhao;
import veiculo.model.Carro;
import veiculo.model.Moto;
import veiculo.repository.VeiculoRepository;

public class VeiculoController implements VeiculoRepository {

	Carro carro = new Carro("Honda", "Civic", 350.00, true, "sedã", 5);

	Moto moto = new Moto("Honda", "Cb500", 75.00, true, "Naked", 479);

	Caminhao caminhao = new Caminhao("Volvo", "FH16", 1500.00, true, "Pesada", 6);

	@Override
	public void veiculosDisponiveis() {
		carro.visualizarVeiculo();
		moto.visualizarVeiculo();
		caminhao.visualizarVeiculo();

	}

	@Override
	public void consultarLocacao() {

		System.out.println("\nConsulta de locação realizada com sucesso! ");

	}

	@Override
	public void atualizarLocacao() {
		System.out.println("\nAtualização dos dados da locação realizada com sucesso! ");

	}

	@Override
	public void cancelarLocacao() {
		System.out.println("\nCancelamento da locação realizado com suscesso! ");

	}

}
