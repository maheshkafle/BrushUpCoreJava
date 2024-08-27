package JavaBasics;

public class LoopConcept
{
    public static void main(String[] args)
    {
        /*
        Print 100 numbers:
        we don't write System.out.println(1)..100 times. Instead we use loops in Java.
        */

        //1. Print Top 10 integers using while loop
        System.out.println("----While Loop------");
        int i = 1;      //Initialization
        while(i<=10)    //Conditional
        {
            System.out.println(i);
            i++;        //Incremental or Decremental
        }

        /*Disadvantage of while loop
            If we don't write incremental part in line no. 15 then it goes into infinite loop
        */

        //2. For loop
        System.out.println("----For Loop------");
        for(int j=1; j<=10; j++)  //initialization, conditional and incremental or decremental
        {
            System.out.println(j);
        }

        System.out.println("------Print 10 to 1 using For loop------");
        //Question; Print 10 to 1 using For loop
        for(int k=10;k>=1; k--)
        {
            System.out.println(k);
        }

        System.out.println("------Print 10 to 0 using while loop------");
        //Question; Print 10 to 0 using while loop
        int l=10;
        while(l>=0)
        {
            System.out.println(l);
            l--;
        }
    }
}
