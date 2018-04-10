/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Solution;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 *
 * @author filip
 */
public class Solution {

    
    public static int[] charCount(String first){
         char[] array = first.toCharArray();
         int[] count = new int[26];
        
        for(int i = 0; i < array.length; i++){
            count[array[i]-'a']++;
        }
        
        return count;
    }
    
    static int makingAnagrams(String s1, String s2){
        
       int[] count1 = charCount(s1);
       int[] count2 = charCount(s2);
        
        int difference = 0;
        
        for(int i = 0; i < count1.length; i++){
            difference += Math.abs(count1[i] - count2[i]);
        }
        

        return difference;
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        String s1 = in.next();
        String s2 = in.next();
        int result = makingAnagrams(s1, s2);
        System.out.println(result);
    }
    
}
