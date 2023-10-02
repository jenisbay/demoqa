package com.demoqa.forms;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class ButtonsForm extends Form {

    private final static String doubleClickBtnXPath = "//button[contains(@id, 'doubleClickBtn')]";
    private final IButton doubleClickBtn = getElementFactory().getButton(By.xpath(doubleClickBtnXPath), "Double Click Me");

    private final static String rightClickBtnXPath = "//button[contains(@id, 'rightClickBtn')]";
    private final IButton rightClickBtn = getElementFactory().getButton(By.xpath(rightClickBtnXPath), "Right Click Me");

    private final static String clickMeBtnXPath = "//button[starts-with(text(), 'Click Me')]";
    private final IButton clickMeBtn = getElementFactory().getButton(By.xpath(clickMeBtnXPath), "Click Me");

    private final static String doubleClickMessageXPath = "//p[contains(@id, 'doubleClickMessage')]";
    private final ILabel doubleClickMessage = getElementFactory().getLabel(By.xpath(doubleClickMessageXPath), "Double Click Message");

    private final static String rightClickMessageXPath = "//p[contains(@id, 'rightClickMessage')]";
    private final ILabel rightClickMessage = getElementFactory().getLabel(By.xpath(rightClickMessageXPath), "Right Click Message");

    private final static String dynamicClickMessageXPath = "//p[contains(@id, 'dynamicClickMessage')]";
    private final ILabel dynamicClickMessage = getElementFactory().getLabel(By.xpath(dynamicClickMessageXPath), "Dynamic Click Message");

    public ButtonsForm() {
        super(By.xpath("//div[contains(@id, 'app')]"), "Buttons");
    }

    public void clickDoubleClickBtn(){
        doubleClickBtn.getMouseActions().doubleClick();
    }

    public void clickRightClickBtn(){
        rightClickBtn.getMouseActions().rightClick();
    }

    public void clickClickMeBtn(){
        clickMeBtn.getJsActions().click();
    }

    public String fetchDoubleClickMessageText(){
        return doubleClickMessage.getText();
    }

    public String fetchRightClickMessageText(){
        return rightClickMessage.getText();
    }

    public String fetchDynamicClickMessageText(){
        return dynamicClickMessage.getText();
    }

}
