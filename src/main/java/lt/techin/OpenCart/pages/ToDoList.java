package lt.techin.OpenCart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class ToDoList extends BasePage {
    public ToDoList(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "input")
    private WebElement inputElement;

    @FindBy(xpath = "//div[@id='container']/ul/li[last()]")
    WebElement insertedElement;


    public void enterElement(String name) {
        inputElement.sendKeys(name);
        inputElement.sendKeys(Keys.ENTER);
    }

    public String insertedElement() {
        return insertedElement.getText();
    }

    public void checkTheTaskDone(){
        Actions action = new Actions(driver);
        action.click(insertedElement).perform();
    }
}
