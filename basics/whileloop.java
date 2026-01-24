import java.util.Scanner;
class whileloop {
    public static void main (String[] args){
        Scanner scanner =new Scanner(System.in);
        //example 1
        //String name = "";
        //while(name.isEmpty()){
           // System.out.print("Enter your name: ");
            //name = scanner.nextLine();
            //}
        //System.out.println("Hello,"+name);
        
        //example 2
        //String response = "";
        //while (!response.equals("Q")){
            //System.out.println("You are playing a game");
            //System.out.println("Press Q to exit ");
            //response = scanner.nextLine().toUpperCase();
        //}
        //System.out.println("You exited the game");

        //example 3
        int age = 0;
        System.out.println("Enter your age: ");
        age = scanner.nextInt();
        while (age<1){
            System.out.println("Age cant be negative");
            System.out.println("Enter your age: ");
            age = scanner.nextInt();
        }
        System.out.println("You are "+age+" year old");

        scanner.close();
    }
}