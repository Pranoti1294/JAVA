public class Ass7_7 
{
    public static void main(String[] args) 
    {
        
            int d[]=new int[10];
            int a[]={23,60,94,3,102},b[]={42,16,74};
            int dl=a.length+b.length;
            int k=0;
            for(int j=0;j<a.length;j++)
            {
                d[k++]=a[j];
            }
            for(int j=0;j<b.length;j++)
            {
                d[k++]=b[j];
            }

            for(int i=0;i<dl;i++)
            {
                for (int j = i + 1; j <dl; j++)   
                {  
                    int tmp = 0;   
                    if (d[i] > d[j])   
                    {  
                    tmp = d[i];  
                    d[i] = d[j];  
                    d[j] = tmp;  
                    }
                    
                }  
            }

            for(int i=0;i<dl;i++)
            {
                System.out.println(d[i]);
            }
       
        
    
    }
}
