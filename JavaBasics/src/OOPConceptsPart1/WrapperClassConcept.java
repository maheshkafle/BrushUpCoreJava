package OOPConceptsPart1;

public class WrapperClassConcept
{
    public static void main(String[] args)
    {
        String x = "100";
        System.out.println(x+20);

        //Data conversion: String to Int
        int i = Integer.parseInt(x);
        System.out.println(i+20);

        //Data conversion: String to double
        String d1 = "10.33";
        double d = Double.parseDouble(d1);
        System.out.println(d+11.33);

        //Data conversion: Sting to boolean
        String bool = "true";
        Boolean b1 = Boolean.parseBoolean(bool);
        System.out.println(!b1);

        //Data conversion: int to string
        int j = 200;
        System.out.println(j+20);

        String s = String.valueOf(j);
        System.out.println(s+20);

        /*
        What is numberFormat Exception in Java
        If a string that user wants to convert is not a pure number or integer then we get NumberFormat Exception
        String u = "200A";
        int i1 = Integer.parseInt(u);
        System.out.println(i1);
        */
    }
}
