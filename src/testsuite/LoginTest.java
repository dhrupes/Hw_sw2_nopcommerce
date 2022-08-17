package testsuite;

import browserfactory.BaseTest;
import com.google.common.base.Verify;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {
/*    3. Write down the following test into ‘LoginTest’ class
1. userShouldNavigateToLoginPageSuccessfully

* click on the ‘Login’ link
* Verify the text ‘Welcome, Please Sign  In!’  */

 String baseurl ="https://demo.nopcommerce.com/";
@Before

    public void setup(){
    openBrowser(baseurl);
}
@Test
    public void userShouldNavigateToLoginPageSuccessfully(){
    //Click on the 'login' Link
   // driver.findElement(By.linkText("Log in")).click();
    WebElement loginClick = driver.findElement(By.linkText("Log in"));
    loginClick.click();
    //Verify the text 'Welcome, Please Sign In'
    WebElement loginButton = driver.findElement(By.linkText("Log in"));
    String actualMess = loginButton.getText();
    //System.out.println(actualMessage);
    String expectedMessage ="Log in";
    Assert.assertEquals(expectedMessage , actualMess);}

/*2. userShouldLoginSuccessfullyWithValidCredentials
* click on the ‘Login’ link
* Enter valid username
* Enter valid password
* Click on ‘LOGIN’ button
* Verify the ‘Log out’ text is display */
    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        //Click on the 'login' link
        //driver.findElement(By.linkText("Login in")).click();
        WebElement loginClick = driver.findElement(By.linkText("Log in"));
        loginClick.click();
        //Enter valid username
        WebElement userNameField = driver.findElement(By.xpath("//input[@class='email']"));
        userNameField.sendKeys("dhrupestcb@gmail.com");
        WebElement passWordField = driver.findElement(By.xpath("//input[@class='password']"));
        passWordField.sendKeys("D123456");
        //Click on login button
        WebElement loginButton = driver.findElement(By.xpath("//button[@class='button-1 login-button']"));
        loginButton.click();
        WebElement logoutButton = driver.findElement(By.xpath("//a[@class='ico-logout']"));
        logoutButton.click();
       /* 3. verifyTheErrorMessage
* click on the ‘Login’ link
* Enter invalid username
* Enter invalid password
* Click on Login button
* Verify the error message ‘Login was unsuccessful.
Please correct the errors and try again. No customer account found’ */
    }
        @Test
        public void verifyTheErrorMessage() {
            //Click on the 'login' link
            //driver.findElement(By.linkText("Login in")).click();
            WebElement loginClick = driver.findElement(By.linkText("Log in"));
            loginClick.click();
            //Enter invalid username
            WebElement userNameField = driver.findElement(By.xpath("//input[@class='email']"));
            userNameField.sendKeys("dhrupestcb1@gmail.com");
            //invalid password
            WebElement passWordField = driver.findElement(By.xpath("//input[@class='password']"));
            passWordField.sendKeys("D123456d");
            //Click on login button
            WebElement loginButton = driver.findElement(By.xpath("//button[@class='button-1 login-button']"));
            loginButton.click();
            WebElement errorMessage = driver.findElement(By.xpath("//div[@class='message-error validation-summary-errors']"));
            errorMessage.isDisplayed();
        }





}
