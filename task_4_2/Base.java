import java.util.Scanner;

public class Base {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        float result;

        System.out.println("Выберети код операции:\n1 - сумма\n2 - разность\n3 - умножение\n4 - деление");
        int choice = scanner.nextInt();

        System.out.println("Введите первое число:");
        float num1 = scanner.nextFloat();
        System.out.println("Введите второе число:");
        float num2 = scanner.nextFloat();

        Сalculator calc = new Сalculator(num1, num2);

        switch (choice){
            case 1:
                result = calc.operationSum();
                System.out.println("Сумма чисел " + num1 + " и " + num2 + " = " + result);
                break;
            case 2:
                result = calc.operationDif();
                System.out.println("Разность чисел " + num1 + " и " + num2 + " = " + result);
                break;
            case 3:
                result = calc.operationMult();
                System.out.println("Произведение чисел " + num1 + " и " + num2 + " = " + result);
                break;
            case 4:
                try {
                    result = calc.operationDiv();
                    System.out.println("Частное чисел " + num1 + " и " + num2 + " = " + result);
                    break;
                }catch (Exception e){
                    e.printStackTrace();
                }
            default:
                System.out.println("Неверно выбран код операции");
                break;

        }

        scanner.close();
    }
}
