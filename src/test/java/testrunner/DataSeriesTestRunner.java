package testrunner;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import screens.CalcScreen;
import screens.CalcScreenSeriesData;
import setup.DataSeriesSet;
import setup.Setup;

public class DataSeriesTestRunner extends Setup {

    @Test(dataProvider = "SeriesData", dataProviderClass = DataSeriesSet.class)
    public void doSeries(String expression, double expectedResult) throws InterruptedException {

        CalcScreenSeriesData calculatorScreen = new CalcScreenSeriesData(driver);
        double actualResult = calculatorScreen.doCSVSeries(expression);
        System.out.println(actualResult);

        Assert.assertEquals(actualResult, expectedResult);

        Thread.sleep(3000);

    }

    @AfterMethod
    public void clear(){
        CalcScreen calcScreen =new CalcScreen(driver);
        calcScreen.btnclear.click();
    }

}
