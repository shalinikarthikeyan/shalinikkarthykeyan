public class tryy {
    public static void main(String[] args) {
        int a=10;
        int b=5;
        try
        {
            System.out.println(a/b);
            System.out.println("operation done");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        // finally
        // {
            // System.out.println("operation done");
        // }
    }
}