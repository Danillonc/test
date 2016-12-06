package br.fiveware.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Classe responsável por inicializar a aplicação utilizando o spring boot.
 * @author Danillo
 *
 */
//@EnableTransactionManagement(proxyTargetClass = true)
@SpringBootApplication(scanBasePackages = {"br.*"})
public class Application {
	
	/**
	 * Método main responsável por inicializar a aplicação.
	 * @param args ARgumentos.
	 * @throws Exception Exceção caso aconteça algum erro no run do spring boot.
	 */
	public static void main(String[] args) throws Exception {
		SpringApplication.run(Application.class, args);
	}
	
}