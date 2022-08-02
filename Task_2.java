import java.util.Scanner;

public class Task_2 {

    public static void main(String[] args) {

        System.out.println("Введите код операции: 1 - запуск калькулятора, 2 - поиск максимального слова");

        Scanner scanner = new Scanner(System.in);

        int choice = scanner.nextInt();

        if (choice == 1) {

            System.out.println("Введите операцию: '1' - сложение, '2' - вычитание, '3' - умножение, '4' - деление");
            int choiceOper = scanner.nextInt();
            System.out.println("Введите 1-ое число");
            float num1 = scanner.nextFloat();
            System.out.println("Введите 2-ое число");
            float num2 = scanner.nextFloat();

            switch (choiceOper) {
                case 1:
                    System.out.println("Сумма = " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Разница = " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("Произведение = " + (num1 * num2));
                    break;
                case 4:
                    if (num2 == 0) {
                        System.out.println("Делитель не может быть равен 0");
                    } else {
                        System.out.println("Частное = " + (num1 / num2));
                    }
                    break;
                default:
                    System.out.println("Неправильно выбрана операция");

            }

        } else if (choice == 2) {
            String maxText = "";

            System.out.println("Укажите размерность массива");
            int arrSize = scanner.nextInt() + 1;
            String arrText[] = new String[arrSize];

            System.out.println("Введите значения в массив");
            for(int i = 0; i < arrSize; i++) {
                arrText[i] = scanner.nextLine();
                if (arrText[i].length() > maxText.length()){
                    maxText = arrText[i];
                }
            }

            System.out.println("Самое длинное слово = " + maxText);

        } else {
            System.out.println("Неправильно выбран код операция");
        }

        scanner.close();
    }
}
