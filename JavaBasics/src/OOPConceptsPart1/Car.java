package OOPConceptsPart1;

public class Car
{
    //Class Vars
    int mod;
    int wheel;
    public static void main(String[] args)
    {
        //new Car() -> This is the object of Car class
        //new Keyword is used to create the object
        //here a, b, c are object reference variable
        Car a = new Car();
        Car b = new Car();
        Car c = new Car();

        a.mod=2015;
        a.wheel=4;

        b.mod=2014;
        b.wheel=4;

        c.mod=2013;
        c.wheel=4;

        System.out.println("-----Before Shifting of Object Reference Variable----");
        System.out.println(a.mod);
        System.out.println(b.mod);
        System.out.println(c.mod);

        System.out.println("-----After Shifting of Object Reference Variable----");
        a=b; //a started pointing to b
        b=c; //b started pointing to c
        c=a; //c started pointing to a but a is already to b from line no. 27 so c also points to b.

        a.mod=19;
        System.out.println(a.mod);
        c.mod=20;
        System.out.println(a.mod);

    }
}
