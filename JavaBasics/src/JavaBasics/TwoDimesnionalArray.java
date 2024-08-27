package JavaBasics;

public class TwoDimesnionalArray
{
    public static void main(String[] args)
    {
        int a[][] = new int[2][2];
        System.out.println("No. of Rows");
        System.out.println(a.length);
        System.out.println("No. of Columns");
        System.out.println(a[0].length);

        //First Row
        a[0][0] = 10;
        a[0][1] = 29;

        //Second Row
        a[1][0] = 33;
        a[1] [1] = 47;

        //print specific location
        System.out.println("------------------");
        System.out.println(a[1][0]);

        System.out.println("------Print all the value in two dim array-----");
        for(int row=0;row<a.length;row++){
            for (int col=0; col<a[0].length;col++)
            {
                System.out.println(a[row][col]);
            }
        }
    }
}
