import java.util.Scanner;

public class Lesson_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float num1 = scanner.nextFloat();
        float num2 = scanner.nextFloat();

        float sum = num1 + num2;

        System.out.printf("%.4f", sum);
    }
}
