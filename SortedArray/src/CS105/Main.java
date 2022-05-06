package CS105;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

//        int[] myInteger = getIntegers(5);
//        int[] sortedIntegers = sortIntegers(myInteger);
//        printArray(sortedIntegers);
        getIntegers(5);

    }

    public static int[] getIntegers(int capacity) {
        int[] array = new int[capacity];
        System.out.println("Please enter " + capacity + " integers:");
        for(int i = 0; i < capacity; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array) {
        for(int i = 0; i < array.length; i++){
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {
        int[] sortedArray = Arrays.copyOf(array, array.length);
            int tempValue;
            boolean flag = true;
            while (flag) {
                flag = false;
                for (int i = 0; i < sortedArray.length-1; i++) {
                    if (sortedArray[i] < sortedArray[i+1]) {
                        tempValue = sortedArray[i];
                        sortedArray[i] = sortedArray[i+1];
                        sortedArray[i+1] = tempValue;
                        flag = true;
                    }
                }
            }
            return sortedArray;
    }
}
