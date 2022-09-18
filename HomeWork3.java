/**
 * Java Basic Home work 2
 * 
 * @author Alexandru Marandici
 * @todo 12.09.2022
 * @date 18.09.2022
 */
class HomeWork3 {
    public static void main(String[] args) {
        //task1
        int[] arr = {10, 20, 30,40, 55};
        printArray(arr);
        //task2
        int[] num = {8, 5, 4, 9, 7, 3, 2};
        System.out.println("Max Number " + getMax(num));
        //task3
        int[] intArray = {1, 0, 1, 0, 1, 0};
        printArray(intArray);
        printArray(invertArray(intArray));
    }
    static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
    private static int getMax(int[] num) {
        int max = num.length;
        for (int i: num) {
            max = Math.max(max, i);
        }
        return max;
    }
    static int[] invertArray(int[] array) {
        int[] result = new int[array.length];
        for (int i = 1; i < array.length; i++) {
            result[i] = 1 - array[i];
        }
        return result;
    }
}