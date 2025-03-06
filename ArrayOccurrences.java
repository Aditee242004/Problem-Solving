import java.util.HashMap;
import java.util.Map;

public class ArrayOccurrences {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 2, 1, 3, 4, 5, 1, 2};
        
        Map<Integer, Integer> occurrences = new HashMap<>();
        
        for (int num : array) {
            occurrences.put(num, occurrences.getOrDefault(num, 0) + 1);
        }
        
        System.out.println("Element Occurrences:");
        System.out.println();
        for (Map.Entry<Integer, Integer> entry : occurrences.entrySet()) {
            System.out.println(entry.getKey() + " occurs " + entry.getValue() + " times");
        }
    }
}
