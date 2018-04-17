package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminHomePage extends BasePage {


   /*//initialize the objects in my page
    public AdminHomePage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
*/
    @FindBy(linkText = "Users")
    public static WebElement Users;
    @FindBy(linkText="Control States")
    public static WebElement CS;
    @FindBy(linkText = "Product Vendor of Record Change")
    public static WebElement POR;
    @FindBy(tagName = "h2")
    public static WebElement ResentPQ;
    @FindBy( id="logged_user")
    public static WebElement PesenceOfloginPage;
}
