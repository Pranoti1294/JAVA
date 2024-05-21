import java.util.Scanner;

public class Ass9_4 extends Exception{
    public static void main(String[] args) {
        
        int num1, num2, num3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num1 : ");
        num1 = sc.nextInt();
        System.out.println("Enter a num2 : ");
        num2 = sc.nextInt();

        int a[] = new int[3];

        try {
            
            num3 = num1 / num2;
            System.out.println("Division: " +num3);
            System.out.println("Enter index: ");
            int index = sc.nextInt();
            System.out.println("Array value : "+a[index]);
        } 
        catch(ArithmeticException ae)
        {
            ae.printStackTrace();
        }
        catch(ArrayIndexOutOfBoundsException ae)
        {
           ae.printStackTrace(); 
        }
        catch (Exception e) {

            e.printStackTrace();
            
        }
    }
}
