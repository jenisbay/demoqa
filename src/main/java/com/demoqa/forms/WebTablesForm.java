package com.demoqa.forms;

import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

import java.util.List;

public class WebTablesForm extends Form {

    public WebTablesForm() {
        super(By.xpath("//div[contains(@role, 'grid')]"), "Web Tables");
    }

    private ILabel getCell(String xpath) {
        return getElementFactory().getLabel(By.xpath(xpath), "Cell");
    }

    public String fetchCellText(String value) {
        return getCell(String.format("//div[contains(text(), '%s')]", value)).getText();

    }


}
