/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 David Beers
 */

/*
*   print a user prompt for a quote
*   store the quote
    print a user prompt for an attribution
    store the attribution
    print an output that concatenates the attribution and quote
    the quote in the output will be wrapped in \" to escape the quotation marks*/

import java.util.Scanner;

public class Solution03 {
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        System.out.println("Input a quote");
        String quote = input.nextLine();
        System.out.println("Who said that quote?");
        String attribution = input.nextLine();
        System.out.println(attribution + " says: \"" + quote + "\"");
        input.close();
    }
}
