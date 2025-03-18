class book{
    String title;
    String author;
    int ISBN;
    void displaydetail(){
        System.out.println("title");
        System.out.println("author");
        System.out.println("ISBN");
    }
}
class ebook extends book{
    int filesize;
    @Override 
    void displaydetail(){
        System.out.println("File size");

    }
}
public class lib {
    public static void main(String[] args) {
       book b=new book();
       b.displaydetail();
       ebook eb=new ebook();
       eb.displaydetail(); 
    }
    
}
