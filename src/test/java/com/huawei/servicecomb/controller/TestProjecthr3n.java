package com.huawei.servicecomb.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestProjecthr3n {

        Projecthr3nDelegate projecthr3nDelegate = new Projecthr3nDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = projecthr3nDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}