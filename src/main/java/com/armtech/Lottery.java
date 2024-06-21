package com.armtech;

import java.util.Arrays;
import java.util.Scanner;

public class Lottery {
    public static void main(String[] args) {

        // From Core Java: Fundamentals, Volume 1. ISBN-13 978-0137673629
        // 3.10.6 Array Sorting

        Scanner input = new Scanner(System.in);

        System.out.print("How many numbers are on the card? ");
        int totalCard = input.nextInt();

        System.out.print("How many picks do you need to make? ");
        int totalPicks = input.nextInt();

        // fill an array with card numbers
        int[] card = new int[totalCard];
        for (int i = 0; i < card.length; i++)
            card[i] = i + 1;

        // draw the picks card
        int[] yourPicks = new int[totalPicks];
        for (int i = 0; i < yourPicks.length; i++) {
            // make a random index between 0 and totalCard - 1
            int index = (int) (Math.random() * totalCard);

            // pick the element at the random location
            yourPicks[i] = card[index];

            // move the last element into the random location and remove it
            card[index] = card[totalCard - 1];
            totalCard--;
        }

        // print the picks array
        Arrays.sort(yourPicks);
        System.out.print("Your bet is: ");
        for (int i = 0; i < (yourPicks.length - 1); i++) {
            System.out.print(yourPicks[i] + ", ");
        }
        System.out.print(yourPicks[yourPicks.length - 1] + ".");
    }
}