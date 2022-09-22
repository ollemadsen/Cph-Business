class Fibonacci
{
    public static void main(String[] args)
    {
        fibonacci(1,1);
    }

    static void fibonacci(int a, int b)
    {
        
        if (b < 1000)

        {
             System.out.print(b + "\t");
             fibonacci(b, b+a);
        }
    }
}