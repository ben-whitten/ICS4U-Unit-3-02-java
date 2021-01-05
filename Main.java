/*
* The Main program implements an application that
* recreates the factorial program.
*
* @author  Ben Whitten
* @version 1.0
* @since   2021-1-5
*/

import java.util.Scanner;  // Import the Scanner class

///////////////////////////////////////////////////////////////////////////////

class Main {

  /////////////////////////////////////////////////////////////////////////////
  
  public static int factorial(int someInt) {
    if (someInt == 1) {
      return 1;
    } else {
      return (someInt * factorial(someInt - 1));
    }
  }

  /**
   * This function handles all the inputs and outputs.
   */
  public static void main(String[] args) {
    try {
      Scanner scanInt = new Scanner(System.in);

      System.out.println("Input an integer:");
      int someInt = scanInt.nextInt();
      
      int answer = factorial(someInt);
      
      System.out.println("Your new number is: " + answer);

    } catch (Exception e) {
      System.out.println("Error: Invalid Input");
    }
  }
  /////////////////////////////////////////////////////////////////////////////
}
