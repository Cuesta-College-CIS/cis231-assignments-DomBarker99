/*

    [Q]
    {

        1. Given an array with 10 elements with
            the first 5 slots being filled wiht numbers 
             in ascending order
                User will input a number that needs to be inserted into the array
                 in a place that maintains ascending numerical order
                    Program will OUTPUT the fixed array
        
    }

    [HOW TO]
    {

        - Declare the 10 value array with the given data

        - Pass user input into variable inputToInject

        - Enter for loop that itterates through the array and
            checks if inputToInject is less than the integers
                greater than zero
        
        - Find the first value that is greater than
            Special Integer and assign store that value somewhere

        - Enter for loop that re assigns all the values to
            to one slot over from that point on

        - OUTPUT the newly adjusted array

    [NEW STRAT]
        
    }

    [NOTES IN CODE ARE FINAL ANNOTANTIONS,
        TEXT ABOVE IS PRE SETUP]

*/

import java.util.Scanner;

public class Lab519 {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);

		// Declare length var and 10 value array
		int length = 5;

		int[] number = { 5, 20, 30, 35, 50, 0, 0, 0, 0, 0 };

		// Pass user input into inputToInject
		// Set initial positionWhereInputShouldGo
		int inputToInject = scnr.nextInt();

		int positionWhereInputShouldGo = 0;

		boolean keepGoing = true;

		while (keepGoing) {

			if (number[positionWhereInputShouldGo] >= inputToInject
					|| number[positionWhereInputShouldGo] == 0) {

				keepGoing = false;

			} else {

				++positionWhereInputShouldGo;

			}

		}

		int passVal; // used for swap in for loop

		// For loop that shifts values in the array when the positionWhereInputShouldGo
		// is found
		// by initially incrementing it and then again after each itereation
		// MOVE 0 LEFT FROM 5 SLOT IN ARRAY UNTIL IT IS IN positionWhereInputShouldGo
		for (int firstZeroSlot = 5; firstZeroSlot != positionWhereInputShouldGo; --firstZeroSlot) {

			passVal = number[firstZeroSlot - 1];

			number[firstZeroSlot] = passVal;

			number[firstZeroSlot - 1] = 0;

			// this is very good idea to make a space to inser the value "inputToInject"
			// But, we do not need to swap two values.
			// Instead of swapping two values,
			// Just shift the value to the right one element position
			// Thus,

			// number[firstZeroSlot] = number[firstZeroSlot - 1]

			// This code will make the array like this pattern
			// when we assume inputToInject = 25
			// 5 20 30 35 50
			// 5 20 30 35 50 50
			// 5 20 30 35 35 50
			// 5 20 30 30 35 50
		}

		number[positionWhereInputShouldGo] = inputToInject;
		// Here, now 5 20 25 30 35 50

		for (int y = 0; y < length + 1; ++y) {

			System.out.print(number[y] + " ");

		}

		System.out.println();

	}
}