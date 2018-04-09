/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package davisstaircase;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 *
 * @author filip
 */
public class DavisStairCase {

    
     public static int countPaths1(int steps){
        if(steps < 0){
            return 0;
        }
        else if(steps == 0){
            return 1;
        }
        return countPaths1(steps -1) + countPaths1(steps -2) + countPaths1(steps - 3);
    }
    
    public static int countPathsMemo(int steps){
        return countPathsMemo(steps, new int[steps + 1]);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
