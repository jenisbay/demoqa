package com.demoqa.utils;

import java.util.List;

public class Converter {

    public static String listToString(List<String> list) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String item : list) {
            stringBuilder.append(item);
        }
        return stringBuilder.toString();
    }

}
