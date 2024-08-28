package OOPConceptsPart1;

public class StaticAndNonStaticConcept
{
    String name = "Stefan"; //non static global var
    static int age = 45;    //static global var
    public static void main(String[] args)
    {
        //How to call static methods and vars
        //1. Direct call
        sum(15, 8);
        //2. by using classname
        StaticAndNonStaticConcept.sum(1,9);

        //How to call non-static methods and vars
        //1. By using object of this class
        StaticAndNonStaticConcept obj = new StaticAndNonStaticConcept();
        obj.sendMail();
        System.out.println(obj.name);

    }
    public void sendMail()     //nonstatic method
    {
        System.out.println("Send Mail Method");
    }
    public static void sum(int a, int b)   //static method
    {
        System.out.println("Total Sum: "+(a+b));
    }
}
