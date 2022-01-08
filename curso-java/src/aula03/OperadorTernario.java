package aula03;

import javax.swing.JOptionPane;

public class OperadorTernario {

	public static void main(String[] args) {
		
		//(condição) ? (valor se verdadeiro) : (valor se false)

		double nota = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do aluno"));
		
		String situacao = nota>= 7.0 ?"O aluno foi aprovado":"O aluno foi reprovado"; 
		
		JOptionPane.showMessageDialog(null, situacao);
		JOptionPane.showConfirmDialog(null, situacao);
	}
}
