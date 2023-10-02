package com.demoqa.tests;

import com.demoqa.configuration.Environment;
import com.demoqa.forms.*;
import com.demoqa.forms.pages.*;
import com.demoqa.testdata.TestDataProvider;
import com.demoqa.utils.Browser;
import com.demoqa.utils.Converter;
import com.demoqa.utils.UrlConnection;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Map;

public class DemoQATests extends BaseTest {

    @Test(dataProviderClass = TestDataProvider.class, dataProvider = "getTextBoxArguments")
    public void checkTextBoxFormWorks(Map<String, String> data) {

        HomePage homePage = new HomePage();
        homePage.clickCardByName(Environment.getTestData("card.elements"));
        Browser.waitForPageToLoad();

        ElementsPage elementsPage = new ElementsPage();
        elementsPage.clickElementByName(Environment.getTestData("element.text-box"));
        Browser.waitForPageToLoad();

        TextBoxForm textBoxForm = new TextBoxForm();
        textBoxForm.typeFullName(data.get("fullName"));
        textBoxForm.typeEmail(data.get("email"));
        textBoxForm.typeCurrentAddress(data.get("currentAddress"));
        textBoxForm.typePermanentAddress(data.get("permanentAddress"));
        textBoxForm.clickSubmitBtn();

        OutputBlock outputBlock = new OutputBlock();
        Assert.assertEquals(outputBlock.fetchNameText(), data.get("fullName"));
        Assert.assertEquals(outputBlock.fetchEmailText(), data.get("email"));
        Assert.assertEquals(outputBlock.fetchCurrentAddressText(), data.get("currentAddress"));
        Assert.assertEquals(outputBlock.fetchPermanentAddressText(), data.get("permanentAddress"));

    }

    @Test
    public void checkCheckBoxFormWorks() {

        HomePage homePage = new HomePage();
        homePage.clickCardByName(Environment.getTestData("card.elements"));
        Browser.waitForPageToLoad();

        ElementsPage elementsPage = new ElementsPage();
        elementsPage.clickElementByName(Environment.getTestData("element.check-box"));
        Browser.waitForPageToLoad();

    }

    @Test(dataProviderClass = TestDataProvider.class, dataProvider = "getWebTablesArguments")
    public void checkWebTablesFormWorks(Map<String, Object> mapData, List<String> listData) {

        HomePage homePage = new HomePage();
        homePage.clickCardByName(Environment.getTestData("card.elements"));
        Browser.waitForPageToLoad();

        ElementsPage elementsPage = new ElementsPage();
        elementsPage.clickElementByName(Environment.getTestData("element.web-tables"));
        Browser.waitForPageToLoad();

        WebTablesPage webTablesPage = new WebTablesPage();
        webTablesPage.clickAddBtn();

        RegistrationForm registrationForm = new RegistrationForm();
        registrationForm.typeFirstName(mapData.get("firstName").toString());
        registrationForm.typeLastName(mapData.get("lastName").toString());
        registrationForm.typeEmail(mapData.get("email").toString());
        registrationForm.typeAge(Integer.parseInt(mapData.get("age").toString()));
        registrationForm.typeSalary(mapData.get("salary").toString());
        registrationForm.typeDepartment(mapData.get("department").toString());
        registrationForm.clickSubmitBtn();

        WebTablesForm webTablesForm = new WebTablesForm();
        Assert.assertEquals(webTablesForm.fetchCellText(listData), Converter.listToString(listData));
    }

    @Test
    public void checkButtonsWork() {

        HomePage homePage = new HomePage();
        homePage.clickCardByName(Environment.getTestData("card.elements"));
        Browser.waitForPageToLoad();

        ElementsPage elementsPage = new ElementsPage();
        elementsPage.clickElementByName(Environment.getTestData("element.buttons"));
        Browser.waitForPageToLoad();

        ButtonsForm buttonsForm = new ButtonsForm();
        buttonsForm.clickDoubleClickBtn();
        Assert.assertEquals(buttonsForm.fetchDoubleClickMessageText(), Environment.getTestData("messages.buttons.doubleClick"), "Double click button NOT clicked");

        buttonsForm.clickRightClickBtn();
        Assert.assertEquals(buttonsForm.fetchRightClickMessageText(), Environment.getTestData("messages.buttons.rightClick"), "Right click button NOT clicked");

        buttonsForm.clickClickMeBtn();
        Assert.assertEquals(buttonsForm.fetchDynamicClickMessageText(), Environment.getTestData("messages.buttons.dynamicClick"), "Dynamic click button NOT clicked");

    }

    @Test
    public void checkBrokenLinksImagesWork() {
        HomePage homePage = new HomePage();
        homePage.clickCardByName(Environment.getTestData("card.elements"));
        Browser.waitForPageToLoad();

        ElementsPage elementsPage = new ElementsPage();
        elementsPage.clickElementByName(Environment.getTestData("element.broken-links-images"));
        Browser.waitForPageToLoad();

        BrokenLinksAndImagesForm brokenLinksAndImagesForm = new BrokenLinksAndImagesForm();

        Assert.assertEquals(UrlConnection.getResponseCode(brokenLinksAndImagesForm.fetchValidLinkUrl()), 301);
        Assert.assertEquals(UrlConnection.getResponseCode(brokenLinksAndImagesForm.fetchInvalidLinkUrl()), 500);

    }

    @Test
    public void checkUploadAndDownloadWork() {
        HomePage homePage = new HomePage();
        homePage.clickCardByName(Environment.getTestData("card.elements"));
        Browser.waitForPageToLoad();

        ElementsPage elementsPage = new ElementsPage();
        elementsPage.clickElementByName(Environment.getTestData("element.upload-download"));
        Browser.waitForPageToLoad();

        UploadAndDownloadPage uploadAndDownloadPage = new UploadAndDownloadPage();
        uploadAndDownloadPage.clickDownloadBtn();

        String filePath = Browser.getDownloadDirectory() + "/sampleFile.jpeg";
        UploadForm uploadForm = new UploadForm();
        uploadForm.uploadFile(filePath);
    }

    @Test
    public void checkDynamicPropertiesWork() {

        HomePage homePage = new HomePage();
        homePage.clickCardByName(Environment.getTestData("card.elements"));
        Browser.waitForPageToLoad();

        ElementsPage elementsPage = new ElementsPage();
        elementsPage.clickElementByName(Environment.getTestData("element.dynamic-properties"));
        Browser.waitForPageToLoad();

        DynamicPropertiesPage dynamicPropertiesPage = new DynamicPropertiesPage();
        dynamicPropertiesPage.clickEnableAfterBtn();
        dynamicPropertiesPage.clickColorChangeBtn();
        dynamicPropertiesPage.clickVisibleAfter();

    }

}
