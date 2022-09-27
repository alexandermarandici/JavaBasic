import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
/**
 * Java Basic Home work 4
 *
 * @author Alexandru Marandici
 * @todo 26.09.2022
 * @date 27.09.2022
 */
public class HomeWork7 {
    public static void main(String[] args) {
        int[] arr = generateArray(500000);
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int found = Arrays.binarySearch(arr, 5);
        System.out.println(found +": " +arr[found]);
        Map<Integer, String> daysMap = new HashMap<>();
        daysMap.put(15, "Monday");
        daysMap.put(10, "Friday");
        System.out.println(daysMap.get(15));
        System.out.println(daysMap.get(10));
    }

    private static int[] generateArray(int length) {
        int[] result = new int[500000];
        for (int i = 0; i < result.length; i++) {
            result[i] = (int) (Math.random() * 20);
        }
        return result;

    }
}
