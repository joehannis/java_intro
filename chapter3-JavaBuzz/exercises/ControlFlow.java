import java.util.Scanner;

public class ControlFlow {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner scanner = new Scanner(System.in);
        Integer number = Integer.parseInt(scanner.nextLine());
        
        String result = (number % 2 == 0) ? "This number is even" : "This number is odd";
        System.out.println(result);
    }
}

