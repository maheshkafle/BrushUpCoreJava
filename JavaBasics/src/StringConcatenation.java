public class StringConcatenation
{
    public static void main(String[] args)
    {
        System.out.println("String Concatenation");
        int a = 100;
        int b = 200;

        String x = "Hello";
        String y = "World";

        System.out.println(a+b);
        System.out.println(x+y);

        double c = 12.33;
        double d = 10.33;
        /*
        Hint:since the program execution occurs from left to right so output will be
        First int+int i.e 100+200-> 300
        then 300+x-> 300Hello
        300Hello + y -> 300HelloWorld
        */
        System.out.println(a+b+x+y);

        /*
        Hint:since the program execution occurs from left to right so output will be
        First String+String i.e Hello+World-> HelloWorld
        then HelloWorld+100-> HelloWorld100
        HelloWorld100 + 200 -> HelloWorld100200
        */
        System.out.println(x+y+a+b);

        System.out.println(x+y+(a+b));

        System.out.println(a+b+x+y+a+x+b+y);

        System.out.println(a+b+x+y+a+b);

        System.out.println(c+d);

        System.out.println(x+y+c+d);

        System.out.print("Hello Testing");

        System.out.println(" Println means print here then go to the line new -> Hello Selenium");

        

    }
}
