package com.skelon.mob.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LaunchApp extends TestBase{
    @Test
    public void testLaunchApp(){
        logger.info("app Trello is running!");
        Assert.assertTrue(app.welcomeActivity().isHelloPresent());
    }
}
