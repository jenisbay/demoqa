package com.demoqa.forms.pages;

import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.elements.interfaces.ILink;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class HomePage extends Form {


    public HomePage() {
        super(By.xpath("//div[contains(@id, 'app')]"), "Home Page");
    }

    private ILink getCard(String cardName) {
        String xPath = String.format("//h5[contains(text(), '%s')]//parent::div[contains(@class, 'card-body')]", cardName);
        return getElementFactory().getLink(By.xpath(xPath), cardName);
    }

    public void clickCardByName(String cardName){
        getCard(cardName).getJsActions().click();
    }

}
