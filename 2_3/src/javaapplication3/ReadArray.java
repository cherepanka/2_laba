/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Ольга
 */

   public class ReadArray {

    public int[][] getArrayFromFile(String filePath) {
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
        for (int i = 0; i < Matrix.size(); i++) {
            for (int j = 0; j < Matrix.get(i).size(); j++) {
                array[i][j] = (int) Matrix.get(i).get(j);
            }
        }
        for (int i = 0; i < Matrix.size(); i++) {
            for (int j = i+1; j < Matrix.get(i).size(); j++) {
                int temp = array[i][j];
                array[i][j] = array[j][i];
                array[j][i] = temp;
            }
        }
        for (int i = 0; i <  Matrix.size(); i++) {
            for (int j = 0; j <  Matrix.get(i).size(); j++) {
                System.out.printf("%3d", array[j][i]);
            }
            System.out.println();
        }
    
    return array;
    }
public static void main(String[] args){
        //Проверка работоспособности и вывод на печать
        String filePath = "11.txt";
        ReadArray chartReader = new ReadArray();
        int[][] myArray = chartReader.getArrayFromFile(filePath);
        for(int[] i: myArray){
            for(int j: i){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}