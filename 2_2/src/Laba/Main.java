package Laba;

import java.io.*;

public class Main {
        public static final String PUBLIC = "public";
        public static final String PRIVATE = "private";
        public static void main(String[] args) throws IOException {
            BufferedReader br = null;
            BufferedWriter bw = null;
            try {
                br = new BufferedReader(new FileReader("original.txt"));
                bw = new BufferedWriter(new FileWriter("result.txt"));
                String tmp = "";
                while ((tmp = br.readLine()) != null) {
                    bw.append(tmp.replace(PUBLIC, PRIVATE)).append(System.lineSeparator());
                }
            } catch (FileNotFoundException e) {
                System.out.println(e.getMessage());
            } finally {
                if (br != null) {
                    br.close();
                    bw.close();
                }
            }
        }
    }