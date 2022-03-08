package br.com.questao2.git;

public class EmpregoDaFaculdade {
	private String nome;
	private double salario;
	private int horasAula;
	
	public double getGastos() {
		return (40 * this.horasAula) + this.salario;
	}
	
	public String getInfo() {
		return "Nome: " + this.nome + " com salário R$ " + this.salario + " + Bônus: R$ " + 40 * this.horasAula;
	}
	
	public EmpregoDaFaculdade(String nome, double salario, int horasAula){
		this.nome = nome;
		this.salario = salario;
		this.horasAula = horasAula;
	}
}
