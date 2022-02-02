import Pages.GaragePage;
import Pages.Header;
import Pages.HomePage;
import Pages.SidebarMenu;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.open;

public class PageObjectTest {

        @Test
    public void canLogin (){
        //Arrange
        HomePage homePage = new HomePage();

        //Login
        GaragePage garagePage = homePage.login("nika1993valerievna@gmail.com","Qauto20212021");

        //Assert
        garagePage.notifications.shouldHaveText("You have been successfully logged in");
    }

    @Test
    public void canLogoutFromHeader(){
        //Arrange
        HomePage homePage = new HomePage();
        homePage.login("nika1993valerievna@gmail.com","Qauto20212021");

        //Act - logoutFromHeader
        Header header = new Header();
        header.logoutFromHeader();

        //Assert
        homePage.haveGuestLoginButton();
    }

    @Test
    public void canLogoutFromSidebarMenu(){
        //Arrange
        HomePage homePage = new HomePage();
        homePage.login("nika1993valerievna@gmail.com","Qauto20212021");

        //Act - logoutFromSidebarMenu
        SidebarMenu sidebarMenu = new SidebarMenu();
        sidebarMenu.logoutFromSidebarMenu();

        //Assert
        homePage.haveGuestLoginButton();

    }
}
