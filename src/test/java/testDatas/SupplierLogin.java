package testDatas;

import org.testng.annotations.DataProvider;

public class SupplierLogin {


    @DataProvider(name="SupplierLogin")

    public static Object[][] LoginData()
    {
      return new Object[][]  {

              {"sajitha.r+c@303software.com","12345678"},//correct credentials




      };
    }

}
