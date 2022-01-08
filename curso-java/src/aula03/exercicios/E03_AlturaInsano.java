package aula03.exercicios;

import java.util.Scanner;

public class E03_AlturaInsano {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite sua altura");

		double altura = scan.nextDouble();
		
		//String resposta =  altura > 1.55 ?"Pode descer no Insano":"Não pode descer no Insano";
		
		//1ª: verifica se a altura não é negativa.
		//2ª: verifica se a pessoa tem altura para descer no insano.
		//3ª: verifica se a pessoa não é um gigante.
		boolean permitido = altura>0 && altura >= 1.55 && altura <=3.5;
		
		String resposta =  permitido ?"Pode descer no Insano":"Não pode descer no Insano";
		
		System.out.println(resposta);
	}

}
