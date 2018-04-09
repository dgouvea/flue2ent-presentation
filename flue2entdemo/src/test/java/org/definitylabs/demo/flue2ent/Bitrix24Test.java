package org.definitylabs.demo.flue2ent;

import org.definitylabs.demo.flue2ent.page.Bitrix24Page;
import org.definitylabs.demo.flue2ent.page.GooglePage;
import org.definitylabs.flue2ent.element.table.TableColumnElement;
import org.definitylabs.flue2ent.element.table.TableElement;
import org.definitylabs.flue2ent.element.table.TableRowElement;
import org.junit.Test;

import static org.definitylabs.flue2ent.element.table.filter.TableFilters.atColumn;

public class Bitrix24Test extends AbstractWebDriverTest {

    @Test
    public void test() {
        GooglePage googlePage = website.at(GooglePage.class);
        googlePage.english().click();
        googlePage.searchField().enter("bitrix 24 prices");
        website.justWait().until(() -> googlePage.searchButton().isDisplayed());
        googlePage.searchButton().click();

        googlePage.results().get(0).click();

        Bitrix24Page bitrix24Page = website.at(Bitrix24Page.class);
        TableElement plans = bitrix24Page.plans();
        TableRowElement<TableColumnElement> storageRow = plans.find(atColumn(0).byText("Online Storage"));

        storageRow.columns().forEach(column ->
                System.out.println(column.text())
        );
    }

}
