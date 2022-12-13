package pages;




import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import suport.Util;



public class cadastroPages extends Util {
    WebDriver driver;

    public cadastroPages(WebDriver driver){
        this.driver = driver;
    }
    private By first_Name = By.id("inputFirstName");
    private By last_Name = By.id("inputLastName");
    private By Email = By.id("inputEmail");
    private By Numero = By.id("inputPhone");
    private By endereco_1 = By.id("inputAddress1");
    private By endereco_2 = By.id("inputAddress2");
    private By cidade  = By.id("inputCity");
    private By estado = By.id("stateinput");
    private By Cep  = By.id("inputPostcode");
    private By Pais  = By.id("inputCountry");
    private By NumeroWhatsapp  = By.id("customfield2");
    private By senha  = By.id("inputNewPassword1");
    private By ConfirmaSenha  = By.id("inputNewPassword2");
    private By Captchar  = By.id("google-recaptcha-domainchecker1");
    private By BotaoRegistrar  = By.cssSelector("input.btn.btn-large.btn-primary.btn-recaptcha");



    public void preencherNome(String Nome){
        driver.findElement(first_Name).sendKeys(Nome);
    }

    public void preencherSobreNome(String sobreNome){
        driver.findElement(last_Name).sendKeys(sobreNome);
    }

    public void preencherEmail(){
        driver.findElement(Email).sendKeys(getRandomEmail());

    }
    public void preencherNumero(String numero){
        driver.findElement(Numero).sendKeys(numero);
    }
    public void preencherEndereco_1(String endereco1){
        driver.findElement(endereco_1).sendKeys(endereco1);

    }
    public void preencherEndereco_2(String endereco2){
        driver.findElement(endereco_2).sendKeys(endereco2);

    }
    public void preencherCidade(String Cidade){
        driver.findElement(cidade).sendKeys(Cidade);

    }
    public void preencherEstado(String Estado){
        driver.findElement(estado).sendKeys(Estado);

    }
    public void preencherCep(String cep){
        driver.findElement(Cep).sendKeys(cep);

    }
    public void preencherPais(String pais){
        driver.findElement(Pais).sendKeys(pais);
    }
    public void preencherNumeroWhatsapp(String What){
        driver.findElement(NumeroWhatsapp).sendKeys(What);

    }
    public void preencherSenha( String Senha){
        driver.findElement(senha).sendKeys(Senha);

    }
    public void preencherConfirmarSenha(String Con_senha){
        driver.findElement(ConfirmaSenha).sendKeys(Con_senha);

    }
    public void Scroll() throws InterruptedException{
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollTo(0,10000)");
        Thread.sleep(200);

    }
    public void validarCaptchar() {

        driver.findElement(Captchar).click();



    }

    public void Registrar(){

        driver.findElement(BotaoRegistrar).click();
    }

    public void Logado(String Nome, String SobreNome) {
        esperarElemento(By.cssSelector("#header > div.topbar > div > div > div.ml-auto > div > div.btn-group > a.btn.btn-active-client > span"),20);
        String Text_logado = driver.findElement(By.cssSelector("#header > div.topbar > div > div > div.ml-auto > div > div.btn-group > a.btn.btn-active-client > span")).getText();
        Assert.assertEquals("Nao logado",Nome+" "+SobreNome,Text_logado);



    }


}





