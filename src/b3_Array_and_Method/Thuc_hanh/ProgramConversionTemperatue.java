package b3_Array_and_Method.Thuc_hanh;

import java.util.Scanner;

public class ProgramConversionTemperatue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.println("Enter the your choice");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter the Farenheit F: ");
                    double farenheit = scanner.nextDouble();
                    System.out.println("Result Fahrenheit to Celsius: " + FahrenheitToCelsius(farenheit));
                    break;
                case 2:
                    System.out.print("Enter the Celsius C: ");
                    double celsius = scanner.nextDouble();
                    System.out.println("Result Celsius to Fahrenheit: " + CelsiusToFahrenheit(celsius));
                    break;
                case 0:
                    System.exit(0);
                    break;
            }
        } while (choice != 0);
    }

    public static double FahrenheitToCelsius(double F) {
        double C = (5.0 / 9) * (F - 32);
        return C;
    }

    public static double CelsiusToFahrenheit(double C) {
        double F = C / (5 / 9) + 32;
        return F;
    }
}

