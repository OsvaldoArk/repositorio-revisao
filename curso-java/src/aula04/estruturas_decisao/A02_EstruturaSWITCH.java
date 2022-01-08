package aula04.estruturas_decisao;

public class A02_EstruturaSWITCH {

	public static void main(String[] args) {
		
		int opcao = 20;
		
		switch(opcao) {
			
			case 1: System.out.println("New game"); break;
			case 2: System.out.println("Load game"); break;
			case 3: System.out.println("Options"); break;
			case 4: System.out.println("EXIT"); break;
			default:System.out.println("Opção inválida"); 
		}
		
		//System.out.println("fim do switch");
	}

}
