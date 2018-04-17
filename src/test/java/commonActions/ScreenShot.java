package commonActions;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class ScreenShot {


    public static void captureScreenShot(WebDriver driver)throws IOException {
        String filePath = "/Users/sajitha/IdeaProjects/QA-Nabca/PQRS/src/test/java/commonActions/screenShots";

        File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        //The below method will save the screen shot in d drive with test method name

        try{
        FileUtils.copyFile(srcFile,new File(filePath+".png"));
            System.out.println("ScreenShot sucess");}
        catch (IOException e){e.printStackTrace();}
    }







}

