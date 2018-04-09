package org.definitylabs.demo.flue2ent.page;

import org.definitylabs.flue2ent.element.FindElementBy;
import org.definitylabs.flue2ent.element.WebElementWrapper;
import org.definitylabs.flue2ent.element.simple.SimpleWebElementDecorator;

public interface GooglePrivacyReminderBar extends SimpleWebElementDecorator {

    @FindElementBy(id = "cnsd")
    WebElementWrapper remindMeLater();

    @FindElementBy(id = "cnsr")
    WebElementWrapper reviewNow();

}
