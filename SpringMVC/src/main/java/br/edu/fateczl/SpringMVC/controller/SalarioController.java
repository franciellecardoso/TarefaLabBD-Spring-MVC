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

import br.edu.fateczl.SpringMVC.model.Salario;
import br.edu.fateczl.SpringMVC.persistence.SalarioDao;

@Controller
public class SalarioController {

	@Autowired
	SalarioDao sDao;

	@RequestMapping(name = "salario", value = "/salario", method = RequestMethod.GET)
	public ModelAndView init(ModelMap model) {
		List<Salario> salarios = new ArrayList<>();

		String erro = "";
		try {
			salarios = sDao.totalSalarios();
		} catch (SQLException | ClassNotFoundException e) {
			erro = e.getMessage();
		} finally {

		}
		model.addAttribute("erro", erro);
		model.addAttribute("salario", salarios);
		return new ModelAndView("salario");
	}

}
