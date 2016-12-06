package br.fireware.application.dao.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.fireware.application.dao.FirewareDAO;
import br.fireware.model.FirewareModel;

@Transactional
@Repository
public class FirewareDAOImpl implements FirewareDAO {

	private final Logger LOGGER = Logger.getLogger(FirewareDAOImpl.class);

	@Autowired
	private JdbcTemplate jdcTemplate;

	@Override
	public void saveUserDAO(FirewareModel model) {

		try {
			StringBuilder sqlInsert = new StringBuilder();
			sqlInsert.append("INSERT INTO Usuario(nome,sobrenome,email,senha,estado_civil,sexo,estado) ");
			sqlInsert.append("VALUES(?,?,?,?,?,?,?)");
			jdcTemplate.update(sqlInsert.toString(), new Object[] { model.getNome(), model.getSobreNome(),
					model.getEmail(), model.getSenha(), model.getEstadoCivil(), model.getSexo(), model.getEstado() });
		} catch (Exception e) {
			LOGGER.error("ERRO AO SALVAR OS DADOS - DAO " + e.getMessage());
		}

	}

	public JdbcTemplate getJdcTemplate() {
		return jdcTemplate;
	}

	public void setJdcTemplate(JdbcTemplate jdcTemplate) {
		this.jdcTemplate = jdcTemplate;
	}

}
