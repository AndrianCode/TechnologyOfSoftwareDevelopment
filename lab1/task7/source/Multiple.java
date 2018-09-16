import java.util.Arrays;
import java.io.*;

public class Multiple {
    public static void main(String[] args) {
        System.out.println("Enter values of array in line: ");
        int[] array = initArray();

        if (array != null) {
            System.out.println("Entered array: " + Arrays.toString(array));

            System.out.println(findModNumbers(array, 5));
            System.out.println(findModNumbers(array, 10));

        } else
            System.out.println("ERROR: Array is empty");
    }

    private static String findModNumbers(int[] sourceNumbers, int divider) {
        if (sourceNumbers == null) return "Invalid array!";

        String info = "Numbers which are divisible by " + divider + ": ";
        String data = "";

        for (int sourceNumber : sourceNumbers) {
            if (sourceNumber % divider == 0) {
                data += sourceNumber + " ";
            }
        }
        if (data.length() == 0) data += "none";
        return info + data;
    }

    private static int[] initArray() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String lines = br.readLine();

            if (lines.length() == 0) return null;

            String[] strs = lines.trim().split("\\s+");

            int[] arr = new int[strs.length];
            for (int i = 0; i < strs.length; i++) {
                arr[i] = Integer.parseInt(strs[i]);
            }
            return arr;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
