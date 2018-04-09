package org.definitylabs.demo.flue2ent;

import org.definitylabs.flue2ent.element.WebElementWrapper;
import org.junit.Test;
import org.openqa.selenium.By;

import java.util.List;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;

public class HelloWorldTest extends AbstractWebDriverTest {

    @Test
    public void test() {
        website.findElement(By.linkText("English")).click();
        website.findElement(By.id("lst-ib")).enter("Github");
        website.justWait().until(elementToBeClickable(By.cssSelector("input[value='Google Search']")));
        website.findElement(By.cssSelector("input[value='Google Search']")).click();

        List<WebElementWrapper> results = website.findElements(By.cssSelector(".g:not(.g-blk)"));
        results.forEach(result -> {
            WebElementWrapper title = result.findElement(By.tagName("h3"));
            System.out.println(title.text());
        });
    }

}
