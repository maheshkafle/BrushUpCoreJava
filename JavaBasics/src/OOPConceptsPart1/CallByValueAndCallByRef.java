package OOPConceptsPart1;

public class CallByValueAndCallByRef
{
    int p;
    int q;
    public static void main(String[] args)
    {
        CallByValueAndCallByRef obj = new CallByValueAndCallByRef();
        int sum = obj.testSum(); //Call By Value or Pass By Value
        System.out.println(sum);

        obj.p=50;
        obj.q=60;

        //before swap
        System.out.println("-before swap-");
        System.out.println(obj.p);
        System.out.println(obj.q);

        obj.swap(obj);
        //after swap
        System.out.println("-after swap-");
        System.out.println(obj.p);
        System.out.println(obj.q);
    }

    public int testSum()
    {
        int a=20;
        int b=40;
        int c =a + b;
        return c;
    }

    // Call by Reference
    public void swap(CallByValueAndCallByRef t)
    {
        int temp;
        temp = t.p; //temp = 50
        t.p = t.q;  //t.p = 60
        t.q= temp;  //t.q = 50
    }
}
