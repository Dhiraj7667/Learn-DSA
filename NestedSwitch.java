import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    int empID = in.nextInt();
    String department = in.next();

    switch (empID) {
        case 1:
            System.out.println("Dhiraj kumar");
            break;
    case 2:
    System.out.println("badal raj");
    break;
    case 3:
    System.out.println("Emp number 3");
    switch (department) {
        case "IT":
            System.out.println("IT department");

            break;
    case "Management":
    System.out.println("Management department");
    break;
    default:
    System.out.println("No department entered");
       
    }
break;
        default:
        System.out.println("Enter correct EmpID");
            break;
    }

    }
}
