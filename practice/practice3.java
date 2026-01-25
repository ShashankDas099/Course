import java.util.Scanner;
class practice3
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Student Name: ");
        String name = scanner.next();
        scanner.nextLine();
        System.out.print("Enter Student Age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Marks in Maths: ");
        int marks1 =scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Marks in English: ");
        int marks2 =scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Marks in Science: ");
        int marks3 =scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Marks in SST: ");
        int marks4 =scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Marks in Hindi: ");
        int marks5 =scanner.nextInt();
        scanner.nextLine();
        System.out.println("-------------------------------------------------------------------------");
        int[] marks = {marks1,marks2,marks3,marks4,marks5};
        int total = 0;
        for(int i=0;i<marks.length;i++){
            total+=marks[i];
        }
        
        double average = (marks[0]+marks[1]+marks[2]+marks[3]+marks[4])/5.0;
        
        int grade = (int) average/10;
        System.out.println("---------REPORT CARD -----------------------");
        System.out.println("Name: "+name.toUpperCase());
        System.out.println("Age: "+age);
        System.out.println("Marks in Maths: "+marks1);
        System.out.println("Marks in English: "+marks2);
        System.out.println("Marks in Science: "+marks3);
        System.out.println("Marks in SST: "+marks4);
        System.out.println("Marks in Hindi: "+marks5);
        
        
        System.out.println("Total marks: "+total+" /500");
        System.out.println("Average marks: "+average);
        switch(grade){
            case 10,9 -> System.out.println("Grade: A");
            case 8,7  -> System.out.println("Grade: B");
            case 6-> System.out.println("Grade: C");
            case 5  -> System.out.println("Grade: D");
            default -> System.out.println("FAIL");
        }
        
        
    }
}