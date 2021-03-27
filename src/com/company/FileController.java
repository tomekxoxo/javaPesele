package com.company;

import java.io.*;

public class FileController {
    static final String FILE_PATH = "./mieszkancy.txt";

    File f = new File(FILE_PATH);
    public BufferedWriter writer = new BufferedWriter(new FileWriter(f));
    BufferedReader reader = new BufferedReader(new FileReader(f));

    public FileController() throws IOException {
    }

    void readFile() {
        try {
            String s;
            while ((s = reader.readLine()) != null) {
                System.out.println(s);
            }
            reader.close();
        } catch (Exception ex) {
            return;
        }
    }

    void writeFile(String data) throws IOException {
        try {
            writer.write(data);
        } catch (Exception ex) {
            return;
        }


    }

    void endWrite() {
        try {
            writer.close();
        } catch (Exception ex) {
            return;
        }
    }



}
