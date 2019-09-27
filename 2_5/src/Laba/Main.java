package Laba;

import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
            System.out.println("Введите числа: ");
            Scanner in = new Scanner(System.in);
            String sText = in.nextLine();
            int curCount = 0;
            int maxCount = 0;
            String sMaxNumber = "";
            String sMaxCount = "";
            char[] cSymbol = sText.toLowerCase().toCharArray();
            for (int i = 0; i < cSymbol.length; i++) {
                if (Character.isDigit(cSymbol[i])) {
                    curCount++;
                    sMaxNumber += cSymbol[i];
                } else {
                    curCount = 0;
                    sMaxNumber = "";
                }
                if (curCount > maxCount) {
                    maxCount = curCount;
                    sMaxCount = sMaxNumber;
                }
            }
            System.out.println(sMaxCount );
        }
    }