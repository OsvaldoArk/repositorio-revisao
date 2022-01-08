package aula04.estruturas_repeticao;

public class A03_EstruturaENQUANTO {

	public static void main(String[] args) {
		
		int contador=1,somador=0;
		
		while(contador<=100) {
			somador+=contador;
			System.out.println(somador);
			contador++;
		}	
		System.out.println(somador);
	}
}
