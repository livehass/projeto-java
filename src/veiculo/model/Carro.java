package veiculo.model;

public class Carro extends Veiculo{
	private int qtdPassageiros;

	public Carro(String marca, String modelo, double preco, boolean disponibilidade, String categoria,
			int qtdPassageiros) {
		super(marca, modelo, preco, disponibilidade, categoria);
		this.qtdPassageiros = qtdPassageiros;
	}
	public Carro () {
		
	}
	public int getQtdPacageiros() {
		return qtdPassageiros;
	}

	public void setQtdPacageiros(int qtdPacageiros) {
		this.qtdPassageiros = qtdPacageiros;
	}
	
	public void visualizarVeiculo () {
		super.visualizarVeiculo();
		System.out.println("Quantidade de passageiros: " + this.qtdPassageiros);
	}
	
	
	
}
