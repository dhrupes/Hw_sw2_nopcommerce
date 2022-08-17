package testsuite;

import browserfactory.BaseTest;
import com.google.common.base.Verify;
import javafx.scene.control.Tab;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TopMenuTest extends BaseTest {
    /* 4. Write down the following test into ‘TopMenuTest’ class
1. userShouldNavigateToComputerPageSuccessfully
   * click on the ‘Computers’ Tab
   * Verify the text ‘Computers’ */
    String baseurl ="https://demo.nopcommerce.com/";
    @Before

    public void setup() {
        openBrowser(baseurl);
    }

@Test
        public void userShouldNavigateToComputersPageSuccessfully() {
            //Click on the 'Computers' Link
            // driver.findElement(By.linkText("Computers")).click();
            WebElement clickComputers = driver.findElement(By.linkText("Computers"));
            clickComputers.click();
            //Verify the text 'Computers'
            WebElement computersButton = driver.findElement(By.linkText("Computers"));
            String actualMess = computersButton.getText();
            //System.out.println(actualMessage);
            String expectedMessage ="Computers";
            Assert.assertEquals(expectedMessage , actualMess);
    }

    /*2. userShouldNavigateToElectronicsPageSuccessfully
     * click on the ‘Electronics’ Tab
     * Verify the text ‘Electronics’ */
    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully() {
        //Click on the 'Electronics' Link
        // driver.findElement(By.linkText("Electronics")).click();
        WebElement clickElectronics = driver.findElement(By.linkText("Electronics"));
        clickElectronics.click();
        //Verify the text 'Electronics'
        WebElement ElectronicsButton = driver.findElement(By.linkText("Electronics"));
        String actualMess = ElectronicsButton.getText();
        //System.out.println(actualMessage);
        String expectedMessage ="Electronics";
        Assert.assertEquals(expectedMessage , actualMess);
    }
    /* 3. userShouldNavigateToApparelPageSuccessfully
       * click on the ‘Apparel’ Tab
       * Verify the text ‘Apparel’ */
    @Test
    public void userShouldNavigateToApparelPageSuccessfully() {
        //Click on the 'Apparel' Link
        // driver.findElement(By.linkText("Apparel")).click();
        WebElement clickApparel = driver.findElement(By.linkText("Apparel"));
        clickApparel.click();
        //Verify the text 'Apparel'
        WebElement ApparelButton = driver.findElement(By.linkText("Apparel"));
        String actualMess = ApparelButton.getText();
        //System.out.println(actualMessage);
        String expectedMessage = "Apparel";
        Assert.assertEquals(expectedMessage, actualMess);

    }
    /* 4.
userShouldNavigateToDigitalDownloadsPageSuccessfully
* click on the ‘Digital downloads’ Tab
* Verify the text ‘Digital downloads’ */
       @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully(){
        //Click on the 'Digital Downloads' link
           //driver.findElements(By.linkText("Digital Downloads")).click();
           WebElement clickDownloads = driver.findElement(By.linkText("Digital downloads"));
           clickDownloads.click();
           //verify the text 'Downloads'
           WebElement downloadsButtons = driver.findElement(By.linkText("Digital downloads"));
           String actualMess = downloadsButtons.getText();
           String expectedMessage ="Digital downloads";
           Assert.assertEquals(expectedMessage,actualMess);
       }
        /* 5. userShouldNavigateToBooksPageSuccessfully

* click on the ‘Books’ Tab
* Verify the text ‘Books’    */
    @Test
    public void userShouldNavigateToBooksPageSuccessfully(){
        //Click on the 'Books' link
        //driver.findElements(By.linkText("Books")).click();
        WebElement clickBooks = driver.findElement(By.linkText("Books"));
        clickBooks.click();
        //verify the text 'Books'
        WebElement booksButtons = driver.findElement(By.linkText("Books"));
        String actualMess = booksButtons.getText();
        String expectedMessage ="Books";
        Assert.assertEquals(expectedMessage,actualMess);
    }

    /* 6. userShouldNavigateToJewelryPageSuccessfully
     * click on the ‘Jewelry’ Tab
     * Verify the text ‘Jewelry’ */
    @Test
    public void userShouldNavigateToJewelryPageSuccessfully() {
        //Click on the 'Jewelry' link
        //driver.findElements(By.linkText("Jewelry")).click();
        WebElement clickJewelry = driver.findElement(By.linkText("Jewelry"));
        clickJewelry.click();
        //verify the text 'Jewelry'
        WebElement jewelryButtons = driver.findElement(By.linkText("Jewelry"));
        String actualMess = jewelryButtons.getText();
        String expectedMessage = "Jewelry";
        Assert.assertEquals(expectedMessage, actualMess);

    }

   /* 7. userShouldNavigateToGiftCardsPageSuccessfully

* click on the ‘Gift Cards’ Tab
* Verify the text ‘Gift Cards’
*/
   @Test
   public void userShouldNavigateToGiftCardsPageSuccessfully() {
       //Click on the 'GiftCards' link
       //driver.findElements(By.linkText("GiftCards")).click();
       WebElement clickGiftCards = driver.findElement(By.linkText("Gift Cards"));
       clickGiftCards.click();
       //verify the text 'GiftCards'
       WebElement giftCardsButtons = driver.findElement(By.linkText("Gift Cards"));
       String actualMess = giftCardsButtons.getText();
       String expectedMessage = "Gift Cards";
       Assert.assertEquals(expectedMessage, actualMess);

   }



}
