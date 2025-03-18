// public class car1 {
//     public void Accelerate()
//     {
//         System.out.println("Speed to move forward");
//     }
//     public void Brake()
//     {
//         System.out.println("Stop move forward");
//     }
//     public void Clutch()
//     {
//         System.out.println("Start to move forward");
//     }
// }







abstract class carr
{
    abstract void Accelerate();
    abstract void Brake();
    abstract void Clutch();
}
public class car1 extends carr{
    public void Accelerate()
    {
        System.out.println("Speed to move forward");
    }
    public void Brake()
    {
        System.out.println("Stop move forward");
    }
    public void Clutch()
    {
        System.out.println("Start to move forward");
    }
}
