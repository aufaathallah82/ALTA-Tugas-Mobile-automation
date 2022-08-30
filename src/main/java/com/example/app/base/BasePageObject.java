package com.example.app.base;

import com.example.app.drivers.AndroidDriverInit;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.touch.TouchActions;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class BasePageObject {

  public AndroidDriver<AndroidElement> getDriver(){
    return AndroidDriverInit.driver;
  }

  public AndroidElement find(By by){
    return getDriver().findElement(by);
  }

  public void type(By by, String text) {
    AndroidElement element = find(by);
    element.clear();
    element.sendKeys(text);
  }

  public void typeNum(By by, String text) {
    AndroidElement element = find(by);
    element.clear();
    element.sendKeys(text);
  }

  public void click(By by){
    find(by).click();
  }

  public String getText(By by){
    return find(by).getText();
  }

  public boolean isDisplayed(By by){
    return find(by).isDisplayed();
  }

  public void longPress(By by) {
    AndroidElement element = find(by);
    TouchAction action = new TouchAction(getDriver());
    action.longPress(PointOption.point(element.getCenter()))
            .waitAction(WaitOptions.waitOptions(
                    Duration.of(20, ChronoUnit.SECONDS)
            )).release();

//    TouchActions action = new TouchActions(getDriver());
//    action.longPress(find(by));
//    action.perform();

  }
}
