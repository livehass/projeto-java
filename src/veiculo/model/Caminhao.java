package veiculo.model;

public class Caminhao extends Veiculo {
	private int qtdEixos;

	public Caminhao(String marca, String modelo, double preco, boolean disponibilidade, String categoria,
			int qtdEixos) {
		super(marca, modelo, preco, disponibilidade, categoria);
		this.qtdEixos = qtdEixos;
	}

	public Caminhao() {

	}

	public int getQtdEixos() {
		return qtdEixos;
	}

	public void setQtdEixos(int qtdEixos) {
		this.qtdEixos = qtdEixos;
	}

	@Override
	public void visualizarVeiculo() {
		super.visualizarVeiculo();
		System.out.println("Quantidade de eixos: " + this.qtdEixos);
	}

}
