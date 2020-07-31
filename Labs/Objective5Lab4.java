import java.util.Scanner;

public class Objective5Lab4 {
  public static void main(String[] args){
    Scanner number=new Scanner(System.in);

    System.out.println("Please enter a number: ");
    double userNum=number.nextDouble();

    if(userNum%2==0)
      System.out.println("The number is even");

      else
      System.out.println("The number is odd");

      number.close();
  }
}
