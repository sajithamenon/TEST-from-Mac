package pages;

import org.openqa.selenium.support.PageFactory;

import static commonActions.BrowserAndUrl.driver;

public class Base {
    public static BasePage CurrentPage;
    public <TPage extends BasePage> TPage GetInstance(Class<TPage>page){
        Object obj= PageFactory.initElements(driver,page);
        return page.cast(obj);



    }
}
