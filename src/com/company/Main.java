package com.company;

import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        HashMap<String, String> peselToPerson = new HashMap<String, String>();
        dataEntry(peselToPerson);

    }

    public static void dataEntry(HashMap<String, String> peselToPerson) {
        Scanner scanner = new Scanner(System.in);
        String name = "", pesel = "", city = "";

        System.out.println("Enter your City");
        city = scanner.nextLine();
        System.out.println("Enter your full name");
        name = scanner.nextLine();
        System.out.println("Enter your PESEL");
        pesel = scanner.nextLine();

        PeselController peselController = new PeselController(pesel);
        if (peselController.isValid()){
            peselToPerson.put(pesel, name + ", " + city);
        } else {
            System.out.println("PESEL is not correct, please try again");
        }
        System.out.println("Type 'quit' if you want to end work, type anything if you want to enter another person");
        if (scanner.nextLine().equals("quit")) {
            String fileContent = "";
            for (String p : peselToPerson.keySet()) {
                fileContent += p + ", " + peselToPerson.get(p) + "\n";
            }
            try {
                FileController fileController = new FileController();
                fileController.readFile();
                fileController.writer.flush();
                fileController.readFile();
                fileController.writeFile(fileContent);
                fileController.endWrite();
            } catch (IOException ex) {
                System.out.println("File save failed " + ex.getMessage());
            }
            System.exit(-1);
        } else {
            dataEntry(peselToPerson);
        }
    }
}
