package com.generation.helloworld.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/helloworld")

public class helloworldcontroller {
	
	@GetMapping
	public String helloworld() {
		return "Hello world";
	}
	
	@GetMapping("/BSM")
	public String bsm() {
		return "Mentalidade de crescimento\n"
				+ "Persistência\n"
				+ "Responsabilidade Pessoal\n"
				+ "Comunicação\n"
				+ "Orientação ao detalhe\n"
				+ "Proatividade\n"
				+ "Trabalho em equipe\n";
	}
	
	@GetMapping("/aprender")
	public String aprender() {
		return "Comunicação";
		}

}
