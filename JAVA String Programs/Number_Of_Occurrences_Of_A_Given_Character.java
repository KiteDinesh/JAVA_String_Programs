package com.JAVA;
import java.util.Scanner;

public class Number_Of_Occurrences_Of_A_Given_Character {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = scan.nextLine();
        System.out.println("Enter the character: ");
        String character = scan.nextLine();

        int count = str.length() - str.replace(character,"").length();

        System.out.println(count);
    }
}
