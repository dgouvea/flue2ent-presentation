package org.definitylabs.demo.flue2ent;

import org.definitylabs.flue2ent.Website;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class AbstractWebDriverTest {

    protected static WebDriver driver;
    protected static Website website;

    @BeforeClass
    public static void beforeEach() {
        driver = new ChromeDriver();
        website = Website.with(driver).visit("https://google.com");
        website.window().maximize();
    }

    @AfterClass
    public static void afterEach() {
//        driver.close();
//        driver.quit();
    }

}
