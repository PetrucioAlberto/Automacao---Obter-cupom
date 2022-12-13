$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/cadastro_usuario.feature");
formatter.feature({
  "name": "cadastro de usuario",
  "description": "",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "name": "@cadastro"
    }
  ]
});
formatter.scenario({
  "name": "cadastrar novo usuario",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@cadastro"
    },
    {
      "name": "@cadastro_sucesso"
    }
  ]
});
formatter.step({
  "name": "que estou na tela de login",
  "keyword": "Dado "
});
formatter.match({
  "location": "loginSteps.que_estou_na_tela_de_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "acesso a tela de login",
  "keyword": "E "
});
formatter.match({
  "location": "loginSteps.acesso_a_tela_de_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "preencho o formulario de cadastro",
  "keyword": "Quando "
});
formatter.match({
  "location": "cadastroSteps.preencho_o_formulario_de_cadastro()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clico em registrar",
  "keyword": "E "
});
formatter.match({
  "location": "cadastroSteps.clico_em_registrar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu vejo cadastro realizado com sucesso",
  "keyword": "Entao "
});
