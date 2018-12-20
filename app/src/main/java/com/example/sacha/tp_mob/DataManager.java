package com.example.sacha.tp_mob;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sacha on 12/12/2018.
 */

public class DataManager {
    private static DataManager INSTANCE;
    private List<String> name_list;

    private DataManager() {
        name_list = new ArrayList<>();
    }

    public static DataManager getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new DataManager();
        }
        return INSTANCE;
    }

    public List<String> getName_list() {
        return name_list;
    }

    public void addName(String n) {
        name_list.add(n);
    }
}

