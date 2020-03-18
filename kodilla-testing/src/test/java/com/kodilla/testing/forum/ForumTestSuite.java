package com.kodilla.testing.forum;

import com.kodilla.testing.SimpleUser;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class ForumTestSuite {

    @Before
    public void before() {
        System.out.println("Test case begin");
    }

    @After
    public void after() {
        System.out.println("Test case end");
    }

    @Test
    public void testCaseUserName() {

        SimpleUser simpleUser = new SimpleUser("ForumUser", "John Smith");

        String result = simpleUser.getUserName();

        Assert.assertEquals("ForumUser", result);

    }

    @Test
    public void testCaseRealName() {

        SimpleUser simpleUser = new SimpleUser("ForumUser", "John Smith");

        String result = simpleUser.getRealName();

        Assert.assertEquals("John Smith", result);

    }
}
