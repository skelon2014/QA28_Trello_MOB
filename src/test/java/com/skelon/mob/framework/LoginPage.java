package com.skelon.mob.framework;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class LoginPage extends HelperBase {

    public LoginPage(AppiumDriver driver) {
        super(driver);
    }

    public void fillLoginForm() throws InterruptedException {
        type(By.id("user"),"skelon@bk.ru");
        Thread.sleep(5000);
        if(isElementPresent(By.xpath("//*[@text='LOG IN']"))){
            click(By.xpath("//*[@text='LOG IN']"));
            if(isElementPresent(By.id("button_once"))) {
                click(By.id("button_once"));
                waitForElementAndclick(By.xpath("//*[@content-desc='Continue']"),60);
            }
        }
        type(By.id("password"),"Sandom2@14");

    }

    public void confirmLogin() {
        click(By.id("authenticate"));

    }
}
