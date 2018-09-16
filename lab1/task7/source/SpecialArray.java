import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SpecialArray {
    private int[] data;


    public boolean isNull() {
        return data == null;
    }

    public void initArray() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String lines = br.readLine();

        if (lines.length() != 0) {
            String[] strs = lines.trim().split("\\s+");
            data = new int[strs.length];
            for (int i = 0; i < strs.length; i++) {
                data[i] = Integer.parseInt(strs[i]);
            }
        }
    }

    public String findModNumbers(int divider) {
        if (data == null) return "Invalid array!";

        String info = "Numbers which are divisible by " + divider + ": ";
        String result = "";

        for (int sourceNumber : data) {
            if (sourceNumber % divider == 0) {
                result += sourceNumber + " ";
            }
        }
        if (result.length() == 0) result += "none";
        return info + result;
    }

    @Override
    public String toString() {
        return Arrays.toString(data);
    }
}
