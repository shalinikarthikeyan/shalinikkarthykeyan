class Animal
{
    void makessound()
    {
        System.out.println("Nothing");
    }
}
@Overriding
class Dog extends Animal
{
    void makessound()
    {
        System.out.println("Bark");
    }
}
@Overriding
class cat extends Animal
{
    void makessound()
    {
        System.out.println("meow");
    }
}
public class overrid {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.makessound();
        cat c=new cat();
        c.makessound();
    }
}
