package org.definitylabs.demo.flue2ent.page;

import org.definitylabs.flue2ent.element.FindElementBy;
import org.definitylabs.flue2ent.element.simple.SimpleWebElementDecorator;
import org.openqa.selenium.By;

public interface GoogleResult extends SimpleWebElementDecorator {

    @FindElementBy(tagName = "h3")
    String title();

    @FindElementBy(css = "h3 a", andGetAttribute = "href")
    String url();

    default void click() {
        webElement().findElement(By.cssSelector("h3 a")).click();
    }

    default boolean isOrganic() {
        return !isBanner();
    }

    default boolean isBanner() {
        return webElement().getAttribute("class").contains("g-blk");
    }

}
