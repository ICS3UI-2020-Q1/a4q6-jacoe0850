import java.util.Scanner;
/**
 * finds out if a number is prime
 * @jacoe0850 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //scanner for input
    Scanner input = new Scanner(System.in);
    // ask for integer
    System.out.println("Which number would you like to check?");
    int num = input.nextInt();
    int counter = 2;
    while(counter < num){
      if(num % counter == 0){
        System.out.println(num + " is not a prime number");
        break;
      }
      counter = counter + 1;
    }
    if(num == counter){
      System.out.println(num + " is a prime number");
  }
  }
}
