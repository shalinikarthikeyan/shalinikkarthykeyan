public class exception {
    public static void main(String[] args) throws coustme
    {
        {
            int age=19;
            try
            {
                if(age<18)
                {
                    throw new coustme("asdf");
                }
            }
           catch(Exception e)
            {
                System.err.println(e);
            }

        }
    }
}
