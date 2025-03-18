abstract class mark2{
   
    abstract void getpercentage();
 }
 class AA extends mark2{
     int m1;
     int m2;
     int m3;
     AA(int mark1,int mark,int mark3)
     {
         this.m1=mark1;
         this.m2=mark;
         this.m3=mark3;
     }
     // @Override
     void getpercentage()
     {
         float percentage = ((float) (m1 + m2 + m3) / 300) * 100;
         System.out.println("Percentage of Student A: " + String.format("%.2f",percentage )+ "%");
     }
 }
 class BB extends mark2{
     int m1;
     int m2;
     int m3;
     int m4;
     BB(int mark1,int mark,int mark3,int mark4)
     {
         this.m1=mark1;
         this.m2=mark;
         this.m3=mark3;
         this.m4=mark4;
     }
     // @Override
     void getpercentage(){
         float percentage = ((float) (m1 + m2 + m3 + m4) / 400) * 100;
         System.out.println("Percentage of Student B: " + String.format("%.2f",percentage) + "%");
     }
 }
 public class my{
     public static void main(String[] args) {
         AA obj=new AA(95,85,75);
         obj.getpercentage();
         BB ob=new BB(85,77,92,93);
         ob.getpercentage();
     }
 }
