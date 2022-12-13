package steps;


import Runner.RunCucumberTest;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import pages.cadastroPages;



public class cadastroSteps extends RunCucumberTest {

    cadastroPages cadastroPg = new cadastroPages(driver);

    String Nome = "PetrucioA";
    String SobreNome = "Pereira" ;
    @Quando("^preencho o formulario de cadastro$")
    public void preencho_o_formulario_de_cadastro() throws InterruptedException {
        cadastroPg.preencherNome(Nome);
        cadastroPg.preencherSobreNome(SobreNome);
        cadastroPg.preencherEmail();
        cadastroPg.preencherNumero("11969563940");
        cadastroPg.preencherEndereco_1("rua capitao");
        cadastroPg.preencherEndereco_2("rua heroi");
        cadastroPg.preencherCidade("Osasco");
        cadastroPg.preencherEstado("SP");
        cadastroPg.preencherCep("062460980");
        cadastroPg.preencherPais("brazil");
        cadastroPg.preencherNumeroWhatsapp("11969563940");
        cadastroPg.preencherSenha("Adna123*");
        cadastroPg.preencherConfirmarSenha("Adna123*");
        cadastroPg.Scroll();
        cadastroPg.validarCaptchar();

    }

    @Quando("^clico em registrar$")
    public void clico_em_registrar()  {
        cadastroPg.Registrar();
    }

    @Entao("^eu vejo cadastro realizado com sucesso$")
    public void eu_vejo_cadastro_realizado_com_sucesso() {
        cadastroPg.Logado(Nome,SobreNome);

    }
}
