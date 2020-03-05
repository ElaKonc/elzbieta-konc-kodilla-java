package com.kodilla.testing;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUserName();

        if(result.equals("theForumUser")) {
            System.out.println("test ok");
        } else {
            System.out.println("error");
        }

        System.out.println("Test 2");
    }
}
