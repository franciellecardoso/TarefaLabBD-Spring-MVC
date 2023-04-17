package br.edu.fateczl.SpringMVC.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.edu.fateczl.SpringMVC.model.Funcionario;
import br.edu.fateczl.SpringMVC.model.Salario;

@Repository
public class SalarioDao implements ISalarioDao {

	@Autowired
	GenericDao gDao;

	@Override
	public List<Salario> totalSalarios() throws SQLException, ClassNotFoundException {
		List<Salario> salarios = new ArrayList<>();
		Connection c = gDao.getConnection();
		String sql = "SELECT dbo.fn_soma_salarios(?) as soma";

		PreparedStatement ps = c.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();

		while (rs.next()) {
			Salario s = new Salario();
			Funcionario f = new Funcionario();
			f.setSalarioFuncionario(rs.getFloat("salario_funcionario"));
			f.setSalarioDependente(rs.getFloat("salario_dependente"));
			s.setSoma(rs.getFloat("soma"));
			salarios.add(s);
		}
		rs.close();
		ps.close();
		c.close();
		
		return salarios;
	}
}
