package Pages;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class Header extends GaragePage{

        public void logoutFromHeader(){
        Selenide.$(By.cssSelector(("button[id='userNavDropdown']"))).sendKeys(Keys.ENTER);
        Selenide.$(By.xpath("//*[text()='Logout']")).sendKeys(Keys.ENTER);
    }
}
