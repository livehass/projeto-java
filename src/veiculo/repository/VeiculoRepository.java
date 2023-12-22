package veiculo.repository;

import java.util.List;

import veiculo.model.Veiculo;

public interface VeiculoRepository {

	public void veiculosDisponiveis(List<Veiculo> listaVeiculos);

	public Veiculo consultarLocacao(int codVeiculo);

	public void atualizarLocacao(int codVeiculo);

	public void cancelarLocacao(int codVeiculo);

}
