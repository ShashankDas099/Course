
class Cal
{
    public int add(int n1,int n2)
    {
        return n1+n2 ;
    }
    public int add(int n1,int n2,int n3)
    {
        return n1+n2+n3 ;
    }
    public int add(int n1,int n2,int n3,int n4)
    {
         return n1+n2+n3+n4 ;
    }
  
}
public class metover
{
    public static void main(String[] args)
    {
        Cal cal = new Cal();
        int resadd= cal.add(6,5,7);
        System.out.println("ADDITION = "+resadd);


    }
}