package com.ironhack;

import java.math.BigDecimal;

public class Activity {

    private String name;
    private String description;
    private int difficultyLevel;
    private int durationInMinutes;
    private BigDecimal price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDifficultyLevel() {
        return difficultyLevel;
    }

    public void setDifficultyLevel(int difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Activity(String name, String description, int difficultyLevel, int durationInMinutes, BigDecimal price) {
        this.name = name;
        this.description = description;
        this.difficultyLevel = difficultyLevel;
        this.durationInMinutes = durationInMinutes;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Activity{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", difficultyLevel=" + difficultyLevel +
                ", durationInMinutes=" + durationInMinutes +
                ", price=" + price +
                '}';
    }
}
