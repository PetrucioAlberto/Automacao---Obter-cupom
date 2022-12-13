package steps;


import cucumber.api.java.pt.Dado;
import pages.loginPages;
import suport.Util;

public class loginSteps extends Util {
    loginPages loginPg = new loginPages();

    @Dado("^que estou na tela de login$")
    public void que_estou_na_tela_de_login() {
        loginPg.acessarTelaLogin();


    }
    @Dado("^acesso a tela de login$")
    public void acesso_a_tela_de_login() {
        loginPg.clicarEntrar();

    }

}
