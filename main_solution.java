// Practicum 10 (Even or Odd Program) Solution

// This program will prompt the user for an integer value
// and display whether it is even or odd.

// REQUIRED OUTPUT:
// The program MUST display the results exactly as shown below:
// <n> is odd
// <n> is even
// --------------------------------------------------------------
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    // init
    int num;
    boolean is_even;
    Scanner input = new Scanner(System.in);

    // prompt user for number
    System.out.print("Enter an integer value: ");
    num = input.nextInt();

    // check if number is odd or even
    if (num % 2 == 0)
      is_even = true;
    else
      is_even = false;

    // display result
    if(is_even)
      System.out.println(num + " is even");
    else
      System.out.println(num + " is odd");
  }  
}   
