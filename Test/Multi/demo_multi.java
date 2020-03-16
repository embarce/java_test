package Test.Multi;
/*
多态的好处：
无论右边换成的是什么子类对象，等号左边调用方法都不会改变。

代码中体现多态性，其实就是：父类引用指向子类对象
父类名称 对象名 =new 子类名称();
或者：接口名称 对象名 =new 实现类名称();
多态访问成员变量的方式有两种：
1.直接通过对象.来访问。看的是等号左边的类，如果没有向上找。成员变量不能覆盖重写。
2.间接通过成员方法来访问。看该方法属于谁，优先用谁，没有就向上查找。
多态的成员方法：
((multi_soon) multi).methodB();
口诀：编译看左边，运行看右边
向上转型，绝对是安全的，小范围变成大范围，缺陷：转型后，就无法调用子类特用的方法。
向下转型，把对象还原回回小范围。例子：格式 子类名称 对象名 =(子类名称)父类对象;
类似于强制类型转换，但是是还原，也就是说不能变成其他的。
((multi_soon) multi).methodB();
Instanceof关键字可以知道多态本来是什么子类
格式：对象 instanceof 类名称 得到一个boolean值 if(animal instanceof Dog){
 //
}
 */
public class demo_multi {

    public static void main(String[] args) {
        //多态写法
        //左类父类应用，指向右侧子类.主要看右边的new类，如果子类没有会向上找父类
        multi_father multi=new multi_soon();
        multi.method();
        //num=10 父类的num
        System.out.println(multi.num);
        System.out.println("***********************");
        multi.methodA();
        System.out.println("***********************");
        //multi.methodB();这样会报错，编译看左边，左边是father 里面没有methodB方法编译会报错。
        ((multi_soon) multi).methodB();
        multi.methodFu();
    }
}
