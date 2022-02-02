package Pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;

public class Notifications {
    public void shouldHaveText(String text){
        Selenide.$(By.cssSelector(".alert")).shouldHave(Condition.text(text));
    }
}
