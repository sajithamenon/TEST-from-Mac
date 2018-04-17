package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
//public  static WebDriver driver=null;
    //initialize the objects in my page
   /* public LoginPage(WebDriver driver){
        PageFactory.initElements(driver,this);
        git@github.com:sajithamenon/TDD-Framework.git
    }*/


   public LoginPage(){}

    @FindBy(id = "username")
    public static WebElement UrrName;
    @FindBy(id="password")
    public static WebElement password;
    @FindBy(className = "btn")
    public static WebElement LoginBtn;




    public BasePage loggingIn(){

        UrrName.sendKeys("303admin");
        password.sendKeys("12345678");
        LoginBtn.click();

        return GetInstance(AdminHomePage.class);
}
}
