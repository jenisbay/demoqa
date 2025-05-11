package com.demoqa.tests;

import com.demoqa.utils.Browser;
import com.demoqa.utils.Url;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    @BeforeMethod
    public void preConditions() {
        Browser.maximize();
        Browser.goTo(Url.baseUrl());
        Browser.waitForPageToLoad();
    }

    @AfterMethod
    public void postConditions() {
        Browser.quit();
    }


}
