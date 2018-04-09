package org.definitylabs.demo.flue2ent;

import org.definitylabs.demo.flue2ent.page.GooglePage;
import org.junit.Test;

import java.io.File;

import static org.definitylabs.flue2ent.plugin.screenshot.ScreenshotImageHighlighterFactory.highlightingPixels;

public class ScreenshotTest extends AbstractWebDriverTest {

    @Test
    public void test() {
        GooglePage googlePage = website.at(GooglePage.class);
        googlePage.english().click();

        googlePage.searchField().enter("Github");
        website.justWait().until(() -> googlePage.searchButton().isDisplayed());
        googlePage.searchButton().click();

        website.screenshot().takeAsFile(file -> {
            website.mouse().moveTo(googlePage.results().get(0).link());

            File imageDiffFile = website.screenshot().takeAnd().compareTo(file).image().getFile();
            System.out.println(imageDiffFile);
        });
    }

    @Test
    public void policyReminderBarTest() {
        GooglePage googlePage = website.at(GooglePage.class);
        googlePage.english().click();

        website.screenshot().takeAsFile(file -> {
            googlePage.privacyReminderBar().remindMeLater().click();

            File imageDiffFile = website.screenshot().takeAnd().compareTo(file).image(highlightingPixels()).getFile();
            System.out.println(imageDiffFile);
        });
    }

}
