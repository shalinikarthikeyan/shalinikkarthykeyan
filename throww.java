public class throww{
    void check_Age(int age){
    
        if(age<18){
            throw new ArithmeticException("Age must be greater");
        }
        else{
            System.out.println("Access Granted");
        }
    }
    public static void main(String[] args) {
        throww t=new throww();
        try{
            t.check_Age(16);
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("hi");
    }
    
}