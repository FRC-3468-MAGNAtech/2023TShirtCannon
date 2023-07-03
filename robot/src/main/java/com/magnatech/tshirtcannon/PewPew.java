package com.magnatech.tshirtcannon;
import java.util.concurrent.TimeUnit;

public class PewPew {
    private final int sol = 2;
    private boolean release = false;

    public void shoot(){
        release = true;
        try {
            TimeUnit.MILLISECONDS.sleep(10);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        release = false;
    }
}
