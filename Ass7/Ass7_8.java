public class Ass7_8 {
    public static void main(String[] args) {
        
        //int arr[]={5,14,35,89,140};
        int arr[]={1,2,3,4,5,6,7};

        int avgcounter;
        int avg[]=new int[arr.length-2];

        avgcounter=0;
        for(int i=0;i<arr.length-2;i++) {

            int average;
            int sum=0;
            for(int j=i;j<(i+3);j++)
            {
                sum+=arr[j];
            }

            average=sum/3;
            avg[avgcounter]=average;
            avgcounter++;
            
        }

        for(int i=0;i<avg.length;i++)
        {
            System.out.println(avg[i]);
        }

    }
}
