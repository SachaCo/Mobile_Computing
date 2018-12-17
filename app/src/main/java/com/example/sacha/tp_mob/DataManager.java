package com.example.sacha.tp_mob;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sacha on 12/12/2018.
 */

public class DataManager {
    private static DataManager INSTANCE;
    private List<String> name;

    private DataManager(){
        name = new ArrayList<>();
    }

    public static DataManager getInstance(){
        if (INSTANCE == null){
            INSTANCE = new DataManager();
        }
        return INSTANCE;
    }

    public List<String> getName() {
        return name;
    }

    public void addName(String n){
        name.add(n);
    }
}

