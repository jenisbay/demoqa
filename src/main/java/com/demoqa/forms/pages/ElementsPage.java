package com.demoqa.forms.pages;

import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.elements.interfaces.ILink;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class ElementsPage extends Form {

    public ElementsPage() {
        super(By.xpath("//div[contains(@id, 'app')]"), "Elements");
    }

    private ILink getElement(String elementName) {
        String xPath = String.format("//span[contains(text(), '%s')]//ancestor::li[starts-with(@id, 'item-')]", elementName);
        return getElementFactory().getLink(By.xpath(xPath), elementName);
    }

    public void clickElementByName(String elementName){
        getElement(elementName).getJsActions().click();
    }


}
