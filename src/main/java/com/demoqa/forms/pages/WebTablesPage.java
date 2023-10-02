package com.demoqa.forms.pages;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class WebTablesPage extends Form {

    private final static String addBtnXPath = "//button[contains(@id, 'addNewRecordButton')]";
    private final IButton addBtn = getElementFactory().getButton(By.xpath(addBtnXPath), "Add");

    public WebTablesPage() {
        super(By.xpath("//div[contains(@class, 'body-height']"), "Web Tables Page");
    }

    public void clickAddBtn(){
        addBtn.click();
    }

}
