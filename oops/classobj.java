import java.util.Scanner;
class Calculator 
{
    public int add(int n1,int n2)
    {
        int r = n1+n2 ;
        return r;
    }
    public int sub(int n1,int n2)
    {
        int r = n1-n2 ;
        return r;
    }
    public int mul(int n1,int n2)
    {
        int r = n1*n2 ;
        return r;
    }
}
public class classobj
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter 2nd number: ");
        int num2 = scanner.nextInt();
        Calculator cal = new Calculator();
        int resadd= cal.add(num1,num2);
        int ressub= cal.sub(num1,num2);
        int resmul= cal.mul(num1,num2);
        System.out.println("ADDITION = "+resadd);
        System.out.println("SUBTRACTION = "+ressub);
        System.out.println("MULTIPLICAION = "+resmul);


    }
}