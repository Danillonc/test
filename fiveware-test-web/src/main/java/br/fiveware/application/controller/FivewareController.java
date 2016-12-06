package br.fiveware.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.fireware.application.service.FirewareService;
import br.fireware.model.FirewareModel;

/**
 * Classe controladora responsável por receber todas as requisições da aplicação.
 * @author Danillo
 *
 */
@Controller
public class FivewareController {

	public static final String WELCOME = "index";
	
	@Autowired
	private transient FirewareService firewareService;
	
	/**
	 * Método respsonsável por renderizar a tela inicial da aplicação.
	 * @return {@link String} Valor contendo o path da tela.
	 */
	@RequestMapping("/")
	public String welcome(){
		return WELCOME;
	}
	
	/**
	 * Método responsável por receber a requisição e persistir os dados do usuario.
	 * @param model Parâmetro que receberá o JSON da requisição.
	 * @return 
	 * @throws Exception Exceção ao salvar o usuario.
	 */
	@ResponseBody
	@RequestMapping(value = "/registrarUsuario", method = RequestMethod.POST)
	public String saveUser(@RequestBody FirewareModel model) throws Exception{
		firewareService.saveUser(model);
		return "";
	}
	
}
