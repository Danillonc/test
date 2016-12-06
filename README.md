# Test

O objetivo é criar um fomulário de cadastro e armazenar as informações digitadas no banco de dados, neste projeto, utilize o Spring Framework para o MVC e persistência de dados juntamente com o Hibernate. Após a finalização faça commit e envie o link para esdras.tavares@fiveware.com.br

# Dicas

1 - De um fork neste projeto, clone e importe no eclipse

2 - Crie 2 módulos "maven" com os seguintes nomes:

  - fiveware-test-service (jar)
  - fiveware-test-web (war)
  
Observe que já existe um "parent" e o fiveware-test-model(jar)

3 - Configure o Spring MVC no projeto web(fiveware-test-web), essa configuração deve ser SEM XML.

4 - Crie um formulário qualquer de cadastro que tenha no mínimo os seguintes elementos:

  - Campo de texto
  - Checkbox
  - Combobox
  - radio
  
O envio dos dados do formulário deve ser via AJAX

5 - Crie o modelo de dados para este formulário no MySQL e também a entidade no módulo fiveware-test-model

6 - Implemente todas as camadas, a view chamando o controller, o controller chamando o service e o service invocando o repositório.

### COMANDOS PARA EXECUTAR A APLICAÇÃO ###
1 - Aplicação foi desenvolvida com Spring Boot, AngularJS, MySQL


2 - Importe a aplicação no eclipse e rode a classe Application.java como Java Application.


3 - Após a inicialização do projeto somente acessar localhost:7001/ - se a porta já estiver em uso, mudar no (main/resosurces/application.properties) para outra porta.


4 - Existe um script SQL que gera a tabela no MySQL, certificar-se de que o serviço do MySQL está iniciado caso contrário dará erro.


5- Classes de Testes foram implementadas, a aplicação foi desenvolvida de forma pequena devido ao curto tempo mas conforme solicitado no desafio.
