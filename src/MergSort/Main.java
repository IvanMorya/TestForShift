package MergSort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Scanner scanner = new Scanner(reader);
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
            while (scanner.hasNextLine()) {
                allFileName = reader.readLine() + "&";
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            scanner.close();
            reader.close();
        }


    }
}
