package com.demoqa.forms.pages;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.forms.Form;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class DynamicPropertiesPage extends Form {

    private final IButton enableAfter = getElementFactory().getButton(
            By.xpath("//button[contains(@id, 'enableAfter')]"), "Will enable 5 seconds");
    private final IButton colorChange = getElementFactory().getButton(
            By.xpath("//button[contains(@id, 'colorChange')]"), "Color Change");
    private final IButton visibleAfter = getElementFactory().getButton(
            By.xpath("//button[contains(@id, 'visibleAfter')]"), "Visible After 5 Seconds");

    public DynamicPropertiesPage() {
        super(By.xpath("//div[contains(@id, 'app']"), "Dynamic Properties");
    }

    @Step("Click enable after button")
    public void clickEnableAfterBtn() {
        enableAfter.state().waitForEnabled();
        enableAfter.getJsActions().click();
    }

    @Step("Clicking color change button")
    public void clickColorChangeBtn() {
        colorChange.getJsActions().click();

    }

    @Step("Clicking visible after")
    public void clickVisibleAfter() {
        visibleAfter.state().waitForDisplayed();
        visibleAfter.getJsActions().click();
    }
}
