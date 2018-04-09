package org.definitylabs.demo.flue2ent.page;

import org.definitylabs.flue2ent.element.WebElementWrapper;
import org.definitylabs.flue2ent.page.PageObject;
import org.openqa.selenium.By;

import static org.definitylabs.flue2ent.element.ExtendedBy.byValue;

public class GooglePageObject extends PageObject<GooglePageObject> {

    public WebElementWrapper english() {
        return website().findElement(By.linkText("English"));
    }

    public WebElementWrapper searchField() {
        return website().findElement(By.id("lst-ib"));
    }

    public WebElementWrapper searchButton() {
        return website().findElement(byValue("Google Search"));
    }

    public void search(String text) {
        searchField().enter(text);
        website().justWait().until(() -> searchButton().isDisplayed());
        searchButton().click();
    }

}
