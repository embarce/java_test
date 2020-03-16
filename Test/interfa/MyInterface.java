package Test.interfa;
/*
接口：
接口就是多个类的公共规范。
接口是一种引用数据类型，最重要的内容就是抽象方法

如何定义一个接口：
public interface 接口名称{
 //接口内容
}
接口文件还是.java-->.class
java7包含常量和抽象方法
java8额外包含默认方法和静态方法
java9还可以额外包含私有方法

接口当中的抽象方法，修饰符必须是 public abstract
到时可以选择性忽略

接口使用：
1.接口不能直接使用，必须有一个“实现类”来实现接口。
格式：
public class 实现类的名称 implements 接口名称{
 //......
}
2.接口实现必须覆盖重写接口中的所有抽象方法。
3.创建实现类的对象，进行使用

注意：
如果实现类并没有覆盖所有的抽象方法，那么这个实现类自己必须就是抽象类。


从java 8开始接口允许使用默认方法和静态方法
格式：
public default 返回值类型 方法名称（参数列表）{
}
这个接口的默认方法是用来解决接口升级的问题。
如果在接口离再加入新的抽象方法，之前的实现类就会报错。
所以引用了default，注意接口的默认方法也可以被实现类覆盖重写。
静态方法：
public static 返回值类型 方法名称(参数){
//
}
注意：不能通过实现类来调用接口的静态方法，需要用接口.方法名
java 9
如果需要公用一个方法，用两个解决两个默认方法重复代码的问题。
但是这个方法不应该给实现类用，应该私有化。
格式
private 返回值类型 方法名称(参数列表){
    方法体
}
接口还可以定义成员变量：也就是常量。
这个成员变量必须使用public static final 来定义修饰。一旦使用final，证明不可改变。
格式：
public static final 数据类型 常量名称 =数值类型
注意：成员变量必须赋值。变量规范全大写idea可以用shift+f6 遇到多单词你可以用下划线来分割
*/
public interface MyInterface {
    public static final int NUM =10;
    public abstract void methodAbs();
    abstract void method1();
    public void method2();
    void method3();
    //调用默认方法，如果实现类没有会向上找接口里面的默认方法
    public default void method4(){
        System.out.println("实现了默认方法");
    }
    public static void method5(){
        System.out.println("实现了静态方法");
    }
    public default void methodA(){
        System.out.println("实现了默认方法A");
    }
    public default void methodB(){
        System.out.println("实现了默认方法B");
    }
}
