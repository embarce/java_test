package Test.String;
/*
分割字符串：
public String [] split(String regex);
将按照字符参数的规则，将字符串切分。
split的方法其实是一个正则表达式。
如果想区分"."得用\\.
 */
public class String_Demo02 {
    public static void main(String[] args) {
        String str1="aaa,bbb,ccc";
        /*
        不能区分"."
         */
        String[] split1 = str1.split(",");
        for (int i = 0; i <split1.length ; i++) {
            System.out.println(split1[i]);
        }
        String str2="aaa.bbb.ccc";
        String[] split2 = str2.split("\\.");
        for (int i = 0; i <split2.length ; i++) {
            System.out.println(split2[i]);
        }
    }
}
