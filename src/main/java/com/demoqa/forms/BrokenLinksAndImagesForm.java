package com.demoqa.forms;

import aquality.selenium.elements.interfaces.ILink;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class BrokenLinksAndImagesForm extends Form {

    private final static String validLinkXPath = "//a[contains(text(), 'Click Here for Valid Link')]";
    private final ILink validLink = getElementFactory().getLink(By.xpath(validLinkXPath), "Click Here for Valid Link");

    private final static String invalidLinkXPath = "//a[contains(text(), 'Click Here for Broken Link')]";
    private final ILink invalidLink = getElementFactory().getLink(By.xpath(invalidLinkXPath), "Click Here for Broken Link");

    public BrokenLinksAndImagesForm() {
        super(By.xpath("//div[contains(@id, 'app')]"), "Broken Links - Images");
    }

    public String fetchValidLinkUrl(){
        return validLink.getHref();
    }

    public String fetchInvalidLinkUrl(){
        return invalidLink.getHref();
    }

}
