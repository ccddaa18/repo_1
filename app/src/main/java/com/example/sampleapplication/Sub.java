package com.example.sampleapplication;

import android.util.Log;

public class Sub{

    public int calc(int x,int y){
        return (x>=y?(x-y):(y-x));
    }

    private void doNothing(){
        Log.i("Sub","it's nothing");
    }
}