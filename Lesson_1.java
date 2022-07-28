import java.util.Scanner;

/**
 * Create at 27.07.2022
 * @autor Sherstnev Sergey
 *
 */


public class Lesson_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // input int from console
        float num1 = scanner.nextFloat();
        float num2 = scanner.nextFloat();

        // sum scanner int
        float sum = num1 + num2;

        // print sum
        System.out.printf("%.4f", sum);
    }
}
