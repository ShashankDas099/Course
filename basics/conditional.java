import java.util.Scanner; 
class conditional 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int age;
        System.out.println("enter your age: ");
        age= scanner.nextInt();
        
        if (age>=60){
            System.out.println("You are an old person");
        }
        else if(age>=18 )
        {
            System.out.println("You are an adult");
        }
        else{
            System.out.println("You are a child");
        }
        scanner.close();
    }
}