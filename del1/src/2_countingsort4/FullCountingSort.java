/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fullcountingsort;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/**
 *
 * @author filip
 */
public class FullCountingSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        // TODO code application logic here
         BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        StringBuffer[] array = new StringBuffer[100];
        
        for(int i = 0; i < 100; i++) {
            array[i] = new StringBuffer();
        }
        
        for(int i = 0; i < n; i++) {
            String[] line = in.readLine().split(" ");
            int v = Integer.parseInt(line[0]);
            String s = line[1];
            array[v].append(i < n / 2 ? "-" : s).append(" ");
        }
        
        for(int i = 0; i < 100; i++) {
            System.out.print(array[i]);
        }
        
        System.out.println();
    }
    
}
