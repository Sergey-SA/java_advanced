import java.util.Scanner;
import java.util.Random;

public class Task_3_1 {

    public static void main(String[] args) {

        int[] arrText = new int[20];

        Random r = new Random();
        int indexDevMax = -1;
        int indexPlusMin = -1;
        int maxDevInt = -11;
        int minPlusInt = 11;

        for(int i = 0; i < arrText.length; i++) {
            arrText[i] = r.nextInt(21) - 10;
        }

        for(int i = 0; i < arrText.length; i++) {
            if (maxDevInt < arrText[i] && arrText[i] < 0) {
                maxDevInt = arrText[i];
                indexDevMax = i;
            }

            if (minPlusInt > arrText[i] && arrText[i] > 0) {
                minPlusInt = arrText[i];
                indexPlusMin = i;
            }
        }

        arrText[indexDevMax] = minPlusInt;
        arrText[indexPlusMin] = maxDevInt;

    }
}
