package com.objetivoController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivo")
public class ObjetivoController {
	
	@GetMapping
	public String objetivo() {
		return "Meu objetivo nesta semana é me manter concetrada e calma para absorver o conteúdo novo"
				+ "e consegui aplicá-lo.";
		
	}

}
