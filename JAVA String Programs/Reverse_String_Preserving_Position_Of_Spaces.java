package com.JAVA;
import java.util.Scanner;

public class Reverse_String_Preserving_Position_Of_Spaces {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String InputString = scan.nextLine();

        char[] InputCharString = InputString.toCharArray();
        char[] ResultCharString = new char[InputCharString.length];

        for (int i=0;i<InputCharString.length;i++){
            if (InputCharString[i] == ' '){
                ResultCharString[i] = InputCharString[i];
            }
        }
        int j= InputCharString.length-1;
        for (int i=0;i<InputCharString.length;i++){
            if (InputCharString[i] != ' '){
                if (ResultCharString[j] == ' '){
                    j--;
                }
                ResultCharString[j] = InputCharString[i];
                j--;
            }
        }
        System.out.println(ResultCharString);
    }
}
