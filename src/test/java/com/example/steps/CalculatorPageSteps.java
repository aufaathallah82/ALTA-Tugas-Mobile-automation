package com.example.steps;

import com.example.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class CalculatorPageSteps extends BaseTest {

    @When("user input first number {string}")
    public void inputFirstNumber(String firstNumber) {
        calculatorPage.inputFirstNumber(firstNumber);
    }

    @And("user click spinner operator")
    public void userClickSpinnerOperator() {
        calculatorPage.clickSpinnerOperator();
    }

    @And("user choose {string} operator")
    public void userChoosePlusOperator(String operator) {
        calculatorPage.chooseSpinnerOperator(operator);
    }

    @And("user input second number {string}")
    public void userInputSecondNumber(String secondNumber) {
        calculatorPage.inputSecondNumber(secondNumber);
    }

    @And("click button calculate")
    public void clickButtonCalculate() {
        calculatorPage.clickBtnCalculate();
    }

    @Then("the result should be {string}")
    public void theResultShouldBe(String resultNumber) {
        String result = calculatorPage.checkResult();
        Assertions.assertEquals("Hasil : " + resultNumber, result);
    }
}
