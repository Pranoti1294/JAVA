import java.util.ArrayList;
import java.util.Comparator;

public class ArrayListDemo {
    static ArrayList<Integer> intr=null;
    private static void addRecord() 
    {
        intr = new ArrayList<>();
        
        intr.add(10);
        intr.add(70);
        intr.add(30);
        intr.add(80);
        intr.add(90);
        intr.add(60);

    }

    private static void printRecord() {
    
        for ( Integer ele : intr)
        {
            System.out.print(ele+" ");
        }
        System.out.println();
    }

    private static void findRecord(int ele) {
        int index = intr.indexOf(ele);
        System.out.println(ele+" is on index of : "+index);
        
    }

    private static void removeRecord(int index) {
        //intr.remove(index);
        System.out.println("Removed element is : "+intr.remove(index));
        printRecord();
    }

    private static void sortRecord(Comparator<Integer> c) {
       
        intr.sort(c);
        for ( Integer ele : intr)
        {
            System.out.print(ele+" ");
        }
        
    }


    public static void main(String[] args) {
        
        Comparator<Integer> c= Comparator.naturalOrder();
        ArrayListDemo.addRecord();
        ArrayListDemo.printRecord();
        ArrayListDemo.findRecord(30);
        ArrayListDemo.removeRecord(3);
        ArrayListDemo.sortRecord(c);

    }

}
