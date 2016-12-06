package br.fireware.application.dao;

import br.fireware.model.FirewareModel;

/**
 * Interface que representa a camada DAO da aplicação, usa a implementação do
 * spring data Repository.
 * 
 * @author Danillo
 *
 */
public interface FirewareDAO{

	/**
	 * Método responsável por persistir os dados do usuário na base.
	 * @param model {@link FirewareModel}
	 */
	void saveUserDAO(final FirewareModel model);
	

}
