public class IfElseCondition
{
    public static void main(String[] args)
    {
        int a1 = 100;
        int b1 = 100;

        if(a1>b1)
        {
            System.out.println("a1 is greater than b1");
        }
        else
        {
            System.out.println("b1 is greater than a1");
        }

        //Find the greatest number between them
        int c1 = 100;
        int d1 = 200;
        int e1 = 300;

        if(c1>d1 & c1>e1)
        {
            System.out.println("c1 is the greatest!");
        }
        else if (d1 > e1)
        {
            System.out.println("d1 is the greatest!");
        }
        else
        {
            System.out.println("e1 is the greatest!");
        }
    }
}
