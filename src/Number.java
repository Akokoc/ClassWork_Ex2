import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Number {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(8);
        arr.add(1);
        arr.add(3);
        System.out.println(maxOccurenceNumber(arr));

    }

    public static int maxOccurenceNumber(List<Integer> number) {
        Map<Integer, Integer> map = new TreeMap<>();
        for (Integer s : number) {
            int count = map.getOrDefault(s, 0);
            map.put(s, count + 1);
        }
        int key = 0;
        int res = 0;
        for (Map.Entry<Integer, Integer> s : map.entrySet()) {
            if (res < s.getValue()) {
                res = s.getValue();
                key = s.getKey();
            }

        }
        return key;
    }
}
