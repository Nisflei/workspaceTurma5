package br.com.aula10.beansModel;

public class Veiculo {
	private String placa;
	private String modelo;
	private int potencia;
	private String proprietario;
	private int AnoFabrica;


	// construtor 
	public Veiculo() {}
	
	public Veiculo(String placa, String modelo, int potencia, String proprietario, int anoFabrica) {
		this.placa = placa;
		this.modelo = modelo;
		this.potencia = potencia;
		this.proprietario = proprietario;
		this.AnoFabrica = anoFabrica;
	}

	// Getter setters 

	public String getPlaca() {
		return placa;
	}
	
	
	public int getAnoFabrica() {
		return AnoFabrica;
	}

	public void setAnoFabrica(int anoFabrica) {
		AnoFabrica = anoFabrica;
	}
	

	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getPotencia() {
		return potencia;
	}
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	public String getProprietario() {
		return proprietario;
	}
	public void setProprietario(String proprietario) {
		this.proprietario = proprietario;
	}
	
	
}
