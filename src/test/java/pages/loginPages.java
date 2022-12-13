package pages;

import Runner.RunCucumberTest;
import org.openqa.selenium.By;



import static suport.Util.esperarElemento;


public class loginPages extends RunCucumberTest {

    private By wait_espera = By.id("inputEmail");
    private By wait_Espera_Button = By.cssSelector("a.small.font-weight-bold");



    public void acessarTelaLogin(){
        driver.get("https://phptravels.org/login");
        esperarElemento(wait_espera,20);
    }
    public void preencherEmail(String getRandomEmail){
        driver.findElement(wait_espera).sendKeys(getRandomEmail);

    }

    public void clicarEntrar(){
        driver.findElement(wait_Espera_Button).click();

    }
}
