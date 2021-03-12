
import java.util.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator
{
    private static final Logger logger = LogManager.getLogger(Calculator.class);
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        boolean bool = true;
        while(bool)
        {
            System.out.print("Select the operation to be performed from below options\n");
            System.out.println("1.Square Root\n 2.Factorial\n 3.Exit");
            n = input.nextInt();
            switch (n) {
                case 1:
                    System.out.println("Enter the number ");
                    double root = input.nextDouble();
                    System.out.println("Square root of "+root+" is "+square_root(root));
                    break;
                case 2:
                    System.out.println("Enter the number ");
                    int fact = input.nextInt();
                    System.out.println("Factorial of "+fact+" is "+factorial(fact));
                    break;
                case 3:
                    System.out.println("Exiting the program");
                    bool = false;
                    break;
                default:
                    System.out.println("Please enter correct option");
                    break;
                }
        }
        
    }

    public static double square_root(double n) {
    	logger.info("[SQUARE_ROOT] - "+n);
        double solution =  Math.sqrt(n);
        logger.info("[RESULT : SQUARE_ROOT] - "+solution);
        return solution;
    }

    public static int factorial(int n)
    {
        int fact = 1;
        logger.info("[FACTORIAL] - "+n);
        if(n<0)
        {
            logger.info("[RESULT - FACTORIAL] - "+0);
        	return 0;
        }
        else if(n==0 || n==1) 
        {
        	logger.info("[RESULT - FACTORIAL] - "+1);
        	return 1;
        }
        for(int i=2;i<=n;i++)
        {
        	fact = fact*i;
        }
        logger.info("[RESULT - FACTORIAL] - "+fact);
        return fact;
    }
}

