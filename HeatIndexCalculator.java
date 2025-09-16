/*
 * Author: Oluwapamilerin Agbekorode
 * Date: 1/28/2024
 * Program to calculate the Heat Index while getting the temperature
 * and humidity from user.
 * This includes the formula,calculator,variables and printing output.
 */



package HeatIndexCalculatorTester;

public class HeatIndexCalculator {

    //Attributes
    private int temperature;
    private double humidity;
    private double heatIndex;
    
    //Creating variables for all C1-c9 
    //private because we are not chaning the value or using it in the tester 
     // I learnt to use the term 'final' if the value cannot be changed after assignment
    private static final double c1 = -42.379; 
    private static final double c2 = 2.04901523; 
    private static final double c3 = 10.14333127;
    private static final double c4 = -0.22475541;
    private static final double c5 = -6.83783 * Math.pow(10.0, -3); //I also learnt to use Math.pow to do 10^3
    private static final double c6 = -5.481717 * Math.pow(10.0, -2);
    private static final double c7 = 1.22874 * Math.pow(10.0, -3);
    private static final double c8 = 8.5282 * Math.pow(10.0, -4);
    private static final double c9 = -1.99 * Math.pow(10.0, -6);

    //Constructor
    public HeatIndexCalculator(int currentTemp, double currenthumidity){
            this.temperature = currentTemp;
            this.humidity = currenthumidity; 
            this.heatIndex = calculateHeatIndex(this.temperature, this.humidity); 
            //double HeatIndex = calculateHeatIndex(this.temperature, this.humidity); 
    }

    public double calculateHeatIndex(int currentTemp, double currentHumidity){
        
        double heatIndex = (c1 + (c2*currentTemp) + (c3*currentHumidity) + (c4*currentTemp*currentHumidity) + (c5*currentTemp*currentTemp) + (c6*currentHumidity*currentHumidity) + (c7*currentTemp*currentTemp*currentHumidity) + (c8*currentTemp*currentHumidity*currentHumidity) + (c9*currentTemp*currentTemp*currentHumidity*currentHumidity)); //formula
        
        return heatIndex;
    } // i tried using temperature and humidity in the formula but got 0.0 as heatIndex until i changed it to currentTemp and currentHumidity


    //To print output heatIndex        
    public void printHeatIndex(int currentTemp, double currentHumidity){
            System.out.println("At a temperature of " + currentTemp + "F and a humidity of " + currentHumidity + " percent");
            System.out.println("It actually feels like: " + (float)heatIndex + "F" ); //to print real number
            
    }

}
