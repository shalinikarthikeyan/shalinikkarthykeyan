class calculator
{
    int add(int a,int b)
    {
       return a+b;
    }
    double add(double a,double b)
    {
       return a+b;
    }
}
public class overload {
    public static void main(String[] args) {
        calculator c=new calculator();
        System.out.println(c.add(10.23, 2.33));
        System.out.println(c.add(10, 2));
    }
}
