package ru.itsjava.iostreams;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class IOStreamsPracticeHW {

    public static void main(String[] args) {
        File file1 = new File("src/main/resources/file1.txt");
        try (PrintWriter printWriter = new PrintWriter(file1)) {
            printWriter.println("Строка1_файл1");
            printWriter.println("Строка2_файл1");
            printWriter.println("Строка3_файл1");
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }

        File file2 = new File("src/main/resources/file2.txt");
        try (PrintWriter printWriter = new PrintWriter(file2)) {
            printWriter.println("Строка1_файл2");
            printWriter.println("Строка2_файл2");
            printWriter.println("Строка3_файл2");
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }

        List<String> file1List = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(file1))) {
            String input;
            while ((input = reader.readLine()) != null) {
                file1List.add(input);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("file1List = " + file1List);

        List<String> file2List = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(file2))) {
            String input;
            while ((input = reader.readLine()) != null) {
                file2List.add(input);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("file2List = " + file2List);

        try (PrintWriter printWriter = new PrintWriter(file1)) {
            for (String s : file2List) {
                printWriter.println(s);
            }
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }

        try (PrintWriter printWriter = new PrintWriter(file2)) {
            for (String s : file1List) {
                printWriter.println(s);
            }
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }


    }
}
