package Solutions;

import java.util.Scanner;
import java.util.InputMismatchException;

public class RainfallCalculator 
{
    public static void main(String[] args) 
    {
        final int TOWNS = 3;
        final int MONTHS = 12;
        
        int[][] rainfall = new int[MONTHS][TOWNS];
        
        Scanner scanner = new Scanner(System.in);
        
        for (int month = 0; month < MONTHS; month++) 
        {
            System.out.println("Enter rainfall for month " + (month + 1));
            for (int town = 0; town < TOWNS; town++) 
            {
                int rainfallInput = -1;
                
                while (true) 
                {
                    System.out.print("Town " + (town + 1) + ": ");
                    try 
                    {
                        rainfallInput = scanner.nextInt();
                        
                        // Check for valid rainfall range, adjust if necessary
                        if (rainfallInput < 0) 
                        {
                            System.out.println("Rainfall cannot be negative. Please enter again.");
                        } 
                        else 
                        {
                            rainfall[month][town] = rainfallInput;
                            break;
                        }
                    } 
                    catch (InputMismatchException e) 
                    {
                        System.out.println("Invalid input. Please enter an integer.");
                        scanner.next(); // Clear the invalid input
                    }
                }
            }
        }
        
        int[] townTotals = new int[TOWNS];
        System.out.println("\nSUMMARY OF RAINFALL FOR 2016");
        
        for (int town = 0; town < TOWNS; town++) 
        {
            for (int month = 0; month < MONTHS; month++) 
            {
                townTotals[town] += rainfall[month][town];
            }
            System.out.println("Town " + (town + 1) + " total rainfall: " + townTotals[town] + " mm");
        }

        for (int month = 0; month < MONTHS; month++) 
        {
            int monthTotal = 0;
            for (int town = 0; town < TOWNS; town++) 
            {
                monthTotal += rainfall[month][town];
            }
            int monthAverage = monthTotal / TOWNS;
            System.out.print(getMonthName(month) + ": ");
            System.out.println(monthAverage + " mm");
        }
        
        scanner.close();
    }
    
    private static String getMonthName(int month) 
    {
        switch (month) 
        {
            case 0: return "January";
            case 1: return "February";
            case 2: return "March";
            case 3: return "April";
            case 4: return "May";
            case 5: return "June";
            case 6: return "July";
            case 7: return "August";
            case 8: return "September";
            case 9: return "October";
            case 10: return "November";
            case 11: return "December";
            default: return "Invalid Month";
        }
    }
}
