package com.demoqa.forms;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ITextBox;
import aquality.selenium.forms.Form;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class RegistrationForm extends Form {

    private final ITextBox firstName = getElementFactory().getTextBox(
            By.xpath("//input[contains(@id, 'firstName')]"), "First Name");
    private final ITextBox lastName = getElementFactory().getTextBox(
            By.xpath("//input[contains(@id, 'lastName')]"), "Last Name");
    private final ITextBox email = getElementFactory().getTextBox(
            By.xpath("//input[contains(@id, 'userEmail')]"), "Email");
    private final ITextBox age = getElementFactory().getTextBox(
            By.xpath("//input[contains(@id, 'age')]"), "Age");
    private final ITextBox salary = getElementFactory().getTextBox(
            By.xpath("//input[contains(@id, 'salary')]"), "Salary");
    private final ITextBox department = getElementFactory().getTextBox(
            By.xpath("//input[contains(@id, 'department')]"), "Department");
    private final IButton submitBtn = getElementFactory().getButton(
            By.xpath("//button[contains(@id, 'submit')]"), "Submit");

    public RegistrationForm() {
        super(By.xpath("//div[contains(@class, 'modal-content')]"), "Registration Form");
    }

    @Step("Typing firstname")
    public void typeFirstName(String value){
        firstName.clearAndType(value);
    }

    @Step("Typing lastname")
    public void typeLastName(String value){
        lastName.clearAndType(value);
    }

    @Step("Typing email")
    public void typeEmail(String value){
        email.clearAndType(value);
    }

    @Step("Typing age")
    public void typeAge(int value){
        age.clearAndType(String.valueOf(value));
    }

    @Step("Typing salary")
    public void typeSalary(String value){
        salary.clearAndType(value);
    }

    @Step("Type department")
    public void typeDepartment(String value){
        department.clearAndType(value);
    }

    @Step("Clicking submit button")
    public void clickSubmitBtn(){
        submitBtn.getJsActions().click();
    }
}
