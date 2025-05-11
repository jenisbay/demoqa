package com.demoqa.forms;

import aquality.selenium.elements.interfaces.ITextBox;
import aquality.selenium.forms.Form;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class UploadForm extends Form {

    private final ITextBox uploadFile = getElementFactory().getTextBox(
            By.xpath("//input[contains(@id, 'uploadFile')]"), "Choose File");

    public UploadForm() {
        super(By.xpath("//div[contains(@class, 'form-file')]/parent::form"), "Upload Form");
    }

    @Step("Selecting file to upload")
    public void uploadFile(String path) {
        uploadFile.clearAndType(path);
    }
}
