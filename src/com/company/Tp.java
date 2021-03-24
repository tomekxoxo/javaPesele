package com.company;
import java.io.*;

public class Tp {
    public static void main(String[] args) throws IOException{
        final String FILE_PATH = "./mieszkancy.txt";

        File f = new File(FILE_PATH);
        BufferedWriter bw = new BufferedWriter(new FileWriter(f));
        BufferedReader br = new BufferedReader(new  FileReader(f));
        bw.write("Some text");
        bw.flush();
        System.out.println(br.readLine());
        bw.write("Some more text");
        bw.flush();
        bw.close();
        br.close();
    }
}
