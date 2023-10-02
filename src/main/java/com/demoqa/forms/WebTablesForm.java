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

    public String fetchCellText(List<String> list) {

        StringBuilder formatBuilder = new StringBuilder();
        StringBuilder resultBuilder = new StringBuilder();

        for (int i = 0; i < list.toArray().length; i++) {
            if (i == 0) {
                formatBuilder.append(String.format("//div[contains(text(), '%s')]", list.get(i)));
            } else {
                formatBuilder.append(String.format("/following-sibling::div[contains(text(), '%s')]", list.get(i)));
            }
            resultBuilder.append(getCell(formatBuilder.toString()).getText());
        }

        return resultBuilder.toString();
    }


}
