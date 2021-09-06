/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Eric Moore
 */
package Solution02;

import java.util.Scanner;

/*
    This is a program that requests a string from the user. The string is then taken and read to read
    the total number of characters from the user's input. The program then prints an output stating the
    total number of characters.
 */
public class application {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("What is the input String? ");
        String x = input.nextLine();



        for (int i = 0; i < x.length(); i++)



        System.out.println(x + " has " + x.length() + " characters ");
    }
}
