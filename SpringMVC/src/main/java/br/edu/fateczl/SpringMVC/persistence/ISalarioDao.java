package br.edu.fateczl.SpringMVC.persistence;

import java.sql.SQLException;
import java.util.List;

import br.edu.fateczl.SpringMVC.model.Salario;

public interface ISalarioDao {
	public List<Salario> totalSalarios() throws SQLException, ClassNotFoundException;
}
