package com.skelon.mob.tests;

import com.skelon.mob.framework.ApplicationManager;
import org.openqa.selenium.remote.BrowserType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class TestBase {

    protected static ApplicationManager app = new ApplicationManager();
    Logger logger = LoggerFactory.getLogger(TestBase.class);


    @BeforeSuite
    public void setUp() throws IOException, InterruptedException {
        // Capabilities caps = new DesiredCapabilities();
        app.init();
    }

    @AfterSuite(alwaysRun = true)
    public void tearDown() throws InterruptedException {
       // app.board().clearBoardsList();
        app.stop();
    }
    @BeforeMethod
    public void startLogger(Method m, Object[] parameter) {

        logger.info("Test " + m.getName() + " started with parametres - " + Arrays.asList(parameter));
    }

    @AfterMethod
    public void stopLogger(Method m) {
        logger.info("Test " + m.getName() + " finished");
    }


}
