package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random ranGen = new Random();
        HashMap sideTally = new HashMap();

        System.out.println("How many sides does your dice have?");
        int sides = input.nextInt();
        System.out.println("How many times do you want the dice to roll?");
        int amtRolls = input.nextInt();

        for (int i = 1; i < (sides + 1); i++) {
            sideTally.put(i, 0);
        }

        for (int i = 0; i < amtRolls; i++) {
            int ranNum = ranGen.nextInt(sides) + 1;
            sideTally.put(ranNum, ((int) sideTally.get(ranNum) + 1));
        }
        System.out.println(sideTally);
    }
}
