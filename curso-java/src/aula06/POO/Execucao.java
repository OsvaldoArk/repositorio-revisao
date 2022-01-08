package aula06.POO;

public class Execucao {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa();
		
		p1.setNome("Carlos");
		p1.setIdade(25);
		p1.setCpf("111.222.333-44");
		p1.setEndereco("Pecém");
		//p1.mensalidade = true;
		
		System.out.println(p1);
		
		Pessoa p2 = new Pessoa("Stefanie",28,"222.222.777-00","aldeota"); 
		
		System.out.println(p2);
		
		System.out.println(p1.mesTaPago());
		System.out.println(p2.mesTaPago());
		//chamar métodos registraEntrada e registraSaida e adicionar as informações no método toString();
	}

}
