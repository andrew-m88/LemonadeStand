package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int sugar;
        int lemon;
        int cup;
        int days;
        String items;
        double cupcost;
        double lemoncost;
        double sugarcost;
        double totalcost;
        String name;
        Scanner keyboard;

        keyboard = new Scanner(System.in);

        System.out.println("Hello, welcome to the lemonade stand");
        System.out.println("What is your name");
        name = keyboard.nextLine();
        System.out.println("well, nice to meet you " + name);
        System.out.println("How many items do you need today?(Three or Four)");
        items = keyboard.nextLine();
        if (items.equals("three")) {

        }
    }
}
