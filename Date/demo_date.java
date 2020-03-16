package Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class demo_date {
    public static void main(String[] args) throws ParseException {
        demo();
        demo02();
        demo03();
    }

    private static void demo03() throws ParseException {
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        Date date =new Date();
        System.out.println("现在是"+simpleDateFormat.format(date));
        long date1=date.getTime();
        date1=date1+86400000;
        date=new Date(date1);
        System.out.println("明天的现在是"+simpleDateFormat.format(date));
        System.out.println("2020年02月18日 21时59分17秒");
        System.out.println("转化为"+simpleDateFormat.parse("2020年02月18日 21时59分17秒"));
    }

    private static void demo02() {
        Date date=new Date(0L);
        System.out.println(date);
    }

    private static void demo() {
        Date date =new Date();
        System.out.println(date);
    }
}
