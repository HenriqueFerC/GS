package br.com.fiap.model;

public class Pessoa {
	protected String nome;
	private String cpf;
	private Endereco endereco;
	private Plantacao plantacao;
		
	
	
	public Pessoa() {
		super();
	}
	
	

	public Pessoa(String nome) {
		this.nome = nome;
	}
	
	
	
	public Pessoa(String nome, String cpf, Endereco endereco, Plantacao plantacao) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
		this.plantacao = plantacao;
	}
	
	//Exibir para o Usuario dados de seu cadastro
	public String exibirCadastro() {
		return "\n" + "Nome do usuario : " + nome + "\n" + "CPF do usuario : " + cpf;
	}


	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public Plantacao getPlantacao() {
		return plantacao;
	}
	public void setPlantacao(Plantacao plantacao) {
		this.plantacao = plantacao;
	}
	
	
}
