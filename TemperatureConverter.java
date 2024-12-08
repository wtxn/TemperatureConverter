import java.util.Scanner;

public class TemperatureConverter {


    public static void main(String[] args) {
        //TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);
        System.out.print("Fahrenheit to Celsius (1) or Celsius to Fahrenheit(2) : ");
        int result = sc.nextInt();

        if (result == 1) {
            //calculate fahrenheit to celsius

            System.out.println("You have chosen Fahrenheit to Celsius.");
            System.out.println("Enter Fahrenheit Value");
                    double value = sc.nextDouble();
                    double valueFinal =(value - 32)*5/9;
                    System.out.print("Celsius is: ");
                    System.out.println(Math.round(valueFinal*10.0)/10.0);


        }else if (result == 2) {
            //calculate celsius to fahrenheit

            System.out.println("You have chosen Celsius to Fahrenheit.");
            System.out.println("Enter Celsius Value");
            double value2 = sc.nextDouble();
            double value2Final =(value2 * 9/5) + 32 ;
            System.out.print("Fahrenheit is: ");
            System.out.println(Math.round(value2Final*10.0)/10.0);
        }else {
            // Any number that is not 1 or 2
            System.out.println("Invalid input");
        }
    }
}
