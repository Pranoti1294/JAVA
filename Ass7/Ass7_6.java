public class Ass7_6 {
    public static void main(String[] args) {
        int a[]={24,54,31,16,82,45,67};
        int fmax=a[0],smax=a[0],tmax=a[0];

        for(int i=0;i<a.length;i++)
        {
            //System.out.println(a[i]);
            if(a[i]>smax || a[i]>fmax)
            {
                
                if (a[i]>fmax) {
                    tmax=smax;
                    smax=fmax;
                    fmax=a[i];
                    
                }
                else
                {
                    tmax=smax;
                    smax=a[i];
                }
                
            }
        }

        System.out.printf("%d <-----third max %d <------ second max %d <----- first max",tmax,smax,fmax);

    }
}
