package testCases;

import commonActions.BrowserAndUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.LoginPage;

import static commonActions.BrowserAndUrl.driver;

public class LoginTest extends BasePage  {

    BrowserAndUrl b=new BrowserAndUrl();


    @BeforeTest
    @Parameters("browser")
    public void launchApp(String browser){

        b.openBrowser(browser);
        System.out.println("launching the application");
    }
   @Test
    public void loginAsAdmin() throws InterruptedException {

       CurrentPage= GetInstance(LoginPage.class);
       CurrentPage.As(LoginPage.class).loggingIn();

       Thread.sleep(3000);
       WebElement ele= driver.findElement(By.id("logged_user"));
       System.out.println(ele.getText());
       Assert.assertEquals("Welcome 303 Admin User",ele.getText());

    }
    @AfterClass(alwaysRun = true)
    public void close()
    {
        b.closingThePage();

    }




}
