import java.util.*;

public class Main {
    public static void main(String[] args) {
//        initializing the scanner class
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many days temperature?");
        int numOfDays = scanner.nextInt();
//        storing the temperature as array
        float[] temp = new float[numOfDays];
        int count = 0;
        double avg = 0;
        double total = 0;
//        record temperatures and find average
        for (int i = 1; i <= numOfDays; i++) {
            System.out.print("Enter temperature for Day " + i + " : ");
            temp[i - 1] = scanner.nextFloat();
            total = total + temp[i - 1];
        }
        avg = total / numOfDays;
        System.out.println();
        System.out.println("The average temperature is " + avg);
        for (int i = 0; i < numOfDays; i++) {
            if (temp[i] > avg) {

                count++;
            }
        }
        System.out.println("There are " + count + " days with temperature more than average temperature");
    }
}
