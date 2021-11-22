package com.company;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        File f = new File("Text.txt");
        BufferedReader fin = new BufferedReader(new FileReader(f));
        String line;
        while ((line = fin.readLine()) != null) System.out.println(line);
    }
}
