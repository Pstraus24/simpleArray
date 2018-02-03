// Create an array that lists type of supplies for a simple hot dog stand, ice cream shop, coffee shop or something similar.
// Use a for loop to print the contents of the array on the screen. You will use this as the start of the next program
// You need at least 5 items in your array.

package com.company;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String supplyArray[] = {"Rods","Reels","Lures","Hooks","Sinkers"};
        Arrays.sort(supplyArray);
        for (String supplies : supplyArray) {
            System.out.println(supplies);
        }

    }

}
