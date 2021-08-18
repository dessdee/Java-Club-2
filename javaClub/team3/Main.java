package javaClub.team3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        int taskNumber = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.println("Please enter task number: ");
            try {
                taskNumber = Integer.parseInt(br.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            } catch (NumberFormatException e) {
                System.err.println("Not a number!");
            }

            switch (taskNumber) {
                case 1:
                    //Task1.main();
                    break;
                case 2:
                    //Task2.main();
                    break;
                case 3:
                    //Task3.main();
                    break;
                case 4:
                    //Task4.main();
                    break;
                case 5:
                    Task5.main(args);
                    break;
                case 6:
                    //Task6.main();
                    break;
                case 7:
                    //Task7.main();
                    break;
                case 8:
                    //Task8.main();
                    break;
                case 9:
                    //Task9.main();
                    break;
                case 10:
                    //Task10.main();
                    break;
                case 11:
                    //Task11.main();
                    break;
                default:
                    System.err.println("Wrong task number!");
            }


        }
    }
}
