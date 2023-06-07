package br.com.fiap.model;

public class Plantacao extends Pessoa{
	private String dataValidade;
	private int quantidade;
	private	double precoCusto;
	private int quantidadePorColheita;
	private int tempoCrescimento;
	private int quantidadeMeses;
	private double precoLucro;
	
	public Plantacao() {
		super();
	}

	public Plantacao(String nome, String dataValidade, int quantidade, double precoCusto, int quantidadePorColheita, int tempoCrescimento) {
		super(nome);
		this.dataValidade = dataValidade;
		this.quantidade = quantidade;
		this.precoCusto = precoCusto;
		this.quantidadePorColheita = quantidadePorColheita;
		this.tempoCrescimento = tempoCrescimento;
	}
	
	public Plantacao(String dataValidade, int quantidade, double precoCusto, int quantidadePorColheita,
			int tempoCrescimento, int quantidadeMeses) {
		super();
		this.dataValidade = dataValidade;
		this.quantidade = quantidade;
		this.precoCusto = precoCusto;
		this.quantidadePorColheita = quantidadePorColheita;
		this.tempoCrescimento = tempoCrescimento;
		this.quantidadeMeses = quantidadeMeses;
	}
	
	
	public Plantacao(String dataValidade, int quantidade, double precoCusto, int quantidadePorColheita,
			int tempoCrescimento, int quantidadeMeses, double precoLucro) {
		super();
		this.dataValidade = dataValidade;
		this.quantidade = quantidade;
		this.precoCusto = precoCusto;
		this.quantidadePorColheita = quantidadePorColheita;
		this.tempoCrescimento = tempoCrescimento;
		this.quantidadeMeses = quantidadeMeses;
		this.precoLucro = precoLucro;
	}

	// Exibir para o Usuario dados da plantacao
	public String retornarPlantacao() {
		return "\n" + "Nome da plantacao : " + nome + "\n" + "Data de validade : " + dataValidade + "\n" 
				+ "Quantidade disponivel: " + quantidade + "\n" + "Preco de Custo : " + precoCusto + "\n" + "Quantidade por Colheita : " 
					+ quantidadePorColheita + "\n" + "Tempo de Crescimento : " + tempoCrescimento;
	}
	
	// Calcular a quantidade que será coletada em x meses
	public int Analisar(int meses) {
		quantidadeMeses = (meses / tempoCrescimento * quantidadePorColheita);
		return quantidadeMeses;
	}
	
	// Caso a pessoa desejar alterar as informações fornecidas
	public void alterarDados(String nome, String dataValidade, int quantidade, double precoCusto, int quantidadePorColheita, int tempoCrescimento) {
	}
	
	// Calcular quanto será rendido com o preço de custo baseado na porcentagem de lucro
	public double calcularLucro(double porcentagem) {
		precoLucro = (porcentagem / 100 + 1 * precoCusto);
		return precoLucro;
	}

	public String getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(String dataValidade) {
		this.dataValidade = dataValidade;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getPrecoCusto() {
		return precoCusto;
	}

	public void setPrecoCusto(double precoCusto) {
		this.precoCusto = precoCusto;
	}

	public int getQuantidadePorColheita() {
		return quantidadePorColheita;
	}

	public void setQuantidadePorColheita(int quantidadePorColheita) {
		this.quantidadePorColheita = quantidadePorColheita;
	}

	public int getTempoCrescimento() {
		return tempoCrescimento;
	}

	public void setTempoCrescimento(int tempoCrescimento) {
		this.tempoCrescimento = tempoCrescimento;
	}

	public int getQuantidadeMeses() {
		return quantidadeMeses;
	}

	public void setQuantidadeMeses(int quantidadeMeses) {
		this.quantidadeMeses = quantidadeMeses;
	}

	public double getPrecoLucro() {
		return precoLucro;
	}

	public void setPrecoLucro(double precoLucro) {
		this.precoLucro = precoLucro;
	}
	
	
	
}
