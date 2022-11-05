package com.java;
import java.util.Scanner;

public class LexicographicalSubstring {

    public static String getSmallestAndLargest(String s, int k) {
        String currString = s.substring(0, k);
        String smallest = currString;
        String largest = currString;
        
        for(int i=k; i<s.length(); i++){
            currString = currString.substring(1, k) + s.charAt(i);
            if(smallest.compareTo(currString) > 0)
                smallest = currString;
            if(largest.compareTo(currString) < 0)
                largest = currString;
        }
        
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}