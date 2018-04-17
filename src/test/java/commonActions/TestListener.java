package commonActions;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;

public class TestListener extends BrowserAndUrl implements ITestListener{





    public void onTestStart(ITestResult iTestResult) {

    }

    public void onTestSuccess(ITestResult iTestResult) {

    }

    public void onTestFailure(ITestResult iTestResult) {

        {
            //String filePath = "/Users/sajitha/IdeaProjects/QA-Nabca/PQRS/src/test/java/commonActions/ScreenShot.java"+iTestResult.getMethod().toString()+".png";
          /* String filePath =  new SimpleDateFormat("yyyyMMddhhmmss'.txt'").format(new Date());
           // String Dest= "/Users/sajitha/IdeaProjects/QA-Nabca/PQRS/src/test/java/commonActions/ScreenShot.java"+filePath;


            File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            //The below method will save the screen shot in d drive with test method name

            try{
               FileUtils.copyFile(srcFile,new File("/Users/sajitha/IdeaProjects/QA-Nabca/PQRS/src/test/java/resource/screenShotsOnFailure"+filePath+".png"));


                System.out.println("ScreenShot sucess");}
            catch (IOException e){e.printStackTrace();}*/
          try{
              captureScreenShot();
          }

          catch (IOException e)
          {e.printStackTrace();
        }




    }}


    public void onTestSkipped(ITestResult iTestResult) {


    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    public void onStart(ITestContext iTestContext) {

    }

    public void onFinish(ITestContext iTestContext) {


    }
}



