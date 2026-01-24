import java.util.Scanner;
class eswitch 
{
    public static void main(String a[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter todays day : ");
        String day = scanner.nextLine();
        switch(day.toLowerCase()){
            case "monday","tuesday","wednesday","thrusday","friday" -> System.out.println("It is a weekday");
            case "saturday","sunday"-> System.out.println("It is the weekend");
            default -> System.out.println(day+ " is not a day");
        }
    }
}
