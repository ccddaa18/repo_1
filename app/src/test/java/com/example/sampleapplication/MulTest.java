package com.example.sampleapplication;

import junit.framework.TestCase;

public class MulTest extends TestCase{

    public void testCalc(){
        Mul mul=new Mul();
        int result= mul.calc(2,4);
        int expected=8;
        assertEquals(expected,result);
    }
}