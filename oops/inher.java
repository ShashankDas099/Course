class AdvCalculator extends Calculator
{
   public double divq(int n,int m){
    return n/m;
   }
   public double divr(int n,int m){
    return n%m;
   }
   public double expo(int n,int m){
    return Math.pow(n,m);
   }
}
public class inher{
    public static void main(String[] args){
        AdvCalculator adc = new AdvCalculator();
        System.out.println("Addition: "+adc.add(2,3));
        System.out.println("Subtraction: "+adc.sub(1992,3));
        System.out.println("Multiplication: "+adc.mul(50,3));
        System.out.println("Divison Quotient: "+adc.divq(1003,5));
        System.out.println("Division Remainder: "+adc.divr(10004,3));
        System.out.println("Power: "+adc.expo(2,19));
    }
}