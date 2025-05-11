package com.demoqa.forms.pages;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.forms.Form;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class UploadAndDownloadPage extends Form {

    private final IButton downloadButton = getElementFactory().getButton(
            By.xpath("//a[contains(@id, 'downloadButton')]"), "Download");

    public UploadAndDownloadPage() {
        super(By.xpath("//div[contains(@id, 'app')]"), "Upload And Download");
    }

    @Step("Clicking download button")
    public void clickDownloadBtn() {
        downloadButton.getJsActions().click();
    }
}
