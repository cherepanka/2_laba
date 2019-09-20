package Laba;

import java.io.*;
import java.util.ArrayList;


public class Main {

    String data;
    String filename;
    String c;
    RandomAccessFile fio;
    BufferedReader in;


    public Main() throws UnsupportedEncodingException {
        this.in = new BufferedReader(new InputStreamReader(System.in, "Cp1251"));//создание объекта класса BufferedReader с возможностью ввода данных на русском языке(кодировка "Cp1251")
    }

    public void run() throws IOException {
        while (true) {
            printMenu();//вызов метода вывода меню на экран
            c = in.readLine();//ввод выбранного пункта меню

            if (c.compareTo("1") == 0) {
                text();//вызов метода
            } else if (c.compareTo("2") == 0) {
                return;//выход из программы
            }
        }
    }

    public void printMenu() {//метод вывода меню на экран
        System.out.println("Введите ваш выбор:");
        System.out.println("1.Работа с файлом");
        System.out.println("2.Выход");
    }


    public void text() throws IOException {//метод работы с файлом
        System.out.println("Введите имя файла:");
        filename = in.readLine();//ввод имени файла
        fio = new RandomAccessFile(new File(filename), "r");
        data = fio.readLine();//чтение информации из заданного файла
        fio.close();
        System.out.println("Информация из файла: " + data);//вывод информации из файла
        data = data.replaceAll("\\pP", "");
        ArrayList<String> arrayList = new ArrayList<String>();
        StringBuilder fio = new StringBuilder();
        for (int j = 0; j < arrayList.size() - 1; j++) {
            if (arrayList.get(j).charAt(arrayList.get(j).length() - 1) == arrayList.get(j + 1).charAt(0))
                fio.append(arrayList.get(j)).append(" ");

            System.out.println("Информация из файла: " + fio);
        }
    }


    public static void main(String args[]) throws IOException {

        Main n = new Main();//
        n.run();//вызов метода, работающего с файлом
    }
}