package com.example.mhmdreza_j.mobile_p1;

import java.util.ArrayList;

public class NotificationCenter {
    public static final int DATA_LOADED = 1;
    public interface NotificationListener{
        void onDataReceived(ArrayList<Integer> data);
    }

    private static ArrayList<NotificationListener> registeredList = new ArrayList<>();
    public static void register(NotificationListener listener, int type) {
        if (type == DATA_LOADED) {
            registeredList.add(listener);

        }
    }

    public static void unregister(NotificationListener listener, int type){
        if (type == DATA_LOADED){
            registeredList.remove(listener);
        }
    }

}
