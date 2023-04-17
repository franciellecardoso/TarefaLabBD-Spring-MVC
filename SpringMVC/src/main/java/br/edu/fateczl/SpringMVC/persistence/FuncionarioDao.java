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

@Repository
public class FuncionarioDao implements IFuncionarioDao {

	@Autowired
	GenericDao gDao;

	@Override
	public List<Funcionario> listarSalarios() throws SQLException, ClassNotFoundException {
		List<Funcionario> lista = new ArrayList<>();
		Connection c = gDao.getConnection();
		String sql = "SELECT * FROM fn_geral()";

		PreparedStatement ps = c.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();

		while (rs.next()) {
			Funcionario f = new Funcionario();
			f.setNomeFuncionario(rs.getString("nome_funcionario"));
			f.setSalarioFuncionario(rs.getFloat("salario_funcionario"));
			f.setNomeDependente(rs.getString("nome_dependente"));
			f.setSalarioDependente(rs.getFloat("salario_dependente"));
			lista.add(f);
		}
		rs.close();
		ps.close();
		c.close();
		
		return lista;
	}
}
