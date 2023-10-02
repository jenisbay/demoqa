package com.demoqa.utils;

import com.demoqa.configuration.Environment;

public class Url {

    public static String baseUrl(){
        return Environment.getConfig("baseUrl");
    }

}
