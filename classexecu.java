class a{
   public void display()
   {
    System.out.println("HI");
   }
   private void show()
   {
    System.out.println("HELLO");
   }
   protected void print()
   {
    System.out.println("print");
    show();
   }
}


public class classexecu {
    public static void main(String[] args) {
        a obj=new a();
        obj.display();
        //obj.show();
        obj.print();
    }
}
