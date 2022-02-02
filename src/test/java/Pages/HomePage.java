package Pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.open;

public class HomePage extends BasePage{

    public HomePage(){
        open("https://qauto.forstudy.space/",
                "",
                "guest",
                "welcome2qauto");
    }
    public GaragePage login(String email, String password){
        Selenide.$(By.cssSelector("button[class='btn btn-outline-white header_signin']")).sendKeys(Keys.ENTER);
        Selenide.$(By.cssSelector(("#signinEmail"))).sendKeys(email);
        Selenide.$(By.cssSelector(("#signinPassword"))).sendKeys(password);
        Selenide.$(By.xpath("//*[text()='Login']")).sendKeys(Keys.ENTER);
        return new GaragePage();
    }
    public void haveGuestLoginButton() {
                Selenide.$(By.cssSelector("button[class='header-link -guest']")).shouldBe(Condition.visible);
    }
}
