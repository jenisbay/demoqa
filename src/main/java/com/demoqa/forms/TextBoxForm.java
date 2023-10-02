package com.demoqa.forms;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ITextBox;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class TextBoxForm extends Form {

    private final static String fullNameXPath = "//input[contains(@id, 'userName')]";
    private final ITextBox fullName = getElementFactory().getTextBox(By.xpath(fullNameXPath), "Full Name");

    private final static String emailXPath = "//input[contains(@id, 'userEmail')]";
    private final ITextBox email = getElementFactory().getTextBox(By.xpath(emailXPath), "Email");

    private final static String currentAddressXPath = "//textarea[contains(@id, 'currentAddress')]";
    private final ITextBox currentAddress = getElementFactory().getTextBox(By.xpath(currentAddressXPath), "Current Address");

    private final static String permanentAddressXPath = "//textarea[contains(@id, 'permanentAddress')]";
    private final ITextBox permanentAddress = getElementFactory().getTextBox(By.xpath(permanentAddressXPath), "Permanent Address");

    private final static String submitBtnXPath = "//button[contains(@id, 'submit')]";
    private final IButton submitBtn = getElementFactory().getButton(By.xpath(submitBtnXPath), "Submit");

    public TextBoxForm() {
        super(By.xpath("//form[contains(@id, 'userForm')]"), "Text Box Form");
    }

    public void typeFullName(String value) {
        fullName.clearAndType(value);
    }

    public void typeEmail(String value){
        email.clearAndType(value);
    }

    public void typeCurrentAddress(String value){
        currentAddress.clearAndType(value);
    }

    public void typePermanentAddress(String value){
        permanentAddress.clearAndType(value);
    }

    public void clickSubmitBtn(){
        submitBtn.getJsActions().click();
    }

}
