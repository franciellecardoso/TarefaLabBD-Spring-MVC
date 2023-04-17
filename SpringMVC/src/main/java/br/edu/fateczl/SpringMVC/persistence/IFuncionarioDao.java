package br.edu.fateczl.SpringMVC.persistence;

import java.sql.SQLException;
import java.util.List;

import br.edu.fateczl.SpringMVC.model.Funcionario;

public interface IFuncionarioDao {
	public List<Funcionario> listarSalarios() throws SQLException, ClassNotFoundException;
}
