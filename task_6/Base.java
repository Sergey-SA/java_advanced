import staff.MyDif;
import staff.MyDiv;
import staff.MyMult;
import staff.MySum;

import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class Base {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберети код операции:\n1 - сумма\n2 - разность\n3 - умножение\n4 - деление");
        int choice = scanner.nextInt();

        System.out.println("Введите первое число:");
        float num1 = scanner.nextFloat();
        System.out.println("Введите второе число:");
        float num2 = scanner.nextFloat();

        switch (choice){
            case 1:
                MySum mySum = new MySum(num1, num2);
                mySum.operation(num1, num2);
                System.out.println(mySum.toString());
                break;
            case 2:
                MyDif myDif = new MyDif(num1, num2);
                myDif.operation(num1, num2);
                System.out.println(myDif.toString());
                break;
            case 3:
                MyMult myMult = new MyMult(num1, num2);
                myMult.operation(num1, num2);
                System.out.println(myMult.toString());
                break;
            case 4:
                MyDiv myDiv = new MyDiv(num1, num2);
                try{
                    myDiv.operation(num1, num2);
                }catch (Exception e) {
                    e.printStackTrace();
                }
                System.out.println(myDiv.toString());
                break;
            default:
                System.out.println("Неверно выбран код операции");
                break;

        }

        scanner.close();
    }
}
