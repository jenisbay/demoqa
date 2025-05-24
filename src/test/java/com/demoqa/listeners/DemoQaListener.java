package com.demoqa.listeners;

import com.demoqa.utils.Browser;
import io.qameta.allure.Attachment;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class DemoQaListener implements ITestListener {
    @Override
    public void onTestFailure(ITestResult result) {
        takeScreenshot();
    }

    @Attachment(value = "screenshot", type = "image/png", fileExtension = ".png")
    private byte[] takeScreenshot() {
        return Browser.getBrowser().getScreenshot();
    }
}
