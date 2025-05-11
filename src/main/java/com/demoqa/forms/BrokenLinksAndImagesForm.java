package com.demoqa.forms;

import aquality.selenium.elements.interfaces.ILink;
import aquality.selenium.forms.Form;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class BrokenLinksAndImagesForm extends Form {

    private final ILink validLink = getElementFactory().getLink(
            By.xpath("//a[contains(text(), 'Click Here for Valid Link')]"), "Click Here for Valid Link");
    private final ILink invalidLink = getElementFactory().getLink(
            By.xpath("//a[contains(text(), 'Click Here for Broken Link')]"), "Click Here for Broken Link");

    public BrokenLinksAndImagesForm() {
        super(By.xpath("//div[contains(@id, 'app')]"), "Broken Links - Images");
    }

    @Step("Fetching valid url")
    public String fetchValidLinkUrl(){
        return validLink.getHref();
    }

    @Step("Fetching invalid url")
    public String fetchInvalidLinkUrl(){
        return invalidLink.getHref();
    }
}
