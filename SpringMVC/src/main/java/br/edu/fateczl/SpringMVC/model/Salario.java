package br.edu.fateczl.SpringMVC.model;

public class Salario {
	private Funcionario salarioFuncionario;
	private Funcionario salarioDependente;
	private float soma;
	
	public Funcionario getSalarioFuncionario() {
		return salarioFuncionario;
	}
	public void setSalarioFuncionario(Funcionario salarioFuncionario) {
		this.salarioFuncionario = salarioFuncionario;
	}
	public Funcionario getSalarioDependente() {
		return salarioDependente;
	}
	public void setSalarioDependente(Funcionario salarioDependente) {
		this.salarioDependente = salarioDependente;
	}
	public float getSoma() {
		return soma;
	}
	public void setSoma(float soma) {
		this.soma = soma;
	}
	
	@Override
	public String toString() {
		return "Salario [salarioFuncionario=" + salarioFuncionario + ", salarioDependente=" + salarioDependente
				+ ", soma=" + soma + "]";
	}
	
	
	

	
}
