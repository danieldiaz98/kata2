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
        
        String[] data = {"Rosa", "Pepe", "María", "Pepe", "Pepe", "Rosa"};
        
        Histogram histo = new Histogram(data);
        Map<String,Integer> histogr = histo.getHistogram();

        for (String key : histogr.keySet()) {
            System.out.println(key + "==>" + histogr.get(key));
        }
    }
}
