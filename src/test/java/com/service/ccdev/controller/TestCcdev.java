package com.service.ccdev.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestCcdev {

        CcdevDelegate ccdevDelegate = new CcdevDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = ccdevDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}