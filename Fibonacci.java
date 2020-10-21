public class Fibonacci 
{
	public static void main(String[] args)
	{
        Fibonacci Fib = new Fibonacci();
        Fib.printFiboacciAndAverage(20);  //arguement passing
    }
    private void printFiboacciAndAverage(int n)
	{
        int   a = 1;
        int   b = 1;
        int   c = 0;
        int   sum = 0;
        if (n <= 0)
		{
            System.out.println("Please correct number of items and try again.");
            return;
        }
	    System.out.println("The first " + n + " Fibonacci numbers are:");   
        for(int i = 1; i <= n; i++)
		{
            switch (i)
			{
                case 1: c = a; 
						break;
                case 2: c = b;
						break;    
                default:
                        c = a + b;
                        a = b;
                        b = c;
            }
            sum += c;
            System.out.print(c + " ");
        }
        System.out.println(); 
        System.out.printf("The average is %.2f \n", (double)sum / n);
    }
    
}
