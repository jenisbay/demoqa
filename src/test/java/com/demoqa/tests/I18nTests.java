package com.demoqa.tests;

import org.testng.annotations.Test;

import java.util.Locale;
import java.util.ResourceBundle;

public class I18nTests {

    @Test
    public void testCase1(){
        Locale locale = Locale.of("qq", "QQ");

        ResourceBundle message = ResourceBundle.getBundle("languages/Messages", locale);

        String greeting = message.getString("greeting");
        String apple = message.getString("apple");

        System.out.println(greeting);
        System.out.println(apple);

    }

}
