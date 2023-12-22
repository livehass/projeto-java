package veiculo.controller;

import java.util.ArrayList;
import java.util.List;

import veiculo.model.Veiculo;
import veiculo.repository.VeiculoRepository;

public class VeiculoController implements VeiculoRepository {

	List<Veiculo> listaVeiculos = new ArrayList<Veiculo>();

	@Override
	public void veiculosDisponiveis(List<Veiculo> listaVeiculos) {
		this.listaVeiculos = listaVeiculos;

		for (var veiculos : listaVeiculos) {
			veiculos.visualizarVeiculo();
		}

	}

	@Override
	public Veiculo consultarLocacao(int codVeiculo) {
		for (var veiculo : listaVeiculos) {
			if (veiculo.getCodVeiculo() == codVeiculo) {
				return veiculo;
			}
		}
		return null;

	}

	@Override
	public void atualizarLocacao(int codVeiculo) {
		System.out.println("\nAtualização dos dados da locação realizada com sucesso! ");

	}

	@Override
	public void cancelarLocacao(int codVeiculo) {
		System.out.println("\nCancelamento da locação realizado com suscesso! ");

	}

}
