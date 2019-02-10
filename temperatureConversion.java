
/**
 * TemperatureConversion
 * This program will take a user provided temperature and convert it from
 * f to c or c to f
 * @Dan Joshwa
 */
import java.util.*;//import library

public class temperatureConversion
{   public static void main(String args[])//main
    {
        String unit;//temperature unit var
        String playAgain;//imput for whether the user ends the program or not
        double newTemperature;//variable for the converted temp
        while (1==1)//infinite loop
        {
            Scanner scan = new Scanner(System.in);//gets system imput

            System.out.println("Enter a tempurature");
            double temperature = scan.nextInt();//input is now equal to the original temp var
            System.out.println("Is this number in C or F");
            unit = scan.next();//temp unit var is now equal to user input

            if (unit.equals("C") || unit.equals("c"))//if the unit is c
            {
                newTemperature = (9.0/5 * temperature) + 32;//convert c to f
                System.out.println(temperature + " degrees C = " + newTemperature + " degrees F");
                System.out.println("Would you like to convert another value (Y/N)");
            }
            else if (unit.equals("F") || unit.equals("f"))//if the unit is f
            {
                newTemperature = (temperature - 32)*5/9.0;//convert f to c
                System.out.println(temperature + " degrees F = " + newTemperature + " degrees C");
                System.out.println("Would you like to convert another value (Y/N)");
            }
            else//otherwise ask user to try again
            {
                System.out.println("Enter what unit your value is (C or F)");
                System.out.println("Try to convert another value (Y/N)");
            }
            playAgain = scan.next();//play again var = user input
            if (playAgain.equals("N") || playAgain.equals("n"))//if the input is no
            {
                System.exit(0);//kill the program
            }
        }
    }
}
