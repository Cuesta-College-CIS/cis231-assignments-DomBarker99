import java.util.Scanner;
import java.lang.Math;

public class Lab423 {
    public static void main(String[] args) {
        
        //all inputs must contain a neg number (either at begin or end ) and are at least 1 char long. 

        Scanner scnr = new Scanner(System.in);

        int userInput = scnr.nextInt();

        float numOfInput = 0;
        
        float userSum = 0;

        int maxNum = -1;
		
                
		int minNum = 100;
		// minNum should be initialized with the first input 
		// Or enough big number so that any number can replace it.
		// Simple way is: 
		// minNum = Integer.MAX_VALUE


		// Need to setup the while loop 
		// while (userInput > 0)
        if ( userInput < 0 ) {
            
            System.out.print("0 0.00");
        
        } else {

            ++numOfInput;

            userSum = userSum + userInput;

            userInput = scnr.nextInt();

            if ( userInput < 0 ) { 
                
                System.out.print("0 0.00");
            
            } else {
                
                    while ( userInput >= 0 ) {

                        if ( userInput < minNum ) {

                            minNum = userInput;
                    
                        } else if ( userInput > maxNum ) {
                
                            maxNum = userInput;
                        } 

                        userSum = userSum + userInput;

                        ++numOfInput;

                        userInput = scnr.nextInt();
                
                    }
                    
              
              
                }
        
            System.out.print( ( userSum-(maxNum+minNum) ) + " " );
            System.out.printf("%.2f\n" , ( userSum / (numOfInput - 2.0) ) );
        
        }
    }
}

// Reference this code segment

// while ((userNum = scnr.nextInt()) >= 0) {
// 			if (cnt == 0) {
// 				min = max = userNum;
// 			} else if (userNum < min)
// 				min = userNum;
// 			else if (userNum > max)
// 				max = userNum;

// 			sum += userNum;
// 			cnt++;
// 		}