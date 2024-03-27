package Ariaro;

import java.util.*;




public class Practical11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

       
        if (isLeapYear(year)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

        scanner.close();
    }

    private static boolean isLeapYear(int year) {
        
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}