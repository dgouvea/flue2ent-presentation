package org.definitylabs.demo.flue2ent;

import org.definitylabs.demo.flue2ent.page.GooglePage;
import org.definitylabs.demo.flue2ent.page.GoogleResult;
import org.junit.Test;

public class GooglePageTest extends AbstractWebDriverTest {

    @Test
    public void test() {
        GooglePage googlePage = website.at(GooglePage.class);
        googlePage.english().click();
        googlePage.searchField().enter("Github");
        website.justWait().until(() -> googlePage.searchButton().isDisplayed());
        googlePage.searchButton().click();

        googlePage.results().stream()
                .filter(GoogleResult::isOrganic)
                .forEach(result -> {
                    System.out.println(result.title());
                    System.out.println(result.url());
                });

        website.scroll().bottom();

        googlePage.pagination().page(3).click();
        googlePage.pagination().next().click();
    }

}
