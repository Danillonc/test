package br.fireware.application.service.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import br.fireware.application.dao.FirewareDAO;
import br.fireware.application.service.FirewareService;
import br.fireware.model.FirewareModel;

/**
 * Classe responsável por representar a camada de serviço da aplicação.
 * @author Danillo
 *
 */
@Service
public class FirewareServiceImpl implements FirewareService{
    
	private final Logger LOGGER = Logger.getLogger(FirewareServiceImpl.class);
	
	@Autowired
	private FirewareDAO firewareDAO;
	
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	@Override
	public void saveUser(FirewareModel model) throws Exception {
		try {
			 firewareDAO.saveUserDAO(model);
		} catch (Exception e) {
			LOGGER.error("Erro ao salvar os dados do usuário - saveUSer"+e.getMessage());
		}
		
	}

}
