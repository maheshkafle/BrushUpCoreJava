package OOPConceptsPart1;

public class FunctionInJava
{
    //main method --> Starting point of execution
    //main method is void -> never returns any value
    public static void main(String[] args)
    {
        FunctionInJava obj = new FunctionInJava();
        //After line no 8 one object will be created, obj is the object reference variable referring to this object
        //Copy of all non static methods is given to this object
        obj.test();
        int a = obj.pqr();
        System.out.println(a);
        String s =  obj.qa();
        System.out.println(s);
        int factor = obj.division(10,5);
        System.out.println(factor);
    }
    //non static methods -> We
    //void -- doesn't return any value
    //return type = void
    public void test() //no input no output
    {
        System.out.println("Inside Test method");
    }

    public int pqr() // no input, some output
    {
        System.out.println("---Inside PQR Method---");
        int a  = 15;
        return a;
    }

    public String qa()// no input, some output
    {
        System.out.println("---Inside QA Method---");
        String s = "Selenium";
        return s;
    }

    //return type -> int
    // a, b are parameters/arguments
    public int division(int a, int b) //some input, some output
    {
        System.out.println("---Inside Division Method---");
        int c;
        c = a / b;
        return c;
    }

}
