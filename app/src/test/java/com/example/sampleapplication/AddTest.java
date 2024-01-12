package com.example.sampleapplication;

import junit.framework.TestCase;

public class AddTest extends TestCase{

    public void testCalc(){
        Add add=new Add();
        int result=add.calc(4,4);
        int expected=8;
        assertEquals(expected,result);
    }
}