package org.definitylabs.demo.flue2ent.page;

import org.definitylabs.flue2ent.element.FindElementBy;
import org.definitylabs.flue2ent.element.Param;
import org.definitylabs.flue2ent.element.WebElementWrapper;
import org.definitylabs.flue2ent.element.simple.SimpleWebElementDecorator;

public interface GooglePagination extends SimpleWebElementDecorator {

    @FindElementBy(linkText = "{number}")
    WebElementWrapper page(@Param("number") int number);

    @FindElementBy(linkText = "Next")
    WebElementWrapper next();

}
