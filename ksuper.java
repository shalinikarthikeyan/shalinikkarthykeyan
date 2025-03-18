class Main{
    int speed=120;
}
class car extends Main{
    int speed=180;
    void display()
    {
        System.out.println(super.speed);
        System.out.println(speed);
    }
}
public class ksuper {
    public static void main(String[] args) {
        car1 m=new car1();
        m.display();
    }
    
}
