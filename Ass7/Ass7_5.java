public class Ass7_5 {
    public static void main(String[] args) {
        int a[]={5,4,1,6,8,3,2};
        int min=a[0],max=a[0];

        for (int i=0;i<a.length;i++)
        {
            if(a[i]>max) max=a[i];
            if (a[i]<min) min=a[i] ;          
            
        }
        System.out.println(min+" <---- minimum  maximum ----> "+max);
    }
}
