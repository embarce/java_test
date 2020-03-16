package Date;


import java.util.Calendar;

public class Calendar_demo {
    public static void main(String[] args) {
        demo();
        set();
    }

    private static void set() {
        Calendar c=Calendar.getInstance();
        c.set(Calendar.YEAR,999);
        System.out.println(c.get(Calendar.YEAR));

    }

    private static void demo() {
        Calendar c=Calendar.getInstance();
        System.out.println(c.get(Calendar.YEAR));
    }
}
