public class Ass7_4 {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5},j=a.length-1;
        int b[]=new int[5];
        //System.out.println(a.length-1);
        for(int i=0;i<a.length;i++)
        {
            b[j]=a[i];
            //System.out.println(a[i]+"   "+b[j]);
            j--;
        }
        for(int i=0;i<=b.length-1;i++)
        {
            System.out.println(b[i]);
        }
    }
}
