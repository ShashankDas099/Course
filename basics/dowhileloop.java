import java.util.Scanner;
class dowhileloop
{
    public static void main(String a[])
    {
    Scanner scanner = new Scanner(System.in);
    int age = 0;
    do{
        System.out.println("Your age cant be negative");
        System.out.println("Enter your age:");
        age = scanner.nextInt();
    }while(age<0);
    System.out.println("you are "+age+" year old");
    scanner.close();

    }
}