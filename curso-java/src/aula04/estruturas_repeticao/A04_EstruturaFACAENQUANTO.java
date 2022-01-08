package aula04.estruturas_repeticao;

public class A04_EstruturaFACAENQUANTO {

	public static void main(String[] args) {
		
		int contador=1; 
	
		while(contador<10) {
			System.out.println("Executando o WHILE");
			contador++;
		}
		
		contador=1;
		
		do {
			System.out.println("Executando o DO WHILE");
			contador++;
		}while(contador<10);
	}

}
