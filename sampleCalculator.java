import java.util.Scanner;

public class sampleCalculator
{
    public static void main(final String[] args) {

        final int num1;
        final int num2;
        final String operation;
        double answer = 1.0;

        if (args.length > 0) {
            System.out.println("Working with command line arguements.\n");
            num1 = Integer.parseInt(args[0]);
            num2 = Integer.parseInt(args[1]);
            operation = args[2];
        }
        else {
            System.out.println("No specified arguements, so going for manual entry.\n");
            final var scanObject = new Scanner(System.in);

            System.out.println("What operation? ");
            operation = scanObject.nextLine();

            System.out.println("Please enter first number: ");
            num1 = scanObject.nextInt();

            System.out.println("Please enter second number: ");
            num2 = scanObject.nextInt();
            
            scanObject.close();

        }

        switch (operation) {
            case "add": answer = num1 + num2;
                      break;
            case "subtract": answer = num1 - num2;
                      break;
            case "multiply": answer = num1 * num2;
                      break;
            case "divide": answer = num1 / num2;
                      break;
            default : System.out.println("No operation given!");
                      System.exit(1);
        }

        System.out.println(num1 + " " + operation + " " + num2 + " = " + answer);
    }
}