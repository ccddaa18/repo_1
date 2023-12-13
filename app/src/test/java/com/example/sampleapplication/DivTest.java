package com.example.sampleapplication;

import junit.framework.TestCase;

public class DivTest extends TestCase{

    public void testCalc(){
        Div div=new Div();
        int result= div.calc(8,2);
        int expected=4;
        assertEquals(expected,result);
    }
}