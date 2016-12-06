package br.fireware.application.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import br.fiveware.application.Application;
import junit.framework.Assert;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebAppConfiguration
@IntegrationTest("server.port:0")
public class FirewareIntegrationTest {

	@Value("${local.server.port}") // 6
	int port;

	// @Autowired
	// private TestRestTemplate restTemplate;

	/**
	 * Método responsável por testar a inicialização da aplicação.
	 * @throws Exception Exceção ao inicializar a aplicação.
	 */
	@Test
	public void testInicioFireware() throws Exception {
		ResponseEntity<String> entity = new TestRestTemplate().getForEntity("http://localhost:" + this.port + "/",
				String.class);
		Assert.assertEquals(HttpStatus.OK, entity.getStatusCode());
	}

}
