package cursojava.execultavio;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;

public class Main {

	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Qual o nome do Aluno?");
		// TODO Auto-generated method stub
		Aluno aluno1 = new Aluno();
		aluno1.setNome(nome);
;
		System.out.print(aluno1.getNome());
	}

}
