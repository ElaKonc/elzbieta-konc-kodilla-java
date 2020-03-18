package com.kodilla.testing.forum;

import com.kodilla.testing.user.SimpleUser;
import org.junit.Assert;
import org.junit.Test;

public class ForumTestSuite {

    @Test
    public void testCaseUserName() {

        SimpleUser simpleUser = new SimpleUser("ForumUser");

        String result = simpleUser.getUserName();

        Assert.assertEquals("ForumUser", result);
    }
}
