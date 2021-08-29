package com.skelon.mob.tests;

import org.testng.annotations.Test;

public class LoginTests extends TestBase{

    @Test
    public void testLogin() throws InterruptedException {
        app.welcomeActivity().initLogin();
        app.loginActivity().fillLoginForm();
        app.loginActivity().confirmLogin();
    }
}
