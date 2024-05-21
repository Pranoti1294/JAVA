import java.util.Date;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public boolean isValid() {
        if (year < 1 || month < 1 || month > 12 || day < 1)
            return false;

        Calendar calendar = Calendar.getInstance();
        calendar.setLenient(false);
        calendar.set(year, month - 1, 1); // month is zero-based in Calendar
        int lastDayOfMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        return day <= lastDayOfMonth;
    }

    public int getDayOfWeek() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day); // month is zero-based in Calendar
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        return (dayOfWeek + 6) % 7; // Adjusting day of week to start from Sunday (0)
    }

    public boolean isLeapYear() {
        if (year % 400 == 0)
            return true;
        if (year % 100 == 0)
            return false;
        return year % 4 == 0;
    }

public class Ass5_9 {

    public static void main(String[] args) {
        Date date = new Date(29, 2, 2024);
        System.out.println("Date is valid: " + date.isValid());
        System.out.println("Day of the week: " + date.getDayOfWeek());
        System.out.println("Is leap year: " + date.isLeapYear());

    }
}
