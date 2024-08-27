package OOPConceptsPart1;

public class LocalVsGlobalVars
{
    //Global vars - class variable
    String name = "Tom";
    int age = 25;
    public static void main(String[] args)
    {
        int i = 10; //local variable of main method
        System.out.println(i);

        LocalVsGlobalVars obj = new LocalVsGlobalVars();
        System.out.println(obj.name);
        System.out.println(obj.age);
    }
    public static void sum()
    {
        int i = 15; //local variable of sum method
        int j = 20;
    }
}
