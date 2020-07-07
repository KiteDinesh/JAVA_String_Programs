package com.JAVA;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Duplicate_Characters_In_A_String {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = scan.nextLine();

        HashMap<Character,Integer> map = new HashMap<>();
        Set<Character> CharaccterString = map.keySet();

        char[] words = str.toCharArray();
        for (int i=0;i<words.length;i++){
            if (map.containsKey(words[i])){
                int count = map.get(words[i]);
                map.put(words[i],count+1);
            }else {
                map.put(words[i],1);
            }
        }
        for (char ch:CharaccterString){
            if (map.get(ch)>1){
                System.out.println(ch+" "+map.get(ch));
            }
        }
    }
}
