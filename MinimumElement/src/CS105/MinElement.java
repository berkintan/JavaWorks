package CS105;

import java.util.Scanner;

public class MinElement {

    private static Scanner scanner = new Scanner(System.in);

    public static int readInteger() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
        }

    public static int[] readElements(int values) {
        Scanner scanner = new Scanner(System.in);
        int[] elements = new int[values];
        for(int i = 0; i <= elements.length; i++) {
            System.out.println("Enter a value");
            int enteredNumber = scanner.nextInt();
            scanner.nextLine();
            elements[i] = enteredNumber;
        }
        return elements;
    }



}
