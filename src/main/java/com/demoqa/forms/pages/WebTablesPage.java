package com.demoqa.forms.pages;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.forms.Form;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class WebTablesPage extends Form {

    private final IButton addBtn = getElementFactory().getButton(
            By.xpath("//button[contains(@id, 'addNewRecordButton')]"), "Add");

    public WebTablesPage() {
        super(By.xpath("//div[contains(@class, 'body-height']"), "Web Tables Page");
    }

    @Step("Clicking add button")
    public void clickAddBtn(){
        addBtn.getJsActions().click();
    }
}
