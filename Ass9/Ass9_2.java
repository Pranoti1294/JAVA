public class Ass9_2 {
    public void oddException(int num1) throws Exception
    {
        if(num1%2==1)
        {
            throw new Exception("Odd number exception...");
        }
    }
    public static void main(String[] args) {
                
        try {
            Ass9_2 a=new Ass9_2();
            a.oddException(3);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
