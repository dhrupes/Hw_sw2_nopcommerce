package testsuite;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegisterTest extends BaseTest {
    /* 5. Write down the following test into ‘RegisterTest’ class
1. userShouldNavigateToRegisterPageSuccessfully
* click on the ‘Register’ link
* Verify the text ‘Register’ */



    String baseurl ="https://demo.nopcommerce.com/";
    @Before
            public void setup(){
        openBrowser (baseurl);
    }
        @Test
    public void userShouldNavigateToRegisterPageSuccessfully(){
        //Click on the register link
        //driver.findElement(By.linkText("Register")).click();

            WebElement registerClick = driver.findElement(By.linkText("Register"));
            registerClick.click();
            // verify the text  'Register'
             WebElement registerButton = driver.findElement(By.linkText("Register"));
             String actualMess = registerButton.getText();
             String expectedMessage = "Register";
            Assert.assertEquals(expectedMessage,actualMess);
    }
    /* 2. userSholdRegisterAccountSuccessfully
     * click on the ‘Register’ link
     * Select gender radio button
     * Enter First name
     * Enter Last name
     * Select Day Month and Year
     * Enter Email address
     * Enter Password
     * Enter Confirm password
     * Click on REGISTER button
     * Verify the text 'Your registration completed’  */
@Test
public void userSholdRegisterAccountSuccessfully(){
    //click on register link
    //driver.findElement(By.linkText("Register")).click();
    WebElement registerClick = driver.findElement(By.linkText("Register"));
    registerClick.click();

    WebElement genderClick = driver.findElement(By.xpath("//input[@value='M']"));
    genderClick.click();
    WebElement firstNameClick = driver.findElement(By.xpath("//input[@id='FirstName']"));
    firstNameClick.sendKeys("Dhrupesh");
    WebElement lastNameClick = driver.findElement(By.xpath("//input[@id='LastName']"));
    lastNameClick.sendKeys("Patel");
    WebElement dayClick =driver.findElement(By.xpath("//select[@name='DateOfBirthDay']"));
    dayClick.sendKeys("17");
    WebElement monthClick =driver.findElement(By.xpath("//select[@name='DateOfBirthMonth']"));
    monthClick.sendKeys("May");
    WebElement yearClick =driver.findElement(By.xpath("//option[@value='1984']"));
    yearClick.click();
    WebElement emailClick =driver.findElement(By.xpath("//input[@data-val-required='Email is required.']"));
    emailClick.sendKeys("dhrupestcb@gmail.com");
    WebElement passwordClick =driver.findElement(By.xpath("//input[@data-val-regex='<p>Password must meet the following rules: </p><ul><li>must have at least 6 characters</li></ul>']"));
    passwordClick.sendKeys("D123456");
    WebElement coPasswordClick =driver.findElement(By.xpath("//input[@data-val-equalto='The password and confirmation password do not match.']"));
    coPasswordClick.sendKeys("D123456");
    WebElement registerButton =driver.findElement(By.xpath("//button[@id='register-button']"));
    registerButton.click();
    WebElement vMessage = driver.findElement(By.xpath("//div[@class='result']"));
    vMessage.isDisplayed();

}


}
