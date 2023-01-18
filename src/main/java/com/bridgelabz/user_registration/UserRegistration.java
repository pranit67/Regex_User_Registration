package com.bridgelabz.user_registration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    String fail = "Please Provide Correct Input";

    public String addFirstName(String name) {
        String regex = "^[A-Z][a-z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(name);
        if (matcher.matches()) {
            return name;
        } else {
            return fail;
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to User Registration Program..!");
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter First name \n(Starts with Capital and has Minimum 3 characters)");
        String firstName = scan.next();
        UserRegistration obj = new UserRegistration();
        System.out.println(obj.addFirstName(firstName));
        System.out.println("--------------------------------");
        System.out.println("Please Enter Last name \n(Starts with Capital and has Minimum 3 characters)");
        String lastName = scan.next();
        System.out.println(obj.addFirstName(lastName));
    }
}
