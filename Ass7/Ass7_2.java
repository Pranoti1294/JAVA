public class Ass7_2 {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int b[]={1,2,3,4,5};
        int eq=0;
        for(int i=0;i<a.length;i++)
        {
           
                if(a[i]==b[i])
                eq++;
                //System.out.println(eq);

        }
        if(eq==a.length)System.out.println("Equality");
        else System.out.println("Not having equality here");
    }
}
