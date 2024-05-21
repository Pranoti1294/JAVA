public class Ass9_3 {
    public static void main(String[] args) {
        
        int a[] = new int[3];
        try {
            
            System.err.println(a[4]);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }
}
