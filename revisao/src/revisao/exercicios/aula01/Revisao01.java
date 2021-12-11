package revisao.exercicios.aula01;
/*
 *Classe de revisão do módulo I
 *
 *autor: Osvaldo Souza
 * 
 * versão 1.0
 * 
 * */
public class Revisao01 {

	//método de execução de uma classe JAVA.
	public static void main(String[] args) {
		
		final double GRAVIDADE = 9.8;
		
		char simbolo = '%';
		int diaDoMes = 06;
		float peso   = 70.8f;
		double pesoDouble = 70.8;
		boolean estaLegando = true;
		String curso = "Lógica de Programação JAVA";
		
		System.out.println("100"+simbolo);
		
		//%d inteiro, %f, %g double e float, %c caractere, %s string
		System.out.printf("Dia do mês %d",diaDoMes);
		System.out.println("Mudança");
	}
}
