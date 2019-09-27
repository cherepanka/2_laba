package Laba;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static String filePath;
    public static void main(String[] args) {

        public int[][] getArrayFromFile (String filePath){
            Scanner scannMatrix = null;
            ArrayList<ArrayList> Matrix = new ArrayList<ArrayList>();
            //Чтение файла и запись в сканер
            try {
                scannMatrix = new Scanner(new File(filePath));
            } catch (FileNotFoundException e) {
                JOptionPane.showMessageDialog(null, "Файл не найден");
            }
            //Запись данных из сканера в двумерный ArrayList
            while (scannMatrix.hasNextLine()) {
                Scanner scanLine = new Scanner(scannMatrix.nextLine());
                ArrayList<Integer> line = new ArrayList<Integer>();
                while (scanLine.hasNext()) {
                    line.add(Integer.parseInt(scanLine.next()));
                }
                Matrix.add(line);
            }
            //Определение размера и инициализация массива
            int arrWidth = Matrix.size();
            int arrLength = Matrix.get(0).size();
            int[][] array = new int[arrWidth][arrLength];
            for (int y = 0; y < Matrix.size(); y++) {
                for (int x = 0; x < Matrix.get(y).size(); x++) {
                    array[y][x] = (int) Matrix.get(y).get(x);
                }
            }
            return array;

        }
    }
}