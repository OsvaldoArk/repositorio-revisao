package aula03.exercicios;

import java.util.Scanner;

public class E04_MaiorNumero {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número.");
		int numero_01 = leitor.nextInt();
		
		System.out.println("Digite o segundo número");
		int numero_02 = leitor.nextInt();
		
		// (a+b + |a-b|)/2
		// retorne o maior entre 3 números.
		
		int numeroMaior = (numero_01 + numero_02 + Math.abs(numero_01 - numero_02))/2;
		
		System.out.println(numeroMaior);
	}

}
