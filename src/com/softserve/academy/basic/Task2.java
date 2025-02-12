package com.softserve.academy.basic;

import com.softserve.academy.ConsoleColors;
import com.softserve.academy.Main;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Task2 {
    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numberOne;
        int numberTwo;
        int result;

        System.out.println("");
        System.out.println("Basic task2 'multiplying two numbers' is starting");
        System.out.println("I can multiplying two numbers! ");
        System.out.println("Please input number two numbers");

        try {
            System.out.println("put first");
            numberOne =Integer.parseInt(br.readLine());
            System.out.println("put second");
            numberTwo =Integer.parseInt(br.readLine());
            result = multiply(numberOne,numberTwo);
            System.out.println("Double Integer is " +  result);

        } catch (IOException |
                NumberFormatException e) {
            System.out.println(ConsoleColors.RED + "You don't put wrong number try again" + ConsoleColors.RESET);
            Task2.main(args);
        }

        System.out.println(ConsoleColors.GREEN + "Beak to main menu input 1 ");
        System.out.println("Try again  input 2 " + ConsoleColors.RESET);
        try {
            switch (br.readLine()) {
                case "1":
                    Main.main(args);
                    break;
                case "2":
                    DoubleInteger.main(args);
                    break;
                default:
                    System.err.println(ConsoleColors.RED + "You need ro put 1 or 2 ");
                    System.err.println("You transfer to menu " + ConsoleColors.RESET);
                    DoubleInteger.main(args);
            }
        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }

        public static int multiply ( int num1, int num2){
            return num1 * num2;
        }

}