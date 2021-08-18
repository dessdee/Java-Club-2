/*
* Debug celsius converter
* Your friend is traveling abroad to the United States so he wrote a program to convert fahrenheit to celsius.
* Unfortunately his code has some bugs.
* Find the errors in the code to get the celsius converter working properly.
* https://www.codewars.com/kata/grasshopper-debug
* */

package javaClub.team3;


public class Task11 {
    public static String weatherInfo(int temp) {
        double c = convertToCelsius(temp);
        if (c <= 0)
            return (c + " is freezing temperature");
        else
            return (c + " is above freezing temperature");
    }

    public static double convertToCelsius(int temperature) {
        return (temperature - 32) * (5.0/9.0);
    }
}
