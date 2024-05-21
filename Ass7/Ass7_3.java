public class Ass7_3 {
    public static int callNextEle(int d,int a[])
    {
        //System.out.println(d);
        for(int i=0;i<a.length;i++)
        {
            //System.out.println(a[i]);
            if(d==a[i])return a[i];
        }
        return 0;
    }
    public static void main(String[] args) {
        int a[]={1,3,2,4,6,4,1,5};
        int d=9;
        for(int i=0;i<a.length;i++)
        {
            int res=0;
            if(a[i]<d)
            {
                int m,n;
                m=Math.abs(a[i]-d);
                n=callNextEle(m,a);
                res=a[i]+n;//System.out.println(res+" "+m+" "+n);
                if(res==d)System.out.printf("%d + %d = %d\n",a[i],n,d);
            }

            
        }
        
    }
}
