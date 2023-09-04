import java.util.Arrays;
import java.util.ArrayList;

public class ArraysExample {
    public static void main(String[] args) {
        String[] strings = {"here", "is", "a", "string"};
        System.out.println(Arrays.toString(strings));
        printIntegers();
        printArrayList();
    }

    public static void printIntegers() {
        Integer[] numbers = {1, 2, 3, 4};
        System.out.println(Arrays.toString(numbers));
    }

    public static void printArrayList() {
      ArrayList<String> cars = new ArrayList<String>();
      cars.add("Volvo");
      cars.add("BMW");
      cars.add("Ford");
      cars.add("Mazda");
      System.out.println(cars);
    }
}
