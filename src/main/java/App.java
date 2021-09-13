/*
 *  UCF COP3330 Fall 2021 Assignment 8 Solution
 *  Copyright 2021 Gabriel Mousa
 */

import java.util.Scanner;

public class App{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("How many people?");
        int people = Integer.parseInt(input.nextLine());

        System.out.println("How many pizzas do you have?");
        int pizzas = Integer.parseInt(input.nextLine());

        System.out.println("How many slices per pizza?");
        int slices = Integer.parseInt(input.nextLine());

        int slicesp = (pizzas*slices)/people;

        System.out.println(people + " people with " + pizzas + " pizzas (" + slices*pizzas + ")\nEach person gets " + slicesp + " pieces of pizza.\nThere are " + (slices*pizzas)%people + " leftover pieces.");
    }
}