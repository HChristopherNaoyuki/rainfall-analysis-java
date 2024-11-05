# Rainfall Calculator

## Description

This is a simple Java program that calculates and summarizes rainfall data for three towns over 12 months. Users are prompted to input monthly rainfall values, which are then used to compute:

- The total rainfall for each town over the year.
- The average rainfall for each month across all towns.

The program ensures that user input is valid, rejecting negative rainfall values and non-integer inputs. 

## Features

- **Monthly Input**: Allows the user to enter rainfall data for each town for every month of the year.
- **Input Validation**: Ensures that only valid non-negative integers are accepted for rainfall values.
- **Yearly Summary**: Displays total rainfall for each town.
- **Monthly Averages**: Displays the average rainfall across all towns for each month.
- **Month Naming**: Converts month indices into human-readable month names.

## How to Run

1. Ensure that you have Java 8 or later installed on your system.
2. Clone or download the repository to your local machine.
3. Open a terminal and navigate to the project folder.
4. Compile the program using:
   ```bash
   javac RainfallCalculator.java
   ```
5. Run the program using:
   ```bash
   java RainfallCalculator
   ```

6. Follow the prompts to enter the rainfall data for each town and month.

## Example Output

```
Enter rainfall for month 1
Town 1: 120
Town 2: 150
Town 3: 100
...
SUMMARY OF RAINFALL FOR 2016
Town 1 total rainfall: 1400 mm
Town 2 total rainfall: 1300 mm
Town 3 total rainfall: 1200 mm
January: 110 mm
February: 120 mm
...
```

## Contributions

Feel free to fork the repository and submit issues or pull requests for improvements!

## Note

This program doesn't include error handling for edge cases like input beyond the valid range for months or towns. It is designed as a basic project for demonstrating rainfall data calculation and validation in Java.
