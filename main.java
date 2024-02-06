import java.util.*;

public class Main 
{
  public static void main(String[] args) 
  {
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter in an Integer");
    int n = input.nextInt();
    
    if(n % 2 != 0)
      System.out.println(n + " is odd");
    else
      System.out.println(n + " is even");
  }
}
