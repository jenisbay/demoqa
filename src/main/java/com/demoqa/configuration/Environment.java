package com.demoqa.configuration;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

public class Environment {

    private final static String configPath = "config.json";
    private final static String testDataPath = "test_data.json";

    public static Config getResource(String path){
        return ConfigFactory.parseResources(path);
    }

    public static String getConfig(String key){
        return getResource(configPath).getString(key);
    }

    public static String getTestData(String key){
        return getResource(testDataPath).getString(key);
    }

}
