package kata2;
import java.util.*;
/**
 *
 * @author danie
 */
public class Histogram<T> {
    
    private final T [] data;
    
    public Histogram(T [] data) {
        this.data = data;
    }
    
    public T [] getData() {
        return data;
    }
    
    public Map<T,Integer> getHistogram () {
        Map <T,Integer> histogram = new HashMap<>();
        for (T k : data) {
            if (histogram.containsKey(k)) {
                histogram.put(k, histogram.get(k)+1);
            } else {
                histogram.put(k,1);
            }
        }
        return histogram;
    }
}
