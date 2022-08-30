package com.example.app.pages;

import static com.example.app.drivers.AndroidDriverInit.driver;

import com.example.app.base.BasePageObject;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalculatorPage extends BasePageObject {

  By titleCalculator = MobileBy.xpath("//android.view.ViewGroup[@resource-id='com.isl.simpleapp:id/toolbar']//android.widget.TextView");
  By locator = MobileBy.AccessibilityId("Open navigation drawer");
  By etFirstNumber = MobileBy.id("com.isl.simpleapp:id/et_1");
  By etSecondNumber = MobileBy.id("com.isl.simpleapp:id/et_2");
  By btnCalculate = MobileBy.id("com.isl.simpleapp:id/acb_calculate");
  By tvResult = MobileBy.id("com.isl.simpleapp:id/tv_result");

  // Spinner
  By spinnerOperator = MobileBy.id("com.isl.simpleapp:id/spinner_1");
  By opeartorPlus = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[1]");
  By operatorMinus = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]");
  By operatorDivision = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[3]");
  By operatorMultiplication = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[4]");

  public String getTitle() {
    return getText(titleCalculator);
  }

  public boolean checkHamburgerBtnAppear() {
    WebDriverWait wait = new WebDriverWait(driver, 10, 1000);
    AndroidElement hamburgerBtn = (AndroidElement) wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    return hamburgerBtn.isDisplayed();
  }

  public void inputFirstNumber(String firstNumber) {
    type(etFirstNumber, firstNumber);
  }

  public void inputSecondNumber(String secondNumber) {
    type(etSecondNumber, secondNumber);
  }

  public void clickSpinnerOperator() {
    click(spinnerOperator);
  }

  public void chooseSpinnerOperator(String operator) {
    if (operator.equals("plus")) {
      click(opeartorPlus);
    } else if (operator.equals("minus")) {
      click(operatorMinus);
    } else if (operator.equals("multiplication")) {
      click(operatorMultiplication);
    } else {
      click(operatorDivision);
    }
  }

  public void clickBtnCalculate() {
    click(btnCalculate);
  }

  public String checkResult() {
    return getText(tvResult);
  }
}
