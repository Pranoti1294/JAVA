import java.util.Calendar;

public class calendar {
    public static void main(String[] args) {
        
        Calendar c=Calendar.getInstance();

        int day=c.get(Calendar.DAY_OF_MONTH);
        int month=c.get(Calendar.MONTH)+1;
        int year=c.get(Calendar.YEAR);
        
        System.out.printf("%d / %d / %d",day,month,year);



    }
    
}
