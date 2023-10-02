package com.demoqa.forms;

import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.elements.interfaces.IRadioButton;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class RadioButtonForm extends Form {

    private final static String yesRadioXPath = "//input[contains(@id, 'yesRadio')]";
    private final IRadioButton yesRadio = getElementFactory().getRadioButton(By.xpath(yesRadioXPath), "Yes");

    private final static String impressiveRadioXPath = "//input[contains(@id, 'impressiveRadio')]";
    private final IRadioButton impressiveRadio = getElementFactory().getRadioButton(By.xpath(impressiveRadioXPath), "Impressive");

    private final static String textSuccessXPath = "";
    private final ILabel textSuccess = getElementFactory().getLabel(By.xpath(textSuccessXPath), "Text Success");

    private IRadioButton selected = null;

    public RadioButtonForm() {
        super(By.xpath("//div[contains(@class, 'playgound-body')]"), "Radio Button Form");
    }

    public void clickYes(){
        yesRadio.click();
        selected = yesRadio;
    }

    public void clickImpressive(){
        impressiveRadio.click();
        selected = yesRadio;
    }

    public void fetchSelectedRadioText(){
        if (selected == null){
            return;
        }
        selected.getName();
    }

}
