import java.util.Scanner;
class human{
    private String name;
    private int age;
    public void setAge(int a){
        age=a;
    }
    public void setName(String n){
        name=n;
    }
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
}
public class encap{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        human h1 = new human();
        System.out.println("Enter Age: ");
        h1.setAge(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Enter Name: ");
        h1.setName(scanner.next());
        System.out.println(h1.getAge()+":"+h1.getName());

    }
}