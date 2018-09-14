import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Multiple {
    public static void main(String[] args) {
        int[] array = initArray();

        System.out.println("Entered array: " + Arrays.toString(array));

        findModNumbers(array, 5);
        findModNumbers(array, 10);
    }

    private static void findModNumbers(int[] sourceNumbers, int divider) {
        if (sourceNumbers == null) {
            System.out.println("Invalid array!");
            return;
        }

        System.out.print("Numbers which are divisible by " + divider + ": ");

        for (int sourceNumber : sourceNumbers) {
            if (sourceNumber % divider == 0) {
                System.out.print(sourceNumber + " ");
            }
        }
        System.out.println();
    }

    private static int[] initArray() {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter length of array: ");
            int length = sc.nextInt();
            if (length <= 0) {
                System.out.println("Invalid length of array!");
                return null;
            }

            int[] array = new int[length];
            for (int i = 0; i < length; i++) {
                array[i] = sc.nextInt();
            }

            return array;
        } catch (InputMismatchException e) {
            System.out.println("Input error: can not convert string to numeric format!");
            return null;
        }
    }

}
