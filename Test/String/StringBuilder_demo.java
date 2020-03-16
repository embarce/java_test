package Test.String;
/*
  StringBuilder 是一个字符串缓冲区提高字符串的效率
  构造方法：
  StringBuilder();构造一个不带任何字符串的缓冲区，初始为16个字符
  StringBuilder(String str);构造一个带字符串的缓冲区，初始化为指定的字符串内容

 */
public class StringBuilder_demo {
    public static void main(String[] args) {
        StringBuilder bu1=new StringBuilder();
        System.out.println("bu1:"+bu1);
        StringBuilder bu2 = new StringBuilder("abc");
        System.out.println("bu2:"+bu2);
        //append可以添加任意数据类型的字符串形式，并且返回当前对象自身。也就是说其实可以不用返回值
/*      bu1.append(10);
        bu1.append(8.8);
        bu1.append("hello");
        bu1.append("中");*/
        bu1.append(10).append(8.8).append("hello").append("中");
        System.out.println("bu1:"+bu1);
        //StringBuilder和String可以相互转换,StringBuilder的toString（）方法把当前StringBuilder转换为String
        String a=bu2.toString();
        System.out.println(a);
    }
}
