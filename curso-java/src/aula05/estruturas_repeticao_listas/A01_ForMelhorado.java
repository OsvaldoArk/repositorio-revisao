package aula05.estruturas_repeticao_listas;

public class A01_ForMelhorado {

	public static void main(String[] args) {
		
		String nomes[] = {"João","José","Ana","Maria","Pedro"};
		
		/*
		for(int i=0;i<nomes.length;i++) {
			System.out.println(nomes[i]);
		}
		*/
		for(String nome : nomes) {
			System.out.println(nome);
		}
	}

}
