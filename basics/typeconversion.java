class typeconversion
{
    public static void main(String[] args)
    {
        System.out.println("int to byte");
        int a = 258;
        byte b = (byte)a;
        System.out.println("int="+a);
        System.out.println("byte="+b);

        System.out.println("float to int");
        float c = 5.7f;
        int d = (int)c;
        System.out.println("float="+c);
        System.out.println("int="+d);

        System.out.println("Type Promotion");
        byte e = 35;
        byte f = 40;
        int result = e*f;
        System.out.println("e="+e);
        System.out.println("f="+f);
        System.out.println("result in integer = "+result);


    }
}