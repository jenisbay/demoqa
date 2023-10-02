package com.demoqa.forms;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ITextBox;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class UploadForm extends Form {

    private final static String uploadFileXPath = "//input[contains(@id, 'uploadFile')]";
    private final ITextBox uploadFile = getElementFactory().getTextBox(By.xpath(uploadFileXPath), "Choose File");

    public UploadForm() {
        super(By.xpath("//div[contains(@class, 'form-file')]/parent::form"), "Upload Form");
    }

    public void uploadFile(String path){
        uploadFile.clearAndType(path);
    }

}
