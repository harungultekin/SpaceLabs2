package Pages;

import Utility.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class PrintSafeNSound extends BasePage {

    WebDriver driver;


    public PrintSafeNSound() {
        driver = BasePage.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(name = "q")

    public WebElement searchLinks;


    public void PrintSafeNSoundLinks(){
        searchLinks.sendKeys("spacelabs safensound");
        searchLinks.submit();

    }
}

