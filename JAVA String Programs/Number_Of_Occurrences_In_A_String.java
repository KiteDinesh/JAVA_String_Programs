package com.JAVA;
import java.util.HashMap;
import java.util.Scanner;

public class Number_Of_Occurrences_In_A_String {
    public static void main(String  args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = scan.nextLine();
        String[] words = str.split(" ");

        HashMap<String ,Integer> map = new HashMap<>();
        for (int i=0;i<words.length;i++){
            if (map.containsKey(words[i].toLowerCase())){
                int count = map.get(words[i].toLowerCase());
                map.put(words[i].toLowerCase(),count+1);
            }else {
                map.put(words[i].toLowerCase(),1);
            }
        }
        System.out.println(map);
    }
}
