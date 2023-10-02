package com.demoqa.utils;

import aquality.selenium.browser.AqualityServices;

public class Browser {

    public static aquality.selenium.browser.Browser getBrowser() {
        return AqualityServices.getBrowser();
    }

    public static void quit() {
        getBrowser().quit();
    }

    public static void maximize() {
        getBrowser().maximize();
    }

    public static void goTo(String url) {
        getBrowser().goTo(url);
    }

    public static void refresh() {
        getBrowser().refresh();
    }

    public static void waitForPageToLoad(){
        getBrowser().waitForPageToLoad();
    }

    public static String getDownloadDirectory(){
        return getBrowser().getDownloadDirectory();
    }

}
