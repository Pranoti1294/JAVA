import java.util.*;
public class date {
    public static void main(String[] args) {
        Date d = new Date();

        int day=d.getDate();
        int month=d.getMonth()+1;
        int year=d.getYear()+1900;

        System.out.printf("%d / %d / %d",day,month,year);
        
    }
}
