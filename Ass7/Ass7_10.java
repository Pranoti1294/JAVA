import java.util.Arrays;
import java.util.Random;

public class Ass7_10 {
    public static void main(String[] args) {
        int a[]={5,14,35,90,139};
        int b[]={88,67,35,14,-12};
        int c[]={65,14,129,34,7};

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
        System.out.println();
        for(int i=0;i<b.length;i++)
        {
            for (int j = i + 1; j <b.length; j++)   
            {  
                int tmp = 0;   
                if (b[i] < b[j])   
                {  
                tmp = b[i];  
                b[i] = b[j];  
                b[j] = tmp;  
                }
                
            }  
            System.out.print(b[i]+" ");
        }

        System.out.println();
        Random rand = new Random();
		
		for (int i = 0; i < c.length; i++) {
			int randomIndexToSwap = rand.nextInt(c.length);
			int temp = c[randomIndexToSwap];
			c[randomIndexToSwap] = c[i];
			c[i] = temp;
		}
		System.out.println(Arrays.toString(c));
    }
}
