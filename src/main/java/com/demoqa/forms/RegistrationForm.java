package com.demoqa.forms;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ITextBox;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class RegistrationForm extends Form {

    private final static String fistNameXPath = "//input[contains(@id, 'firstName')]";
    private final ITextBox firstName = getElementFactory().getTextBox(By.xpath(fistNameXPath), "First Name");

    private final static String lastNameXPath = "//input[contains(@id, 'lastName')]";
    private final ITextBox lastName = getElementFactory().getTextBox(By.xpath(lastNameXPath), "Last Name");

    private final static String emailXPath = "//input[contains(@id, 'userEmail')]";
    private final ITextBox email = getElementFactory().getTextBox(By.xpath(emailXPath), "Email");

    private final static String ageXPath = "//input[contains(@id, 'age')]";
    private final ITextBox age = getElementFactory().getTextBox(By.xpath(ageXPath), "Age");

    private final static String salaryXPath = "//input[contains(@id, 'salary')]";
    private final ITextBox salary = getElementFactory().getTextBox(By.xpath(salaryXPath), "Salary");

    private final static String departmentXPath = "//input[contains(@id, 'department')]";
    private final ITextBox department = getElementFactory().getTextBox(By.xpath(departmentXPath), "Department");

    private final static String submitBtnXPath = "//button[contains(@id, 'submit')]";
    private final IButton submitBtn = getElementFactory().getButton(By.xpath(submitBtnXPath), "Submit");


    public RegistrationForm() {
        super(By.xpath("//div[contains(@class, 'modal-content')]"), "Registration Form");
    }

    public void typeFirstName(String value){
        firstName.clearAndType(value);
    }

    public void typeLastName(String value){
        lastName.clearAndType(value);
    }

    public void typeEmail(String value){
        email.clearAndType(value);
    }

    public void typeAge(int value){
        age.clearAndType(String.valueOf(value));
    }

    public void typeSalary(String value){
        salary.clearAndType(value);
    }

    public void typeDepartment(String value){
        department.clearAndType(value);
    }

    public void clickSubmitBtn(){
        submitBtn.click();
    }

}
