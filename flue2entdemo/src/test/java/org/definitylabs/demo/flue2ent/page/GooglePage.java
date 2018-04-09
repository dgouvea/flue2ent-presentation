package org.definitylabs.demo.flue2ent.page;

import org.definitylabs.flue2ent.element.FindElementBy;
import org.definitylabs.flue2ent.element.WebElementWrapper;

import java.util.List;

public interface GooglePage {

    @FindElementBy(linkText = "English")
    WebElementWrapper english();

    @FindElementBy(id = "lst-ib")
    WebElementWrapper searchField();

    @FindElementBy(value = "Google Search")
    WebElementWrapper searchButton();

    @FindElementBy(className = "g")
    List<GoogleResult> results();

    @FindElementBy(id = "navcnt")
    GooglePagination pagination();

}
