package aula04.estruturas_repeticao;

public class A05_estruturaFOR {

	public static void main(String[] args) {
		int somador=0;
		
		for(int x=2;x<=100;x+=2) {
			somador+=x;
			System.out.println(x);
		}
		
		System.out.println(somador);
	}
}
