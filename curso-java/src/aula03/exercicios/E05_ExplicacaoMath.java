package aula03.exercicios;

public class E05_ExplicacaoMath {

	public static void main(String[] args) {
		
		double numero = 3.7;
		int numero02 = 27;
		
		//retorna o valor absoluto.
		Math.abs(numero);
		
		//retorna a raiz cubica.
		//System.out.println(Math.cbrt(numero02));
		
		//retorna o valor arredondado para cima.
		//System.out.println(Math.ceil(numero));
		
		//retorna o valor arredondado para baixo
		//System.out.println(Math.floor(numero));
		
		//retorna o valor inteiro mais próximo
		//System.out.println(Math.round(numero));
		
		//System.out.println(Math.max(numero, numero02));
		
		//System.out.println(Math.min(numero, numero02));
		
		System.out.println((Math.round(Math.random()*20)-10));
	}
}
