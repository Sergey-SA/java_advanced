import java.util.Scanner;

public class Base {

    public static void main(String[] args) throws Exception {
        int choice = 0;
        float num1 = 0;
        float num2 = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберети код операции:\n1 - сумма\n2 - разность\n3 - умножение\n4 - деление");

        try{
            choice = scanner.nextInt();
        }catch (Exception e){
            throw new Exception("Введено неверное значение выбора операции");
        }

        System.out.println("Введите первое число:");
        try{
            num1 = scanner.nextFloat();
        }catch (Exception e){
            throw new Exception("Введено неверное значение для 1-го числа");
        }

        System.out.println("Введите второе число:");
        try{
            num2 = scanner.nextFloat();
        }catch (Exception e){
            throw new Exception("Введено неверное значение для 2-го числа");
        }

        Сalculator calc = new Сalculator(num1, num2);
        calc.operationChoice(choice);

        scanner.close();
    }
}
