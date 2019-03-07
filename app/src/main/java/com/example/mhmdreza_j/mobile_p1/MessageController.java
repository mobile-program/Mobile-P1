package com.example.mhmdreza_j.mobile_p1;

import java.util.ArrayList;

public class MessageController {
    private ArrayList<Integer> cacheData = new ArrayList<>();

    public void fetch(boolean fromCache){
        ArrayList<Integer> data = new ArrayList<>();
        if (fromCache){

        }else {

        }
        NotificationCenter.announce(data);
    }
}
