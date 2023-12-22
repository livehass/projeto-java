package veiculo.model;

public abstract class Veiculo {

	private String marca;
	private String modelo;
	private double preco;
	private boolean disponibilidade;
	private String categoria;

	public Veiculo(String marca, String modelo, double preco, boolean disponibilidade, String categoria) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.preco = preco;
		this.disponibilidade = disponibilidade;
		this.categoria = categoria;

	}

	public Veiculo() {

	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public boolean isDisponibilidade() {
		return disponibilidade;
	}

	public void setDisponibilidade(boolean disponibilidade) {
		this.disponibilidade = disponibilidade;
	}

	void visualizarVeiculo() {
		System.out.println("-------Veículos Disponíveis-------");
		System.out.println("Veículo da categoria: " + this.categoria);
		System.out.println("Marca: " + this.marca);
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Preço da locação R$: " + this.preco + " diária");

		if (disponibilidade == true) {

			System.out.println("Disponibilidade do veiculo: Disponivel");
		} else {

			System.out.println("DIsponibilidade do veículo: Indisponivel");
		}

	}

}
