class string
{
    public static void main(String[] args)
    {
        String name = "    Shank   ";
        //boolean result =name.equalsIgnoreCase("shank");
        //int result = name.length();
        //char result = name.charAt(4);
        //int result = name.indexOf("a");
        //boolean result = name.isEmpty();
        //String result = name.toUpperCase();
        //String result = name.toLowerCase();
        //String result =name.trim();
        String result =name.replace("S","H");
        System.out.println(result);
        System.out.println(name);
    }
}