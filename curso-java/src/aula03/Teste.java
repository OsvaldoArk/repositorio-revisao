package aula03;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Teste {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite o seu nome.");
		String nome = leitor.nextLine();
		
		String sobrenome = JOptionPane.showInputDialog("Digite seu sobrenome");
		
		System.out.println("Seu nome é "+nome);

	}

}
