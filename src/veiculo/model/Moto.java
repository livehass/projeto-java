package veiculo.model;

public class Moto extends Veiculo {
	private int cilindradas;

	public Moto(int codVeiculo, String marca, String modelo, double preco, boolean disponibilidade, String categoria,
			int cilindradas) {
		super(codVeiculo, marca, modelo, preco, disponibilidade, categoria);
		this.cilindradas = cilindradas;
	}

	public Moto() {

	}

	public int getCilindradas() {
		return cilindradas;
	}

	public void setCilindradas(int cilindradas) {
		this.cilindradas = cilindradas;
	}

	@Override
	public void visualizarVeiculo() {
		super.visualizarVeiculo();
		System.out.println("Cilindradas do motor: " + this.cilindradas);
		System.out.println("----------------------------------");
	}

}
