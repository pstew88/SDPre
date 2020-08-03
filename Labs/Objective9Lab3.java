import java.util.Scanner;

public class Objective9Lab3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int selection;

    while(true){
      printMenu();
      selection = scanner.nextInt();


        switch (selection) {
        case 1:
        System.out.println("Hello World");
        break;

        case 2:
        System.out.println("Sushi, BBQ, Pizza");
        break;

        case 3:
        System.out.println("Goodbye");
        break;

        default:
        System.out.println("That is not a valid selection, please try again");
        break;
      }
        if (selection==3){
        break;
      }

    }

    scanner.close();

  }

  public static void printMenu() {
    System.out.println("_____Menu_____");
    System.out.println("1: Say Hello");
    System.out.println("2: List My favorite foods");
    System.out.println("3: Exit");
    System.out.println();
  }
}
