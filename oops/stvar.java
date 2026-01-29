class Mobile{
    String company;
    int price;
    static String type;
    public static void show(Mobile n){
        System.out.println("Company: "+n.company+",Price: "+ n.price+",Type: "+ n.type);
    }
}
public class stvar{
    public static void main(){
        Mobile.type = "Smartphone";
        Mobile obj1 = new Mobile();
        obj1.company="Apple";
        obj1.price=1500;
        Mobile obj2 = new Mobile();
        obj2.company="Samsung";
        obj2.price=1100;
        Mobile.show(obj1);
        Mobile.show(obj2);
    }
}