package javaClub.team3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        int taskNumber = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter task number: ");
        try {
            taskNumber = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e){
            System.err.println("Not a number!");
        }

        while(true){
            switch (taskNumber){
                case 1:
                    //Task1.main();
                case 2:
                    //Task1.main();
                case 3:
                    //Task1.main();
                case 4:
                    //Task1.main();
                case 5:
                    //Task1.main();
                case 6:
                    //Task1.main();
                case 7:
                    //Task1.main();
                case 8:
                    //Task1.main();
                case 9:
                    //Task1.main();
                case 10:
                    //Task1.main();
                case 11:
                    //Task1.main();
                default:
                    System.err.println("Wrong task number!");
            }
        }
    }
}
