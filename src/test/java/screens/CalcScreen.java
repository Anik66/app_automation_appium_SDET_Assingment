package screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class CalcScreen {


    @FindBy(id="com.google.android.calculator:id/op_add")
    public WebElement btnplus;

    @FindBy(id="com.google.android.calculator:id/op_sub")
    public WebElement btnsub;

    @FindBy(id="com.google.android.calculator:id/op_div")
    public WebElement btndiv;

    @FindBy(id="com.google.android.calculator:id/op_mul")
    public WebElement btnmul;

    @FindBy(id="com.google.android.calculator:id/eq")
    public WebElement btnequal;

    @FindBy(id="com.google.android.calculator:id/result_final")
    public WebElement btnresult;

    @FindBy(id="com.google.android.calculator:id/clr")
    public WebElement btnclear;

    AndroidDriver driver;
    public CalcScreen(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }



    public int doseries(int num1,int num2,int num3,int num4,int num5,int num6,int num7,int num8,int num9,int num0) {
        driver.findElement(By.id("com.google.android.calculator:id/digit_"+num1)).click(); //1
        driver.findElement(By.id("com.google.android.calculator:id/digit_"+num0)).click(); //0
        driver.findElement(By.id("com.google.android.calculator:id/digit_"+num0)).click(); //0

        btndiv.click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_"+num1)).click(); //1
        driver.findElement(By.id("com.google.android.calculator:id/digit_"+num0)).click(); //0

        btnmul.click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_"+num5)).click();

        btnsub.click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_"+num1)).click(); //1
        driver.findElement(By.id("com.google.android.calculator:id/digit_"+num0)).click(); //0

        btnplus.click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_"+num6)).click(); //6
        driver.findElement(By.id("com.google.android.calculator:id/digit_"+num0)).click(); //0
        btnequal.click();
        return Integer.parseInt(btnresult.getText());


    }










}
