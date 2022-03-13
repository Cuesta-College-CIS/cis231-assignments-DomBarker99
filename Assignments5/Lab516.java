/*

[Q]
{

    1. Get input from user that contains
        - The first value being an int that indicates
            the number of floating point that will be given by the user
        - !!Assume there will always be fewer than 20 float values
    
    2. Divide all the values by the largest values and
        OUTPUT each value + " "
        - !!Highest value will be printed as 1.00

}

[HOW TO]
{

    - Declare a float array called floatNumbers with 20 values
        Declare the first input to int totalCount
   
    - Set the first value in floatNumbers to the next input
        Declare maxValue to floatNumbers[0]
    
    - Enter a for loop ( int x = 1; x < totalCount; ++x ) 
    {

        1. get next input asigned to currentValue

        2. assign currentValue to floatNumbers[x]

        3. check if currentValue is > maxValue and
            if so assign currentValue to maxValue

    }

    - Enter a for loop ( int y = 0; y < totalCount; ++y )
    {

        1. Print each item in the array divided by the maxValue
            rounded to 2 decimal places

    }
    
    -Program is done
    
}

*/

import java.util.Scanner;

public class LabProgram {
	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);

		// Declared float array
		float[] floatNumbers = new float[20];

		// Set first input to int var
		int totalCount = scnr.nextInt();

		// Manually assigned first float input
		// from user to first value in array
		floatNumbers[0] = scnr.nextFloat();

		// Set the first value in the array to maxValue
		// Declared currentValue to be used to pass
		// input into the array
		// float maxValue = floatNumbers[0];

		float currentValue;

		// Assign float inputs to the array and re assign
		// max value if a higher number is found
		// for (int x = 1; x < totalCount; ++x) {

		// currentValue = scnr.nextFloat();

		// floatNumbers[x] = currentValue;

		// if (currentValue > maxValue) {

		// maxValue = currentValue;

		// }

		// } // Exit when all inputs are pass
		// maxValue has been found
		float maxValue = 0;
		for (int x = 0; x < totalCount; ++x) {
			currentValue = scnr.nextFloat();
			floatNumbers[x] = currentValue;
			if ((x == 0) || (currentValue > maxValue)) {
				maxValue = currentValue;
			}
		}
		// Passes the values in the array to newNum divided
		// divided by the maxValue
		for (int y = 0; y < totalCount; ++y) {

			float newNum = (floatNumbers[y] / maxValue);

			System.out.printf("%.2f", newNum);
			System.out.print(" ");

		}

		System.out.println();

	}
}