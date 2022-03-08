package br.com.questao3.git;

public class Aluno {
	private String nome, curso, periodo;;
	private int  matricula;
	private double notaAV1, notaAV2,notaAE;
	
	public Aluno(String nome, String curso, String periodo, int matricula, double notaAV1,double notaAV2, double notaAE) {
		this.nome =nome;
		this.curso=curso;
		this.periodo = periodo;
		this.matricula = matricula;
		this.notaAV1 = notaAV1;
		this.notaAV2 = notaAV2;
		this.notaAE = notaAE;
	}
	
	public String avaliarAluno(double notaAV1, double notaAV2) {
		
		if(notaAV1 + notaAV2 >= 60) {
			
			return "ALUNO APROVADO!";
			
		}else return"ALUNO REPROVADO! NECESSÁRIO FAZER AVALIAÇÃO ESPECIAL";
	}
	
	public String avaliarRecupercao(double notaAV1, double notaAV2, double notaAE) {
		
		if((notaAV1 + notaAV2 + notaAE) / 2 >= 60 ) {
			
			return "ALUNO APROVADO COM AVALIAÇÃO ESPECIAL! ";
			
		}else return "ALUNO REPROVADO MESMO COM AVALIAÇÃO ESPECIAL!:( ";
		
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getPeriodo() {
		return periodo;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}

	public long getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public double getNotaAV1() {
		return notaAV1;
	}

	public void setNotaAV1(double notaAV1) {
		this.notaAV1 = notaAV1;
	}

	public double getNotaAV2() {
		return notaAV2;
	}

	public void setNotaAV2(double notaAV2) {
		this.notaAV2 = notaAV2;
	}

	public double getNotaAE() {
		return notaAE;
	}

	public void setNotaAE(double notaAE) {
		this.notaAE = notaAE;
	}
	
	
}
