package aula05.estruturas_repeticao_listas;

import java.util.ArrayList;
import java.util.List;

public class A02_Listas {

	public static void main(String[] args) {
		
		List<String> java = new ArrayList<>();
		
		java.add("Samuel");
		java.add("Johny");
		java.add(1, "Suely");
		java.add("Gildervan");
		
		//java.remove(3);
		java.remove("Gildervan");
		java.sort(null);
		//java.clear();
		/*
		for(String nome : java) {
			System.out.println(nome);
		}
		*/
		java.stream()
					.forEach(System.out::println);
		
		java.stream()
					.filter(nome -> nome.contains("Suely"))
					.map(caixaAlto -> caixaAlto.concat("-aluno"))
					.forEach(System.out::println);
		
		System.out.println(java.size());
		System.out.println(java.isEmpty());
		System.out.println(java.contains("ALucard"));
		System.out.println(java.get(0));
		System.out.println(java.indexOf("Suely"));
		
	}
}
