package aula03.exercicios;

import javax.swing.JOptionPane;

public class E01_CircunferenciaGrafico {

	public static void main(String[] args) {
		
		final double PI = 3.14;
		
		String RaioPalavra = JOptionPane.showInputDialog("Digite o valor do raio.");
		
		int raio = Integer.parseInt(RaioPalavra);
		
		int diametro = raio*2;
		
		double comprimento = 2 * PI * raio;
		// PI * raio^2
		double area = PI * Math.pow(raio, 2);

		JOptionPane.showMessageDialog(null,"Diametro: "+diametro+"\nComprimento: "+comprimento+"\n¡rea: "+area);
	}

}
