import com.thoughtworks.gauge.Step;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class StepImplementation extends BaseTest{


    @Step("Click on <xpath>")
    public void clickOnce(String xpath) throws InterruptedException {
        WebElement element = driver.findElement(By.xpath(xpath));
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
        actions.click().build().perform();
        Thread.sleep(1000);
    }

    @Step("Sendkeys <xpath1> and <xpath2>")
    public void SendKeystoLogin(String xpath1 , String xpath2) throws InterruptedException {
        WebElement mail = driver.findElement(By.xpath(xpath1));
        mail.sendKeys("Mail");
        Thread.sleep(1000);
        WebElement password = driver.findElement(By.xpath(xpath2));
        password.sendKeys("Password");
        Thread.sleep(1000);
    }

    @Step("<xpath> is Displayed ?")
    public void isDisplayed(String xpath){
        WebElement element = driver.findElement(By.xpath(xpath));
        Assert.assertTrue(element.isDisplayed());
        System.out.println("Displayed.");
    }

    @Step("Sendkeys to <xpath>")
    public void SendKeys(String xpath) throws InterruptedException {
        WebElement element = driver.findElement(By.xpath(xpath));
        element.sendKeys("This-Repo-Created-By-Selenium");
        Thread.sleep(2000);
    }

    @Step("Sendkeys to Description <xpath>")
    public void SendKeystoDescription(String xpath) throws InterruptedException {
        WebElement element = driver.findElement(By.xpath(xpath));
        element.sendKeys("https://emresharp.medium.com/");
        Thread.sleep(1000);
    }
}

