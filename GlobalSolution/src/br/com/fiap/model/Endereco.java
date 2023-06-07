package br.com.fiap.model;

public class Endereco {
	private String logradouro;
	private short numero;
	private String cidade;
	private String bairro;
	private String estado;
	
	
	
	public Endereco() {
		super();
	}
	
	

	public Endereco(String logradouro) {
		super();
		this.logradouro = logradouro;
	}



	public Endereco(String logradouro, short numero, String cidade, String bairro, String estado) {
		super();
		this.logradouro = logradouro;
		this.numero = numero;
		this.cidade = cidade;
		this.bairro = bairro;
		this.estado = estado;
	}
	
	//Retornar para o Usuario dados do seu endereco
	public String retornarEndereco() {
		return "\n" + "Logradouro : " + logradouro + "\n" + "Numero : " + numero + "\n" + "Cidade : "
				+ cidade + "\n" + "Bairro : " + bairro + "\n" + "Estado : " + estado;
	}
	
	
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public short getNumero() {
		return numero;
	}
	public void setNumero(short numero) {
		this.numero = numero;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
	
}
