// File: ChiliToGoProfit.java
// Author: Carlos M. Rivera Gonzalez y Olga Acosta Fernandez
// Date: 2/27/2025
// Comp: 2315 Structured Programming
// Description: Calculates the profit of all meals sold.

import java.util.Scanner;

public class ChiliToGoProfit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompts
        System.out.println("Welcome to Chili To Go for the Huntington Boys and Girls Club!");
        System.out.println("How many adult meals have been sold? ");
        int adultInput = sc.nextInt();
        System.out.println("How many child meals have been sold? ");
        int childInput = sc.nextInt();

        // Call to modules
        double adultTotalSold = calculateTotalSoldAdult(adultInput);
        double childTotalSold = calculateTotalSoldChild(childInput);
        double totalMealSold = calculateTotalMealsSold(adultTotalSold, childTotalSold);

        double adultProfit = calculateProfit(adultTotalSold, adultInput, 4.35);
        double childProfit = calculateProfit(childTotalSold, childInput, 3.10);
        double totalProfit = calculateTotalProfit(adultProfit, childProfit);

        // Outputs
        System.out.printf("This is the total amount of adult meals sold: $%.2f\n", adultTotalSold);
        System.out.printf("This is the total amount of children's meals sold: $%.2f\n", childTotalSold);
        System.out.printf("This is the total of all meals sold: $%.2f\n", totalMealSold);
        System.out.printf("This is the total profit from adult meals: $%.2f\n", adultProfit);
        System.out.printf("This is the total profit from children's meals: $%.2f\n", childProfit);
        System.out.printf("This is the total profit from all meals: $%.2f\n", totalProfit);
    }

    public static double calculateTotalSoldAdult(double input) {
        double ADULT_MEAL = 7.00;
        return input * ADULT_MEAL;
    }

    public static double calculateTotalSoldChild(double input) {
        double CHILD_MEAL = 4.00;
        return input * CHILD_MEAL;
    }

    public static double calculateTotalMealsSold(double adultTotalSold, double childTotalSold) {
        return adultTotalSold + childTotalSold;
    }

    public static double calculateProfit(double totalSold, int mealsSold, double costPerMeal) {
        return totalSold - (mealsSold * costPerMeal);
    }

    public static double calculateTotalProfit(double adultProfit, double childProfit) {
        return adultProfit + childProfit;
    }
}
