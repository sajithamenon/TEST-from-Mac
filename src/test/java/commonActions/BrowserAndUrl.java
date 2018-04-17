package commonActions;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;


public class BrowserAndUrl {

    static String Url="http://52.24.76.254/#!/login";
     public static WebDriver driver=null;




    public static void openBrowser(String browser)
    {
        //If browser is  safari
        if (browser.equalsIgnoreCase("Safari")) {

        driver = new SafariDriver();

        // If browser is IE, then do this

    }
    //if browser is firefox
        else  if(browser.equalsIgnoreCase("firefox")){
        System.setProperty("webdriver.gecko.driver","/Users/sajitha/IdeaProjects/QA-Nabca/PQRS/src/test/java/resource/geckodriver");
        driver=new FirefoxDriver();
    }
    //if browser is Chrome

    else  if(browser.equalsIgnoreCase("chrome")){
        System.setProperty("webdriver.chrome.driver","/Users/sajitha/IdeaProjects/QA-Nabca/PQRS/src/test/java/resource/chromedriver");
        driver=new ChromeDriver();
    }

        //  lauch the Website

        driver.get(Url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }


    public static void closingThePage( ) {


            driver.quit();
        }

    public static void captureScreenShot()throws IOException {
        String filePath = "/Users/sajitha/IdeaProjects/QA-Nabca/PQRS/src/test/java/commonActions/screenShots";

        File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        //The below method will save the screen shot in d drive with test method name

        try{
            FileUtils.copyFile(srcFile,new File(filePath+".png"));
            System.out.println("ScreenShot sucess");}
        catch (IOException e){e.printStackTrace();}}

public static void printurl()
{
   System.out.println( driver.getTitle());
}







}
