/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata2;
import java.util.*;
/**
 *
 * @author danie
 */
public class Kata2 {
    
    public static void main (String [] args) {
        
        //Map<Integer, Integer> map = new HashMap<Integer,Integer>();
        
        int [] data = new int [15];
        data[0] = 1;
        data[1] = 2;
        data[2] = -4;
        data[3] = 100;
        data[4] = 4;
        data[5] = 5;
        data[6] = 6;
        data[7] = 8;
        data[8] = 2;
        data[9] = -4;
        data[10] = -4;
        data[11] = 2;
        data[12] = 100;
        data[13] = 1;
        data[14] = 1;
        
        Map<Integer,Integer> histogram = new HashMap<Integer,Integer>();
        for (int i = 0; i < data.length; i++) {
            if (histogram.containsKey(data[i])) {
                histogram.put(data[i], histogram.get(data[i])+1);
            } else {
                histogram.put(data[i],1);
            }
        }
        for (Integer key : histogram.keySet()) {
            System.out.println(key + "==>" + histogram.get(key));
        }
    }
}
