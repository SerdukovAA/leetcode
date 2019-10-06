import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class IntersectionOfThreeSortedArrays {

    public static List<Integer> arraysIntersection(int[] arr1, int[] arr2, int[] arr3) {
        Map<Integer ,Integer> list = new HashMap<>();
        for (int a : arr1) {
            list.put(a, list.getOrDefault(a, 0)+1);
        }
        for (int a : arr2) {
            list.put(a, list.getOrDefault(a, 0)+1);
        }
        for (int a : arr3) {
            list.put(a, list.getOrDefault(a, 0)+1);
        }
        return list.entrySet().stream()
                .filter(e -> e.getValue() == 3)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }
}
