package com.JAVA;
import java.util.Scanner;

public class count_The_Number_Of_Words_In_A_String {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = scan.nextLine();
        String[] words = str.split(" ");
        System.out.println(words.length);
    }
}
