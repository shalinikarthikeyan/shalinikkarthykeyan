class main{
    int i=0;
    main(int i)
    {
        this.i=i;
    }
    void show()
    {
        int i=10;
        System.out.println(this.i);
        System.out.println(i);
    }
}

public class kthis {
    public static void main(String[] args) {
        main m=new main(100);
        m.show();
    }
}
