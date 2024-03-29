import java.util.Scanner;

public class breakstatements {
  public static void main(String[]args)  {
    
    Scanner in = new Scanner(System.in);
    String fruit = in.next();
    switch (fruit) {
        case "mango":
        System.out.println("king of fruits");
        break;
        case "Apple":
        System.out.println("A sweet red fruit");
        break;
        case "orange":
        System.out.println("round fruit");
        break;
        case "Grapes":
        System.out.println("small fruit");
        break;
        default:
        System.out.println("please enter a valid fruiuts");

    }
  }
}
