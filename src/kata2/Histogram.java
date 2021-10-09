package kata2;
import java.util.*;
/**
 *
 * @author danie
 */
public class Histogram {
    
    private final int [] data;
    
    public Histogram(int[] data) {
        this.data = data;
    }
    
    public int[] getData() {
        return data;
    }
    
    public Map<Integer,Integer> getHistogram () {
        Map <Integer,Integer> histogram = new HashMap<>();
        for (int k : data) {
            if (histogram.containsKey(k)) {
                histogram.put(k, histogram.get(k)+1);
            } else {
                histogram.put(k,1);
            }
        }
        return histogram;
    }
}
