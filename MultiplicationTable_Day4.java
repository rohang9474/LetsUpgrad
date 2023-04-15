import java.util.Scanner;

public class MultiplicationTable_Day4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        // loop through 1 to 10
        for (int i = 1; i <= 10; i++) {
            // multiply the number by i
            int result = num * i;
            // print the result in the format "num x i = result"
           System.out.printf("%d x %d = %d%n", num, i, result);
          
        }
    }
}
