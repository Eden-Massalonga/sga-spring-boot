package mz.sgaspringapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProfessorController {
	
	@RequestMapping("/professor")
	public String cadastroProfessor() {
		return "cadastro/professor";
	}
}
