package br.fiveware.application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Classe controladora responsável por receber todas as requisições da aplicação.
 * @author Danillo
 *
 */
@Controller
public class FivewareController {

	public static final String WELCOME = "home/index";
	
	/**
	 * Método respsonsável por renderizar a tela inicial da aplicação.
	 * @return {@link String} Valor contendo o path da tela.
	 */
	@RequestMapping("/")
	public String welcome(){
		return WELCOME;
	}
	
	
	
}
