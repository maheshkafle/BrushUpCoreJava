package JavaBasics;

public class ArrayConcept
{
    public static void main(String[] args)
    {
        //Array: Used to store similar data type value in an array variable

        //1. Int Array
        //Lowest index starts at 0
        //Highest index is (Length of an array - 1)

        /*Disadvantages of static array
        1. Size is fixed -> Static array . To overcome this problem we use dynamic array/ Collections like ArrayList, HashTable
        2. We cannot store different data type value in static array. To overcome this problem we can use Object Array
        * */

        int i[] = new int[4];
        i[0]=0;
        i[1]=10;
        i[2]=7;
        i[3]=3;

        /*
        This gives us 'ArrayIndexOutOfBoundsException' as we are trying to access an element out of bound / beyond the length of an array
        i[4]=0;
         */

        //This will print the length/size of an Array
        System.out.println(i.length);
        //Code to print array from specific index/location
        System.out.println("--------Int array-------");
        System.out.println(i[2]);
        //Code to print all items in an array
        System.out.println("------------------");
        for(int j=0; j< i.length; j++)
        {
            System.out.println("i["+j+"]: "+(i[j]));
        }

        System.out.println("--------double array-------");
        //2 double array
        double d[] = new double[4];
        d[0]=1;
        d[1]=2;

        System.out.println(d[1]);

        System.out.println("--------char array-------");
        //3. char array
        char c[] = new char[4];
        c[0] = 'x';
        c[1] = 'y';

        System.out.println(c[1]);

        System.out.println("--------boolean array-------");
        //4. boolean array
        boolean b[] = new boolean[2];

        b[0]=true;
        b[1]=false;

        System.out.println(b[1]);

        System.out.println("--------String array-------");
        //5. Sting array
        String s[] =new String[4];
        s[0]="Hello";
        s[1]="World!";

        System.out.println(s.length);

        System.out.println("--------Object Array-------");
        //Object Array
        Object obj[] = new Object[6];
        obj[0] ="Tom";
        obj[1] ='a';
        obj[2] = "2024-08-17";
        obj[3] = true;
        obj[4] = 1;

        System.out.println(obj[2]);
    }
}
