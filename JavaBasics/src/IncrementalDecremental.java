public class IncrementalDecremental
{
    public static void main(String[] args)
    {
        //++
        //--
        System.out.println("---Post Increment----");
        int i = 1;
        int j = i++; //Post increment

        /*
            Post increment means first assign a 'right hand side variable' value to 'left hand side variable'
            and then increase 'right hand side variable' value after assignment
         */
        System.out.println(i); //Hint: Output 2
        System.out.println(j); //Hint: Output 1

        System.out.println("---Pre Increment----");
        int a = 1;
        int b = ++a; //pre increment
        /*
            Pre increment means first increase 'right hand side variable' value
            and then assign a 'right hand side variable' value to 'left hand side variable'
         */
        System.out.println(a); //Hint: Run and check the output
        System.out.println(b); //Hint: Run and check the output

        System.out.println("---Post Decrement----");
        int m =2;
        int n = m--;
        System.out.println(m);
        System.out.println(n);

        System.out.println("---Pre Decrement----");
        int c =2;
        int d = --c;
        System.out.println(c);
        System.out.println(d);
    }
}
