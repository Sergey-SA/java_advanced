import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.*;

public class Base {

    public static void main(String[] args) {
        SortedSet<String> set = new TreeSet();
        ArrayList<Integer> arrCount = new ArrayList();
        ArrayList<String> arrName = new ArrayList();

                try {
                    // Считываем строчку из файла
                    File file = new File(".\\task_5\\src\\main\\java\\text");
                    FileReader fr = new FileReader(file);
                    BufferedReader reader = new BufferedReader(fr);
                    String line = reader.readLine().replaceAll("\\s+", " ");

                    //Разделяем строчку на слова по пробелу и записываем в массив
                    String[] arr = line.split(" ");

                    //Сортируем массив по возрастанию
                    Arrays.sort(arr);

                    // Создаем Список уникальных значений из массива и записываем их в arrName
                    for (String s : arr) {
                        set.add(s);
                    }
                    for (String s : set) {
                        arrName.add(s);
                    }

                    System.out.println("Список уникальных значений и их количество:");
                    // Считаем и выводим в консоль сколько раз встречается уникальное слово в массиве
                    for (String s : set) {
                        int count = 0;
                        for(int i = 0; i < arr.length; i++){
                            if (s.equals(arr[i])){
                                count++;
                            }
                        }
                        // Записываем в массив arrCount количество повторений для каждого уникального слова
                        arrCount.add(count);
                        System.out.println(s + " = " + count);
                    }
                    // Находим максимальное значение повторений
                    int maxLenght = Collections.max(arrCount);

                    System.out.println("");
                    System.out.println("Список слов с максимальным повторением в файле:");
                    //Выводим в консоль слово с максимальным повторением
                    for(int i = 0; i < arrCount.size(); i++) {
                        if (arrCount.get(i) == maxLenght) {
                            System.out.println(arrName.get(i) + " = " + maxLenght);
                        }
                    }

                } catch (Exception e) {
                    e.printStackTrace();
            }
    }
}
