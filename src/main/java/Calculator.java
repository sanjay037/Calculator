
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
            System.out.println("1.Square Root\n 2.Factorial\n 3.Natural Logarthim\n 4.Power Function\n 5.Exit");
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
                    System.out.println("Enter the number ");
                    double log = input.nextDouble();
                    System.out.println("Natural Logarithm of "+log+" is "+ln_function(log));
                    break;
                case 4:
                    System.out.println("Enter numbers a and b to find a power b ");
                    double n1 = input.nextDouble();
                    double n2 = input.nextDouble();
                    System.out.println(n1+" power "+n2+" is "+power(n1,n2));
                    break;
                case 5:
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
        double solution = 0;
        try {
            logger.info("[SQUARE_ROOT] - "+n);
            if(n<0)
            {
                solution = Double.NaN;
                throw new IllegalArgumentException("Input can't be negative");
            }
            else solution =  Math.sqrt(n);
        } 
        catch (IllegalArgumentException error) {
            logger.error("[EXCEPTION - SQUARE_ROOT] - INVALID INPUT "+error.getLocalizedMessage());
        }
        finally
        {
            logger.info("[RESULT - SQUARE_ROOT] - "+solution);
        }
        return solution;
    }

    public static int factorial(int n)
    {
        int fact = 1;
        logger.info("[FACTORIAL] - "+n);
        if(n<0)
        {
            logger.error("[EXCEPTION - FACTORIAL] - INVALID INPUT "+0);
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
    public static double ln_function(double n)
    {
        double solution = 0;
        try {
            logger.info("[NATURAL_LOGARITHM] - "+n);
            if(n<=0)
            {
                solution = Double.NaN;
                throw new IllegalArgumentException("Input should be greater than zero");
            }
            else solution =  Math.log(n);
        } 
        catch (IllegalArgumentException error) {
            logger.error("[EXCEPTION - NATURAL_LOGARITHM] - INVALID INPUT "+error.getLocalizedMessage());
        }
        finally
        {
            logger.info("[RESULT - NATURAL_LOGARITHM] - "+solution);
        }
        return solution;
    }
    public static double power(double n,double m)
    {
    	double solution = 1;
    	logger.info("[POWER] - "+n+","+m);
    	solution = Math.pow(n,m);
    	logger.info("[RESULT - POWER] - "+solution);
    	return solution;
    }
}

