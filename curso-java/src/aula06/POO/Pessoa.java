package aula06.POO;

public class Pessoa {
	
	private String nome;
	private int idade;
	private String cpf;
	private String endereco;
	private String entrada;
	private String saida;
	private boolean mensalidade;
	//método contrutor padrão.
	public Pessoa() {}
	
	public Pessoa(String nome, int idade, String cpf, String endereco){
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
		this.endereco = endereco;
		mensalidade = true; 
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}	

	public String mesTaPago() {
		return this.mensalidade?"mensalidade está em dia.":"mensalidade está em atraso.";
	}
	
	public void registraEntrada(String entrada) {
		this.entrada = entrada;
	}
	
	public void registraSaida(String saida) {
		this.saida = saida;
	}
	
	public String toString() {
		return "nome:"+this.nome+" idade:"+idade;
	}
}
