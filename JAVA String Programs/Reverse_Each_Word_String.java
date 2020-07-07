package com.JAVA;
import java.util.Scanner;

public class Reverse_Each_Word_String {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = scan.nextLine();
        String[] words= str.split(" ");
        for (int i=words.length-1;i>=0;i--){
            for (int j=words[i].length()-1;j>=0;j--){
                System.out.print(words[i].charAt(j));
            }
            System.out.println();
        }
    }
}
