package org.definitylabs.demo.flue2ent.page;

import org.definitylabs.flue2ent.element.FindElementBy;
import org.definitylabs.flue2ent.element.WebElementWrapper;
import org.definitylabs.flue2ent.element.simple.SimpleWebElementDecorator;

public interface GoogleResult extends SimpleWebElementDecorator {

    @FindElementBy(tagName = "h3")
    String title();

    @FindElementBy(css = "h3 a", andGetAttribute = "href")
    String url();

    @FindElementBy(css = "h3 a")
    WebElementWrapper link();

    default void click() {
        link().click();
    }

    default boolean isOrganic() {
        return !isBanner();
    }

    default boolean isBanner() {
        return webElement().getAttribute("class").contains("g-blk");
    }

}
