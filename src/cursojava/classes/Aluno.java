package cursojava.classes;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
	/*atributo*/
	String nome;
	int idade;
	String dataNacimento;
	String registroGeral;
	String numeroCpf;
	String nomeMae;
	String nomePai;
	String dataMatricula;
	
	Diciplina diciplina = new Diciplina();
	/*lista*/
	List<Diciplina> diciplina1 = new ArrayList<Diciplina>();
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getDataNacimento() {
		return dataNacimento;
	}
	public void setDataNacimento(String dataNacimento) {
		this.dataNacimento = dataNacimento;
	}
	public String getRegistroGeral() {
		return registroGeral;
	}
	public void setRegistroGeral(String registroGeral) {
		this.registroGeral = registroGeral;
	}
	public String getNumeroCpf() {
		return numeroCpf;
	}
	public void setNumeroCpf(String numeroCpf) {
		this.numeroCpf = numeroCpf;
	}
	public String getNomeMae() {
		return nomeMae;
	}
	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}
	public String getNomePai() {
		return nomePai;
	}
	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}
	public String getDataMatricula() {
		return dataMatricula;
	}
	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}
	
	public double getMediaNota() {
		return (diciplina.getNota1() + diciplina.getNota2() 
		+ diciplina.getNota3() + diciplina.getNota4()) / 4;
	}
	public boolean getAlunoAprovado() {
		double media = this.getMediaNota();
		if(media >= 70) {
			return true;
		}else {
			return false;
		}
	}
	public Diciplina getDiciplina() {
		return diciplina;
	}
	public void setDiciplina(Diciplina diciplina) {
		this.diciplina = diciplina;
	}
	
}
