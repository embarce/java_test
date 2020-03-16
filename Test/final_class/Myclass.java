package Test.final_class;
/*
对于类和方法来说final和abstract是不可以同时使用。
当final关键字修饰一个类的时候
格式：
public final class 类名称{
//....
}
含义：这个类不能有任何的子类。（相当于太监）
注意：一个类如果是final，那么其中所有成员方法都无法重写覆盖
当final修饰一个方法的时候，这个方法就是最终方法，不能被覆盖重写
格式：
修饰符 final 返回值类型 方法名（参数列表）{
//方法体
}
当final用来修饰局部变量，不能改变。
对于基本类型来说，不可变是数据不可变
对于引用类型来说，不可变是指地址不可变
当final修饰成员变量，必须手动复制，不会用默认值。
 */
public final class Myclass {

    public void method(){
        System.out.println("final method 方法执行");
    }

}
