class empl{
    int empid;
    String empname;
    int salary;
    empl(int d,int sa,String s)
    {
        empid=d;
        empname=s;
        salary=sa;
    }
    void display()
    {
        System.out.println("employee Id:"+empid);
        System.out.println("employee Name:"+empname);
        System.out.println("employee Name:"+salary);
    }
}
public class employee {
    public static void main(String[] args) {
        empl oby=new empl(51,1200,"abi");
        oby.display();
        empl obj=new empl(2000,1500,"sri");
        obj.display();

    }
}
