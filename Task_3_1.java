import java.util.Scanner;
import java.util.Random;

public class Task_3_1 {

    public static void main(String[] args) {

        int[] arrText = new int[20];

        Random r = new Random();

        int maxNegInt = -11;
        int minPosInt = 11;

        // Заполнение массива случайными числами от -10 до 10
        for(int i = 0; i < arrText.length; i++) {
            arrText[i] = r.nextInt(21) - 10;
        }

        for(int i = 0; i < arrText.length; i++) {

            // поиск максимального отрицательного числа
            if (maxNegInt < arrText[i] && arrText[i] < 0) {
                maxNegInt = arrText[i];
            }

            // поиск минимального положительного числа
            if (minPosInt > arrText[i] && arrText[i] > 0) {
                minPosInt = arrText[i];
            }
        }

        // меняем местами найденные мин и макс числа
        for(int i = 0; i < arrText.length; i++) {
            if (maxNegInt == arrText[i]) {
                arrText[i] = minPosInt;
            }
            else if (minPosInt == arrText[i]) {
                arrText[i] = maxNegInt;
            }
        }

    }
}
