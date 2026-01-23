import java.util.Scanner;
class userinput
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);


        System.out.print("enter your name: ");
        String name =scanner.nextLine();
        

        System.out.print("enter your age: ");
        int age =scanner.nextInt();
        
        System.out.print("what is your cgpa: ");
        double cgpa =scanner.nextDouble();

        System.out.print("are you a student: ");
        scanner.nextLine();
        String answer = scanner.nextLine();
        
        System.out.println("hello "+name);
        System.out.println("You are " + age + " year old");
        System.out.println("Your cgpa is "+cgpa);
        if(answer.equalsIgnoreCase("yes"))
        {
            System.out.println("You are a student");
        }
        else
        {
            System.out.println("You are not a student");
        }


        scanner.close();
    }
}