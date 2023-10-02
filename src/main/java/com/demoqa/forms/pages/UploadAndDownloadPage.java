package com.demoqa.forms.pages;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class UploadAndDownloadPage extends Form {

    private final static String downloadButtonXPath = "//a[contains(@id, 'downloadButton')]";
    private final IButton downloadButton = getElementFactory().getButton(By.xpath(downloadButtonXPath), "Download");

    public UploadAndDownloadPage() {
        super(By.xpath("//div[contains(@id, 'app')]"), "Upload And Download");
    }

    public void clickDownloadBtn(){
        downloadButton.click();
    }
}
