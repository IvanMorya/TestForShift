package MergSort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sortMode = null;
        String dataType = null;
        String outFileName = null;
        String allFileName = null;
        String inFileName1 = null;
        String inFileName2 = null;

        try {
            System.out.println(" Установите режим сортировки (-a или -d), необязательный, по умолчанию сортируем по возрастанию");
            sortMode = reader.readLine();
            System.out.println("тип данных (-s или -i), обязательный");
            dataType = reader.readLine();
            System.out.println("Укажите имя выходного файла, обязательное.");
            outFileName = reader.readLine();
            System.out.println("Укажите имена входных файлов, не менее одного.");
            allFileName = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }



        int[] arr1 = {0, 3, 5};
        int[] arr2 = {1, 2, 4, 8};
        int[] arrResult = new int[arr2.length + arr1.length];

        arrResult = MergeSort.mergeDescending(arr1, arr2);
        for (int a : arrResult) {
            System.out.print(a + ", ");
        }
    }
}
