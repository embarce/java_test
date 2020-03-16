package Test.interfa;

public class Demo_MyInterFace {
    public static void main(String[] args) {
        //这是错误写法，这样会报错的各位
       // MyInterface inter=new MyInterface();
        //需要的是创建实现类对象
        MyInterfaceImpl inter=new MyInterfaceImpl();
        inter.method1();
        inter.method2();
        inter.method3();
        inter.method4();
        MyInterface.method5();
        System.out.println(MyInterface.NUM);
    }
}
