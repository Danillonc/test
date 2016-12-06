package br.fireware.application.service;

import br.fireware.model.FirewareModel;

public interface FirewareService {
	
	/**
	 * Método responsável por salvar os dados do usuário na camada DAO.
	 * @param model Objeto com as informações dos usuários
	 * @throws Exception Exceção de negócio caso ocorra algum erro ao salvar os dados.
	 */
	public void saveUser(final FirewareModel model) throws Exception;

}
