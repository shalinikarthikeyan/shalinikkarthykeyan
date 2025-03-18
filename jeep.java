import java.util.Scanner;

class cycle{
    int gears;
    int speed;
}
class mountainbike extends cycle{
    int seatheight;
    void display(int gears,int speed,int seatheight){
    System.out.println("No.of gears are "+gears);
    System.out.println("speed of bicycle is "+speed);
    System.out.println("seat height is "+seatheight);
}}
public class jeep {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int  speed=sc.nextInt();
        int gear=sc.nextInt();
        int seatHeight=sc.nextInt();
        mountainbike mh=new mountainbike();
        mh.display(gear,speed,seatHeight);
    }
}