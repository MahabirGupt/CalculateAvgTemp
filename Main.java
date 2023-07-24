import java.util.*;
public class Main {
    public static void main(String[] args) {
//        initializing the scanner class
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many days temperature?");
        int numOfDays = scanner.nextInt();
        double avg = 0;
        double total = 0;
        for (int i =1; i <=numOfDays; i++){
            System.out.print("Enter temperature for Day " + i + " : ");
            double temp = scanner.nextFloat();

            total = total + temp;
        }
        avg = total / numOfDays;
        System.out.println();
        System.out.println("The average temperature is " + avg);
        int arr[][];
    }
}
