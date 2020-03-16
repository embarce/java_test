package Test.InterFace;
/*
如果接口实现类，或者父类的子类只需要使用唯一的一次
那么这种情况就可以忽略该类的定义，而改为使用匿名内部类。
匿名内部类的定义格式：
接口名称 对象名 =new 接口名称(){
//覆盖方法
};
注意不要丢了:这个符号
1.new 代表创建对象动作
2.接口名称就是匿名内部类需要实现的那个接口
3.｛...｝才是匿名内部类的内容
注意：
1.匿名内部类是一次性的，在创建对象的时候只能使用唯一一次
2.如果省略了对象名字，是不可以调用两个方法的。
3.匿名内部类是省略了【实现类】，但是匿名对象是省略了【对象名称】
 */
public class demo {
    public static void main(String[] args) {
/*        MyInterface impl=new MyInterfaceImpl();
        impl.method();*/
        MyInterface impl1=new MyInterface() {
            @Override
            public void method() {
                System.out.println("匿名内部类方法");
            }
        };
        impl1.method();
    }
}
