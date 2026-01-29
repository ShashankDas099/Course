public class arithmeticoperations
{
    public static void main(String[] args)
    {
        int a = 6;
        int b = 4;
        System.out.println(a);
        System.out.println(b);
        //addition 
        int add = a + b;
        System.out.println("addtion = "+ add);

        //subtraction
        int sub = a-b;
        System.out.println("subtraction = "+sub);

        //multiplication
        int mul = a*b;
        System.out.println("multiplication = "+mul );

        //division q
        int div = a/b;
        System.out.println("division = "+div);

        //remainder 
        int rem =a%b;
        System.out.println("remainder = "+rem);

        //pre increment
        int preinc = ++a;
        System.out.println("pre increment of a = "+preinc);

        //post increment
        int posinc = b++;
        System.out.println("post increment of b = "+posinc);

    }
}