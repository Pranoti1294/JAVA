import java.util.Scanner;
public class grade 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int g = sc.nextInt();

        if(g>=85)
        {
            System.out.println("Grade A");
        }
        else if(g>=75 && g<85)
        {
            System.out.println("Grade B");
        }
        else if(g>=65 && g<75)
        {
            System.out.println("Grade C");
        }
        else if(g>=45 && g<65)
        {
            System.out.println("Grade E");
        }
        else 
        {
            System.out.println("Failed");
        }

        sc.close();

    }

}
