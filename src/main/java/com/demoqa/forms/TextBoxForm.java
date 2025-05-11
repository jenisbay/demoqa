package com.demoqa.forms;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ITextBox;
import aquality.selenium.forms.Form;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class TextBoxForm extends Form {

    private final ITextBox fullName = getElementFactory().getTextBox(
            By.xpath("//input[contains(@id, 'userName')]"), "Full Name");
    private final ITextBox email = getElementFactory().getTextBox(
            By.xpath("//input[contains(@id, 'userEmail')]"), "Email");
    private final ITextBox currentAddress = getElementFactory().getTextBox(
            By.xpath("//textarea[contains(@id, 'currentAddress')]"), "Current Address");
    private final ITextBox permanentAddress = getElementFactory().getTextBox(
            By.xpath("//textarea[contains(@id, 'permanentAddress')]"), "Permanent Address");
    private final IButton submitBtn = getElementFactory().getButton(
            By.xpath("//button[contains(@id, 'submit')]"), "Submit");

    public TextBoxForm() {
        super(By.xpath("//form[contains(@id, 'userForm')]"), "Text Box Form");
    }

    @Step("Typing full name")
    public void typeFullName(String value) {
        fullName.clearAndType(value);
    }

    @Step("Typing email")
    public void typeEmail(String value){
        email.clearAndType(value);
    }

    @Step("Typing current address")
    public void typeCurrentAddress(String value){
        currentAddress.clearAndType(value);
    }

    @Step("Typing permanent address")
    public void typePermanentAddress(String value){
        permanentAddress.clearAndType(value);
    }

    @Step("Clicking submit button")
    public void clickSubmitBtn(){
        submitBtn.getJsActions().click();
    }
}
