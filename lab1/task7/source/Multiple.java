import java.io.IOException;

public class Multiple {
    public static void main(String[] args) {

        SpecialArray array = new SpecialArray();

        System.out.println("Enter values of array in line: ");

        try {
            array.initArray();
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (!array.isNull()) {
            System.out.println("Entered array: " + array.toString());

            System.out.println(array.findModNumbers(5));
            System.out.println(array.findModNumbers(10));

        } else
            System.out.println("ERROR: Array is empty");
    }

}
