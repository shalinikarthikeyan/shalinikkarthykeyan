class Over
{
    void add(int a,int b)
    {
        System.out.println(a+b);
    }
    void add(double a,double b)
    {
        System.out.println(a-b);
    }
    void add(int a,int b,int c)
    {
        System.out.println(a+b+c);
    }
}
public class Overloading {
    public static void main(String[] args) {
        Over o=new Over();
        o.add(5.0,3.0);
        o.add(5,6);
        
    }
}
