package com.ironhack;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ActivityBoard {


    private String shopName;
//    private LocalDate activityDate;
    private String location;
    private List<Activity> activities = new ArrayList<>();


    public List<Activity> addActivity (Activity activity) {
        activities.add(activity);
        return activities;
    }

    public void removeActivityByName(String activityName) {
        for (Activity activity : activities) {
            if (activity.getName().equals(activityName)) {
                activities.remove(activity);
            }
        }
    }



    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

//    public LocalDate getActivityDate() {
//        return activityDate;
//    }
//
//    public void setActivityDate(LocalDate activityDate) {
//        this.activityDate = activityDate;
//    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Activity> getActivities() {
        return activities;
    }

    public void setActivities(List<Activity> activities) {
        this.activities = activities;
    }

    public ActivityBoard(String shopName, LocalDate activityDate, String location) {
        this.shopName = shopName;
//        this.activityDate = activityDate;
        this.location = location;
    }

    public ActivityBoard(String shopName, LocalDate activityDate, String location, List<Activity> activities) {
        this.shopName = shopName;
//        this.activityDate = activityDate;
        this.location = location;
        this.activities = activities;
    }

    @Override
    public String toString() {
        return "ActivityBoard{" +
                "shopName='" + shopName + '\'' +
//                ", activityDate=" + activityDate +
                ", location='" + location + '\'' +
                ", activities=" + activities +
                '}';
    }
}
