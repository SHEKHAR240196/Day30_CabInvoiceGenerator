package com.bridgelabz;

import java.util.*;

public class RideHistory {

    public Map<String, ArrayList<Ride>> userRides;

    public RideHistory() {
        this.userRides = new HashMap<>();
    }

    public void addRidesForUserID(String userId, Ride[] rides) {
        ArrayList<Ride> userList = this.userRides.get(userId);
        if (userList == null) {
            this.userRides.put(userId, new ArrayList<Ride>(Arrays.asList(rides)));
        } else
            this.userRides.put(userId, userList);
    }

    public Ride[] getRidesHistory(String userId) {
        Ride[] rideArr = new Ride[this.userRides.get(userId).size()];
        return this.userRides.get(userId).toArray(rideArr);

    }
}
