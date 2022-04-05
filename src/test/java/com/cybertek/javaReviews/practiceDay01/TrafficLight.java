package com.cybertek.javaReviews.practiceDay01;

public class TrafficLight {   // my blueprint for all traffic lights

   private String color;

    public void showColor () {
        System.out.println("color = " + color);
    }

    // local time of each light should be shared by all traffic lights

    public static String localTime;

    public void changeColor (String newColor){
        if(newColor.equalsIgnoreCase("red")||newColor.equalsIgnoreCase("yellow")||
                newColor.equalsIgnoreCase("green")) {
            System.out.println("changing the color to "+newColor);
            color=newColor;
        }else {
            System.err.println("Error: invalid color"+newColor);
        }
        }
    }


