package br.edu.fateczl.SpringMVC.model;

public class Funcionario {
	private String nomeFuncionario; 
	private float salarioFuncionario;
	private String nomeDependente;
	private float salarioDependente;
	
	public String getNomeFuncionario() {
		return nomeFuncionario;
	}
	public void setNomeFuncionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
	}
	public float getSalarioFuncionario() {
		return salarioFuncionario;
	}
	public void setSalarioFuncionario(float salarioFuncionario) {
		this.salarioFuncionario = salarioFuncionario;
	}
	public String getNomeDependente() {
		return nomeDependente;
	}
	public void setNomeDependente(String nomeDependente) {
		this.nomeDependente = nomeDependente;
	}
	public float getSalarioDependente() {
		return salarioDependente;
	}
	public void setSalarioDependente(float salarioDependente) {
		this.salarioDependente = salarioDependente;
	}
	@Override
	public String toString() {
		return "Funcionario [nomeFuncionario=" + nomeFuncionario + ", salarioFuncionario=" + salarioFuncionario
				+ ", nomeDependente=" + nomeDependente + ", salarioDependente=" + salarioDependente + "]";
	}
	
	



}
