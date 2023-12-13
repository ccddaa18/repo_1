package com.example.sampleapplication;

import junit.framework.TestCase;

public class SubTest extends TestCase{

    public void testCalc(){
        Sub sub=new Sub();
        int result=sub.calc(10,2);
        int expected=8;
        assertEquals(expected,result);
    }
}