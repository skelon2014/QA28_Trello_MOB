package com.skelon.mob.framework;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    AppiumDriver driver;
    DesiredCapabilities capabilities;
    /* "deviceName": "Nex5",
       "platformName": "Android",
       "platformVersion": "8.0",
       "appPackage": "com.trello",
       "appActivity": ".home.HomeActivity"
       */

    public void init() throws MalformedURLException {

        capabilities =new DesiredCapabilities();

        capabilities.setCapability("deviceName","Nex5");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"8.0");
        capabilities.setCapability("appPackage","com.trello");
        capabilities.setCapability("appActivity",".home.HomeActivity");

        capabilities.setCapability("automationName","Appium");
        capabilities.setCapability("app","C:/Users/Study/APK/trello_new.apk");
      driver = new AppiumDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void stop(){
        driver.quit();
    }
}
