package lt.techin.test;

import lt.techin.OpenCart.pages.ToDoList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;

public class ToDoListTest extends BaseTest {

    @Test
    void addElement() {
        ToDoList toDoList = new ToDoList(driver);
        toDoList.enterElement("what a wonderful day");
        Assertions.assertEquals("what a wonderful day", toDoList.insertedElement());

    }

    @Test
    void ifCompletedTask() {
        ToDoList toDoList = new ToDoList(driver);
        toDoList.enterElement("what a wonderful day");
        Assertions.assertEquals("what a wonderful day", toDoList.insertedElement());
        toDoList.checkTheTaskDone();
//        Assertions.assertTrue("completed", );

    }
}
