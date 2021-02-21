import java.util.*;

public class Calculator
{
    public double square_root(double n) {
        return Math.sqrt(n);
    }

    public int factorial(int n)
    {
        int fact = 1;
        if(n==0) 
            return 1;
        return n*factorial(n-1);
    }
    
    public double ln_function(double n)
    {
        return Math.log(n);
    }

    public double power(double n,double m)
    {
        return Math.pow(n,m);
    }
}

