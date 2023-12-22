package veiculo.model;

public class Carro extends Veiculo {
	private int qtdPassageiros;

	public Carro(int codVeiculo, String marca, String modelo, double preco, boolean disponibilidade, String categoria,
			int qtdPassageiros) {
		super(codVeiculo, marca, modelo, preco, disponibilidade, categoria);
		this.qtdPassageiros = qtdPassageiros;
	}

	public Carro() {

	}
	
	public int getQtdPassageiros() {
		return qtdPassageiros;
	}

	public void setQtdPassageiros(int qtdPassageiros) {
		this.qtdPassageiros = qtdPassageiros;
	}

	public void visualizarVeiculo() {
		super.visualizarVeiculo();
		System.out.println("Quantidade de passageiros: " + this.qtdPassageiros);
		System.out.println("----------------------------------");
		
	}

}
