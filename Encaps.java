class human
{
    private String name="Jimmy";
    private int reg_no=139;
    
    String Whats_your_Name()
    {
        return name;
    }
    int Whats_your_Reg()
    {
        return reg_no;
    }
}
public class Encaps {
    public static void main(String[] args) {
    human h=new human();
    System.out.println(h.Whats_your_Name());
    System.out.println(h.Whats_your_Reg());
    }
    
}
