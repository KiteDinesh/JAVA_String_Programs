package com.JAVA;
import java.util.Scanner;

public class Reverse_String {
    public static void main(String  args[]){
        Scanner scan = new Scanner(System.in);
        String ReverseString = "",OriginalString;
        System.out.println("Enter the string: ");
        OriginalString = scan.nextLine();

        for (int i=OriginalString.length()-1;i>=0;i--){
            ReverseString = ReverseString+OriginalString.charAt(i);
        }
        System.out.println("The Original String is: "+OriginalString);
        System.out.println("The Reverse String is: "+ReverseString);


    }
}
