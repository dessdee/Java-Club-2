package com.softserve.academy.basic;

import com.softserve.academy.ConsoleColors;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainBasic {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        text();
        try {
            switch (br.readLine()) {
                case "1":
                    DoubleInteger.main(args);
                    break;
                default:
                    System.err.println(ConsoleColors.RED +"You need to put number with 1 to * ");
                    System.err.println("You transfer to menu "+ ConsoleColors.RESET);
                    MainBasic.main(args);

            }
        } catch (IOException e) {
            e.printStackTrace();
            MainBasic.main(args);
        }


    }

    private static void text() {

        System.out.println(ConsoleColors.GREEN + "Please enter TASK number" + ConsoleColors.RESET);
        System.out.println(ConsoleColors.GREEN + "1" + ConsoleColors.RESET + "  Double Integer");

    }

}
