package com.testdua.step_definitions;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.testdua.youtube.pages.SearchDataPage;
import com.testdua.youtube.utils.Constants;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestSearchData {

        private static WebDriver driver;
        private static ExtentTest extentTest;

        private Hooks hooks = new Hooks();

        private SearchDataPage searchData = new SearchDataPage();

        public TestSearchData() {
            driver = Hooks.driver;
            extentTest = Hooks.extentTest;
        }


        // SEARCH DATA 001
        @When("TCC.YTB.001 Mengakses URL")
        public void mengakses_url() {
            driver.get(Constants.URL);
            extentTest.log(LogStatus.PASS, "open web youtube");
        }

        @Then("TCC.YTB.001 Berhasil mengakses URL")
        public void berhasil_mengakses_url() {
            Assert.assertEquals(searchData.getTxtValidURL(), "Youtube");
            extentTest.log(LogStatus.PASS, "TCC.YTB.001 Berhasil mengakses URL");
        }

        //Search data valid
        @When("TCC.YTB.002 Klik Search menu")
        public void klik_search_menu() {
            searchData.clickSearchMenu();
            extentTest.log(LogStatus.PASS, "click search menu");
        }

        @And("TCC.YTB.002 Input Search")
        public void input_search() {
            searchData.inputDataSearch("Juara Coding");
            extentTest.log(LogStatus.PASS, "input juara coding");
        }

        @And("TCC.YTB.002 Klik tombol enter")
        public void klik_tombol_enter() {
            searchData.inputDataSearch(String.valueOf(Keys.ENTER));
            extentTest.log(LogStatus.PASS, "klik enter");
        }

        @Then("TCC.YTB.002 Tampil hasil pencarian")
        public void tampil_hasil_pencarian() {
            Assert.assertEquals(searchData.getTxtResultSearch(), "Juara Coding");
            extentTest.log(LogStatus.PASS, "Tampil hasil pencarian juara coding");
        }
}
