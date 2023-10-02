package com.demoqa.forms;

import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class OutputBlock extends Form {

    private final static String nameXPath = "//p[contains(@id, 'name')]";
    private final ILabel name = getElementFactory().getLabel(By.xpath(nameXPath), "Name");

    private final static String emailXPath = "//p[contains(@id, 'email')]";
    private final ILabel email = getElementFactory().getLabel(By.xpath(emailXPath), "Email");

    private final static String currentAddressXPath = "//p[contains(@id, 'currentAddress')]";
    private final ILabel currentAddress = getElementFactory().getLabel(By.xpath(currentAddressXPath), "Current Address");

    private final static String permanentAddressXPath = "//p[contains(@id, 'permanentAddress')]";
    private final ILabel permanentAddress = getElementFactory().getLabel(By.xpath(permanentAddressXPath), "Permanent Address");

    public OutputBlock() {
        super(By.xpath("//div[contains(@id, 'output')]"), "Output");
    }

    public String fetchNameText(){
        return name.getText().split(":")[1];
    }

    public String fetchEmailText(){
        return email.getText().split(":")[1];
    }

    public String fetchCurrentAddressText(){
        return currentAddress.getText().split(":")[1];
    }

    public String fetchPermanentAddressText(){
        return permanentAddress.getText().split(":")[1];
    }


}
