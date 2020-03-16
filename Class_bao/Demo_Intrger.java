package Class_bao;
/*
java是一门面向对象的语言，而基本数据类型都不是面向对象的没有属性和方法，为了解决这个问题，所以加入了包装类
包装类：
装箱：把基本类型的数据包装到包装类中（基本数据类型——>包装类）
构造方法：
Integer(int var)构造一个新分配的Integer对象，它表示指定的int值
Integer(String s)构造一个新的分配的Integer对象，它表示String参数所指向的int值
注意：传递的字符串必须是基本类型的字符串，否则会抛出异常，例如（"100"）正确，（"a"）抛出异常
static Integer valueOf(int i)返回一个表示指定的int值的Integer实例
static Integer valueOf(String i)返回保存指定的String值的Integer实例
拆箱：在包装类中取出基本类型的数据（包装类-->基本类型数据）
成员方法：int intValue() 以int类型返回该Integer的值

其实有自动装箱和拆箱：基本数据类型的数据和包装类是可以自动的相互转换
jdk1.5后支持 比如 Integer in=1;in=in+2;  比如ArraysList<Integer>存的是Integer

基本类型与字符串的相互转换：
基本类型--->字符串：
1.基本类型的值+"" 最简单的方法就是在后面加个空字符串
2.包装类的toString()方法，可以把一个基本类型的数值变成字符串
3.String的valueOf(var)方法，返回指定参数的字符串形式
字符串--->基本类型：
使用包装类的parse***("数值类型的字符串");比如Integer类 static int parseInt(String s)
 */
public class Demo_Intrger {
    public static void main(String[] args) {
        Integer in1=new Integer(1);
        Integer in2=new Integer("2");
        int a=in1.intValue();
        System.out.println(a);
        int a1=100;
        String s1=a1+"";
        System.out.println(s1+300);
        String s2 = Integer.toString(300);
        System.out.println(s2+300);
        int i = Integer.parseInt(s1);
        System.out.println(i+300);
    }
}
