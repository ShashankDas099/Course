class switch1
{
    public static void main(String[] args)
    {
        String day = "Monday";
        switch(day.toLowerCase()){
            
            case  "sunday" : System.out.println("Today is Sunday");
            break; 
            case  "monday" : System.out.println("Today is Monday");
            break;
            case  "tuesday" : System.out.println("Today is Tuesday");
            break;
            case  "wednesday" : System.out.println("Today is Wednesday");
            break;
            case  "thrusday" : System.out.println("Today is Thrusday");
            break;
            case  "friday" : System.out.println("Today is Friday");
            break;     
            case  "saturday" : System.out.println("Today is Saturday");
            break;
            default: System.out.println("This is not a day");
        }
        
    }
}