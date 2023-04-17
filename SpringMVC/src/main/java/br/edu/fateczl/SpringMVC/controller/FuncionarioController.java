package br.edu.fateczl.SpringMVC.controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.edu.fateczl.SpringMVC.model.Funcionario;
import br.edu.fateczl.SpringMVC.persistence.FuncionarioDao;

@Controller
public class FuncionarioController {

	@Autowired
	FuncionarioDao fDao;

	@RequestMapping(name = "funcionario", value = "/funcionario", method = RequestMethod.GET)
	public ModelAndView init(ModelMap model) {
		List<Funcionario> lista = new ArrayList<>();

		String erro = "";
		try {
			lista = fDao.listarSalarios();
		} catch (SQLException | ClassNotFoundException e) {
			erro = e.getMessage();
		} finally {

		}
		model.addAttribute("erro", erro);
		model.addAttribute("lista", lista);
		return new ModelAndView("funcionario");
	}

}
