package com.mycompany.softwareengineeringassignment1;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class UsernameTest
{
    @Test
    public void UsernameTest()
    {
        String a = "John";
        String b = "21";
        
        String expected = "John21";
        String result = Student.getUsername(a, b);
        
        assertEquals(expected, result);  
    }
}