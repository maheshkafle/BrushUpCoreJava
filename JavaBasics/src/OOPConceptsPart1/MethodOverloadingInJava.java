package OOPConceptsPart1;

public class MethodOverloadingInJava
{
    /*
    * Method Overloading
    * When the method name is same with different arguments/input parameters within same class or same arguments/input parameters with different data type
    *
    *
    * We can overload main() method also
    * We cannot create method inside method
    * Duplicate methods are not allowed ie. same method name with same no. of arguments and of same data type
    * */
    public static void main(String[] args)
    {
        MethodOverloadingInJava obj = new MethodOverloadingInJava();
        obj.sum();
        obj.sum(7);
        obj.sum(8, 9);
    }
    public static void main(int h, int q)
    {

    }
    public void sum()
    {
        System.out.println("Inside sum method with 0 argument/input param");
    }
    public void sum(int i)
    {
        System.out.println("Inside sum method with 1 argument/input param of integer type");
    }
    public void sum(double d)
    {
        System.out.println("Inside sum method with 1 argument/input param of double type");
    }
    public void sum(int i, int j)
    {
        System.out.println("Inside sum method with 2 arguments/input params of int type");
    }
}
