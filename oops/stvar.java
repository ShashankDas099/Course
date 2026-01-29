class Mobile{
    String company;
    int price;
    static String type;
    public void show(){
        System.out.println("Company: "+company+",Price: "+ price+",Type: "+ type);
    }
}
public class stvar{
    public static void main(){
        Mobile.type = "Smartphone";
        Mobile obj1 = new Mobile();
        obj1.company="Apple";
        obj1.price=1500;
        obj1.show();
        Mobile obj2 = new Mobile();
        obj2.company="Samsung";
        obj2.price=1100;
        obj2.show();
    }
}