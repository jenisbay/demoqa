package com.demoqa.utils;

import kong.unirest.Unirest;

public class UrlConnection {

    public static int getResponseCode(String url) {
        return Unirest.get(url).asString().getStatus();
    }

}
