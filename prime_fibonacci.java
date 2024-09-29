#5

public class PrimeFibonacci 
{
    public static boolean isPrime(int n) 
    {
        int i;
        if (n < 2) 
        {
            return false;
        }
        for (i = 2; i <= n/2; i++) 
        {
            if (n % i == 0) 
            {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) 
    {   
        int limit = 100000;
        int a = 0, b = 1;
        while (a < limit) 
        {
            if (isPrime(a)) 
            {
                System.out.println(a);
            }
            int next = a + b;
            a = b;
            b = next;
        }
    }
}


***OUTPUT***

2
3
5
13
89
233
1597
28657

