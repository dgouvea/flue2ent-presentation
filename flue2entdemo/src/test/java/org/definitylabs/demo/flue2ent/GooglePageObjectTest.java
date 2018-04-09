package org.definitylabs.demo.flue2ent;

import org.definitylabs.demo.flue2ent.page.GooglePageObject;
import org.junit.Test;

public class GooglePageObjectTest extends AbstractWebDriverTest {

    @Test
    public void test() {
        website.at(new GooglePageObject()).english().click();
        website.at(new GooglePageObject()).searchField().enter("Github");
        website.justWait().until(() -> website.at(new GooglePageObject()).searchButton().isDisplayed());
        website.at(new GooglePageObject()).searchButton().click();
    }

    @Test
    public void testSearch() {
        GooglePageObject googlePageObject = website.at(new GooglePageObject());
        googlePageObject.english().click();
        googlePageObject.search("Github");
    }

}
