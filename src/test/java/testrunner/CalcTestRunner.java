package testrunner;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.Test;
import screens.CalcScreen;

import setup.Setup;

public class CalcTestRunner extends Setup {



    @Test
    public void doseries(){
        CalcScreen calcScreen =new CalcScreen(driver);
        int Actualres =calcScreen.doseries(1,2,3,4,5,6,7,8,9,0);
        System.out.println(Actualres);
        int expectedresult =100;
        Assert.assertEquals(Actualres,expectedresult);

    }


    @AfterMethod
    public void clear(){
        CalcScreen calcScreen =new CalcScreen(driver);
        calcScreen.btnclear.click();
    }
}
