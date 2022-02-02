package Pages;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class SidebarMenu extends GaragePage{

    public void logoutFromSidebarMenu() {
        Selenide.$(By.xpath("//*[text()=' Log out ']")).click();
    }
}
