package com.demoqa.forms.pages;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class DynamicPropertiesPage extends Form {

    private final static String enableAfterXPath = "//button[contains(@id, 'enableAfter')]";
    private final IButton enableAfter = getElementFactory().getButton(By.xpath(enableAfterXPath), "Will enable 5 seconds");

    private final static String colorChangeXPath = "//button[contains(@id, 'colorChange')]";
    private final IButton colorChange = getElementFactory().getButton(By.xpath(colorChangeXPath), "Color Change");

    private final static String visibleAfterXPath = "//button[contains(@id, 'visibleAfter')]";
    private final IButton visibleAfter = getElementFactory().getButton(By.xpath(visibleAfterXPath), "Visible After 5 Seconds");

    public DynamicPropertiesPage() {
        super(By.xpath("//div[contains(@id, 'app']"), "Dynamic Properties");
    }

    public void clickEnableAfterBtn() {
        enableAfter.state().waitForEnabled();
        enableAfter.click();
    }

    public void clickColorChangeBtn() {
        colorChange.click();

    }

    public void clickVisibleAfter() {
        visibleAfter.state().waitForDisplayed();
        visibleAfter.click();
    }


}
