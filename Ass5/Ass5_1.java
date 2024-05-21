import java.text.SimpleDateFormat;
import java.util.Date;

public class Ass5_1 {

    public static void main(String[] args) {
        
        System.out.println("To convert dates: ");
        SimpleDateFormat s=new SimpleDateFormat("dd/MM/yyyy");
        Date d = new Date();
        System.out.println("Formated: "+s.format(d));

        s=new SimpleDateFormat("MM/dd/yyyy");
        System.out.println("Formated: "+s.format(d));

        s=new SimpleDateFormat("yyyy/MM/dd");
        System.out.println("Formated: "+s.format(d));

        System.out.println("To convert times: ");
        s=new SimpleDateFormat("hh:mm:ss");
        System.out.println("Formated: "+s.format(d));

        s=new SimpleDateFormat("hh:mm:ss a");
        System.out.println("Formated: "+s.format(d));

        s=new SimpleDateFormat("hh:mm");
        System.out.println("Formated: "+s.format(d));

        System.out.println("To convert dates and times: ");
        s=new SimpleDateFormat("dd/mm/yyyy hh:mm:ss");
        System.out.println("Formated: "+s.format(d));

        s=new SimpleDateFormat("mm/dd/yyyy hh:mm:ss a");
        System.out.println("Formated: "+s.format(d));

        s=new SimpleDateFormat("yyyy/mm/dd hh:mm");
        System.out.println("Formated: "+s.format(d));
        
    }
    
}
