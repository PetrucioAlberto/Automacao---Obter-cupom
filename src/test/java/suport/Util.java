package suport;

import Runner.RunCucumberTest;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Random;

public class Util extends RunCucumberTest {
    public static void esperarElemento(By element, int tempo) {

        WebDriverWait wait = new WebDriverWait(driver, tempo);
        wait.until(ExpectedConditions.elementToBeClickable(element));

    }
    public String getRandomEmail(){
        String email_init = "Qazando";
        String email_Final = "@qazando.com.br";

        Random random = new Random();
        int minimo = 1;
        int maximo = 999999;
        int resultado = random.nextInt(maximo-minimo) + minimo;
        return email_init + resultado + email_Final;
    }


}
