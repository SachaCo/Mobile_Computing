package com.example.sacha.tp_mob;

/**
 * Created by Sacha on 12/12/2018.
 */

public class DataManager {
    private static DataManager INSTANCE;

    private String name;

    private DataManager(){
    }

    public static DataManager getInstance(){
        if (INSTANCE == null){
            INSTANCE = new DataManager();
        }
        return INSTANCE;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

