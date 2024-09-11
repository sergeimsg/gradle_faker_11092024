package by.itacademy.smelnik.utils;

import com.github.javafaker.Faker;

public class Utils {

    static Faker faker = new Faker();

    public static String getName(){

        return faker.name().firstName();
    }

    public static String getEmail(){
        return faker.internet().emailAddress();
    }


}
