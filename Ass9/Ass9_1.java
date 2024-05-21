import java.util.Scanner;

public class Ass9_1 {
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        try{

            System.out.println("Enter a num1:");
            int num1=sc.nextInt();
            System.out.println("Enter a num2:");
            int num2=sc.nextInt();
            int num3=num1/num2;
            System.out.println("Division :"+num3);

        }catch(ArithmeticException e )
        {
            e.printStackTrace();
            System.out.println("Zero divide by exception..");
        }

    }
}
