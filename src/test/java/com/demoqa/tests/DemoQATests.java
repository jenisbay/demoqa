package com.demoqa.tests;

import com.demoqa.configuration.Environment;
import com.demoqa.forms.*;
import com.demoqa.forms.pages.*;
import com.demoqa.listeners.DemoQaListener;
import com.demoqa.testdata.TestDataProvider;
import com.demoqa.utils.Browser;
import com.demoqa.utils.UrlConnection;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.testng.Tag;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.util.Map;

@Listeners(DemoQaListener.class)
public class DemoQATests extends BaseTest {

    @Test(dataProviderClass = TestDataProvider.class,
            dataProvider = "getTextBoxArguments",
            description = "This method checks if Text form elements works correctly")
    @Owner("Jenis")
    @Tag("UI")
    @Severity(SeverityLevel.BLOCKER)
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

    @Test(description = "This method checks if box form elements works correctly")
    @Owner("Jenis")
    @Tag("UI")
    @Severity(SeverityLevel.CRITICAL)
    public void checkCheckBoxFormWorks() {

        HomePage homePage = new HomePage();
        homePage.clickCardByName(Environment.getTestData("card.elements"));
        Browser.waitForPageToLoad();

        ElementsPage elementsPage = new ElementsPage();
        elementsPage.clickElementByName(Environment.getTestData("element.check-box"));
        Browser.waitForPageToLoad();

    }

    @Test(dataProviderClass = TestDataProvider.class,
            dataProvider = "getWebTablesArguments",
            description = "This method checks if web tables shows data correctly")
    @Owner("Jenis")
    @Tag("UI")
    @Severity(SeverityLevel.CRITICAL)
    public void checkWebTablesFormWorks(Map<String, Object> mapData) {

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
        Assert.assertEquals(webTablesForm.fetchCellText(mapData.get("firstName").toString()), mapData.get("firstName").toString());
    }

    @Test(description = "This method checks if link are broken or not")
    @Owner("Jenis")
    @Tag("UI")
    @Severity(SeverityLevel.MINOR)
    public void checkBrokenLinksImagesWork() {
        HomePage homePage = new HomePage();
        homePage.clickCardByName(Environment.getTestData("card.elements"));
        Browser.waitForPageToLoad();

        ElementsPage elementsPage = new ElementsPage();
        elementsPage.clickElementByName(Environment.getTestData("element.broken-links-images"));
        Browser.waitForPageToLoad();

        BrokenLinksAndImagesForm brokenLinksAndImagesForm = new BrokenLinksAndImagesForm();

        Assert.assertEquals(UrlConnection.getResponseCode(brokenLinksAndImagesForm.fetchValidLinkUrl()), 200);
        Assert.assertEquals(UrlConnection.getResponseCode(brokenLinksAndImagesForm.fetchInvalidLinkUrl()), 500);

    }

    @Test(description = "This method checks if uploading files works")
    @Owner("Jenis")
    @Tag("UI")
    @Severity(SeverityLevel.NORMAL)
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

    @Test(description = "This method checks if Dynamic properties work")
    @Owner("Jenis")
    @Tag("UI")
    @Severity(SeverityLevel.MINOR)
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
