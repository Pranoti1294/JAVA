import java.util.Scanner;

public class Ass8_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int a[]=new int[size];
        for(int i=0;i<size;i++)
        {
            a[i]=sc.nextInt();
        }
        int sum=0;
        System.out.print("Contents of Array:");
        for(int i=0;i<size;i++)
        {
            System.out.print(" "+a[i]);
            sum+=a[i];
        }
        System.out.println("\nSum of Array:"+sum);
        System.out.println("Average of Array:"+(sum/size));

        int min=a[0],max=a[0];

        for (int i=0;i<a.length;i++)
        {
            if(a[i]>max) max=a[i];
            if (a[i]<min) min=a[i] ;          
            
        }
        System.out.println("Largest element in Array: " +max);
        System.out.println("Smallest element in Array: "+min);
        System.out.print("Sorted Array:");
        for(int i=0;i<a.length;i++)
        {
            for (int j = i + 1; j <a.length; j++)   
            {  
                int tmp = 0;   
                if (a[i] > a[j])   
                {  
                tmp = a[i];  
                a[i] = a[j];  
                a[j] = tmp;  
                }
                
            }  
            System.out.print(a[i]+" ");
        }



    }
}
