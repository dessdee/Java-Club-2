package com.softserve.academy.classes;

import com.softserve.academy.ConsoleColors;
import com.softserve.academy.basic.DoubleInteger;
import com.softserve.academy.basic.MainBasic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainClasses {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        text();
        try {
            switch (br.readLine()) {
                case "1":

                    break;

                default:
                    System.err.println(ConsoleColors.RED +"You need to put number with 1 to * ");
                    System.err.println("You transfer to menu "+ ConsoleColors.RESET);
                    MainClasses.main(args);
            }
        } catch (IOException e) {
            e.printStackTrace();
            MainClasses.main(args);
        }


    }

    private static void text() {

        System.out.println(ConsoleColors.GREEN + "Please enter TASK number" + ConsoleColors.RESET);
        System.out.println(ConsoleColors.GREEN + "1" );
        System.out.println(ConsoleColors.RESET );


    }

}
