/*
 * Author: Oluwapamilerin Agbekorode
 * Date: 1/28/2024
 * Program to test the program for the Heat Index while getting the temperature
 * and humidity from user.
 * This includes the collection of variables, an dusing the formula to print output.
 */


package HeatIndexCalculatorTester;

import java.util.Scanner;

public class HeatIndexCalculatorTester {
    public static void main(String[] args){
               Scanner input = new Scanner(System.in);

        //Gets temperature input
        System.out.print("Please enter the current temperature in Fahrenheit: ");
        int currentTemp = input.nextInt();

        //Gets humidity input
        System.out.print("Please enter the current humidity as a percentage: ");
        double currentHumidity = input.nextDouble();

        //Store inputs
        HeatIndexCalculator heatIndexCalculator = new HeatIndexCalculator(currentTemp, currentHumidity);
                
        double heatIndex = heatIndexCalculator.calculateHeatIndex(currentTemp, currentHumidity);

        //Prints output already written in first file
        heatIndexCalculator.printHeatIndex(currentTemp, currentHumidity);

    }
}

