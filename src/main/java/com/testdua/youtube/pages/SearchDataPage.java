package com.testdua.youtube.pages;

import com.testdua.youtube.drivers.DriverSingleton;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class SearchDataPage {

    private WebDriver driver;
    private WebElement sendKeyStatus;

    public SearchDataPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"logo-icon\"]")
    WebElement txtValidURL;
    @FindBy(xpath = "//*[@id=\"search-form\"]")
    WebElement clickSearchMenu;

    @FindBy(xpath = "//*[@id=\"search-input\"]")
    WebElement inputDataSearch;

    @FindBy(xpath = "//*[@id=\"container\"]/ytd-two-column-search-results-renderer")
    WebElement txtResultSearch;


    public String getTxtValidURL() {
        return txtValidURL.getText();}
    public void clickSearchMenu() {
        clickSearchMenu.click();
    }

    public void inputDataSearch(String inputDataSearch){
        this.inputDataSearch.sendKeys(inputDataSearch);
    }

    public String getTxtResultSearch() {
        return txtResultSearch.getText();
    }

}