package com.company;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String name = "", pesel = "", city = "";

        FileController fileController = new FileController();

        while (true) {
            System.out.println("Enter your City");
            city = scanner.nextLine();
            fileController.readFile();
            if(city.equals("exit")) break;
//            System.out.println("Enter your full name");
//            name = scanner.nextLine();
//            if(name.equals("exit")) break;
//            System.out.println("Enter your PESEL");
//            pesel = scanner.nextLine();
//            if(pesel.equals("exit")) break;
//            PeselController peselController = new PeselController(pesel);
//            fileController.writer.flush();
//            fileController.readFile();
//            if(!peselController.isValid()){
//                System.out.println("PESEL is not correct, please try again");
//            }
//            else{
//
//                fileController.writeFile(city + " "+ name + " " + pesel);
//            }
        }
        fileController.endWrite();

    }
}
