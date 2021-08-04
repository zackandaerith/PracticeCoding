/*
 * Copyright (c) 2021. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 * @Zheng
 */

import java.util.HashMap;
import java.util.Map;


/**
 * @author Zheng
 */

public class Location {
    private final int locationID;
    private final String description;
    private final Map<String, Integer> exits;

    public Location(int locationID, String description , Map<String,Integer> exits) {
        this.locationID = locationID;
        this.description = description;
//        this.exits = new HashMap<String, Integer>();
        if (exits != null) {
            this.exits = new HashMap<String, Integer>(exits);
        }else{
            this.exits = new HashMap<String , Integer>();
        }
        this.exits.put("Q", 0);
    }


//    public void addExit(String direction, int location){
//        exits.put(direction, location);
//
//
//    }

    public int getLocationID() {
        return locationID;
    }

    public String getDescription() {
        return description;
    }

    public Map<String, Integer> getExits() {
        return new HashMap<String, Integer>(exits);
    }
}
