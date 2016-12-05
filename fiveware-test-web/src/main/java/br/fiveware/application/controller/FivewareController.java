package br.fiveware.application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.fireware.model.FirewareModel;

/**
 * Classe controladora responsável por receber todas as requisições da aplicação.
 * @author Danillo
 *
 */
@Controller
public class FivewareController {

	public static final String WELCOME = "index";
	
	/**
	 * Método respsonsável por renderizar a tela inicial da aplicação.
	 * @return {@link String} Valor contendo o path da tela.
	 */
	@RequestMapping("/")
	public String welcome(){
		return WELCOME;
	}
	
	@ResponseBody
	@RequestMapping(value = "/registrarUsuario", method = RequestMethod.PUT)
	public String saveUser(@RequestBody FirewareModel model){
		
		String nome = model.getNome();
		
		return nome;
	}
	
}
