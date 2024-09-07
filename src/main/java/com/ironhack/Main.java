package com.ironhack;

import com.google.gson.Gson;
import net.datafaker.Faker;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        var activity1 = new Activity("Intro to Kite surf",
                "An intro to kite surfing for newbies",
                3,
                600,
                new BigDecimal("400"));


        var activity2 = new Activity("Intro to Wind surf",
                "An intro to wind surfing for newbies",
                4,
                400,
                new BigDecimal("350"));

        var activity3 = new Activity("Intro to Surf",
                "An intro to Surfing for newbies",
                4,
                300,
                new BigDecimal("100"));

        var activityBoard = new ActivityBoard("PuraVida",
                LocalDate.of(2024, 9, 6),
                "El Medano, Spain",
                List.of(activity1, activity2, activity3));

        System.out.println(activityBoard);

        Faker faker = new Faker();


        var activityBoard2 = new ActivityBoard("Flying " + faker.animal().name(),
                LocalDate.of(2024, 9, 6),
                "El Medano, Spain");

        activityBoard2.addActivity(activity1);

        System.out.println(activityBoard2);


//        for (int i = 0; i < 10; i++) {
//
//            System.out.println("=======");
//            System.out.println(faker.name().fullName());
//            System.out.println("=======");
//        }


        var gson = new Gson();

        String boardAsJson = gson.toJson(activityBoard);
        System.out.println(boardAsJson);


        var newActivityBoardJson = """
                {
                  "shopName": "Surfing Kale",
                  "location": "El Medano, Spain",
                  "activities": [
                    {
                      "name": "Intro to Kite surf",
                      "description": "The best intro to kite surfing for programmers / vegans",
                      "difficultyLevel": 2,
                      "durationInMinutes": 600,
                      "price": 400
                    },
                    {
                      "name": "Intro to Java Surf",
                      "description": "An intro to Surfing for vegans",
                      "difficultyLevel": 3,
                      "durationInMinutes": 300,
                      "price": 100
                    }
                  ]
                }
                """;


        ActivityBoard newActivityBoard = gson.fromJson(
                newActivityBoardJson,
                ActivityBoard.class);

        System.out.println(newActivityBoard.getShopName());
        System.out.println(newActivityBoard);


    }
}