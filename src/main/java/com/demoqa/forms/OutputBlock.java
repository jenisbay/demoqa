package com.demoqa.forms;

import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.forms.Form;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class OutputBlock extends Form {

    private final ILabel name = getElementFactory().getLabel(
            By.xpath("//p[contains(@id, 'name')]"), "Name");
    private final ILabel email = getElementFactory().getLabel(
            By.xpath("//p[contains(@id, 'email')]"), "Email");
    private final ILabel currentAddress = getElementFactory().getLabel(
            By.xpath("//p[contains(@id, 'currentAddress')]"), "Current Address");
    private final ILabel permanentAddress = getElementFactory().getLabel(
            By.xpath("//p[contains(@id, 'permanentAddress')]"), "Permanent Address");

    public OutputBlock() {
        super(By.xpath("//div[contains(@id, 'output')]"), "Output");
    }

    @Step("Fetching name")
    public String fetchNameText(){
        return name.getText().split(":")[1];
    }

    @Step("Fetching email")
    public String fetchEmailText(){
        return email.getText().split(":")[1];
    }

    @Step("Fetching current address")
    public String fetchCurrentAddressText(){
        return currentAddress.getText().split(":")[1];
    }

    @Step("Fetching permanent address")
    public String fetchPermanentAddressText(){
        return permanentAddress.getText().split(":")[1];
    }
}
