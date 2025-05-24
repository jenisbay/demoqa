package com.demoqa.testdata;

import com.github.javafaker.Faker;
import org.testng.annotations.DataProvider;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestDataProvider {

    @DataProvider
    public static Object[] getTextBoxArguments() {
        Faker faker = new Faker();

        Map<String, Object> data = new HashMap<>();
        data.put("fullName", faker.name().fullName());
        data.put("email", faker.internet().emailAddress());
        data.put("currentAddress", faker.address().fullAddress());
        data.put("permanentAddress", faker.address().secondaryAddress());

        return new Object[]{data};
    }

    @DataProvider
    public static Object[][] getWebTablesArguments() {
        Faker faker = new Faker();

        Map<String, Object> map = new HashMap<>();
        map.put("firstName", faker.name().firstName());
        map.put("lastName", faker.name().lastName());
        map.put("age", faker.number().numberBetween(20, 30));
        map.put("email", faker.internet().emailAddress());
        map.put("salary", faker.number().numberBetween(200000, 300000));
        map.put("department", "Department");

        return new Object[][]{{map}};

    }

}
