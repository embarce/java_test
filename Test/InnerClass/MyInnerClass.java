package Test.InnerClass;
/*
如果一个事物内部包含另一个事务那么这就是一个类内部包含另一个类，内部类。
例如：汽车和发动机
分类：
1.成员内部类
2.局部内部类（包含匿名内部类）

成员内部类的定义格式：
修饰符 class 外部类名称{
     修饰符 class 内部类名称{
        //
     }
}
注意 内用外，随意访问；外用内需要内部对象
************************************************
如何使用呢？
间接方式：在外部类的方法当中，使用内部类，然后main只是调用外部方法
直接方式：公式：
外部类.内部类 对象名称 =new 外部类().new 内部类名称();

如果一个类是定义在一个类的方法里面，那么他就是一个局部内部类
只能当前方法才可以使用它。如果希望访问所在方法的局部变量，那么这个局部变量必须是[有效final的]
格式：
修饰符 class 外部类名称{
    修饰符 返回值类型 外部类方法名称（参数列表）{
        class 局部类名称{
            //
        }
    }
}
定义一个类的时候的权限修饰符：
public>protected>(default)>private
定义一个类的时候的权限修饰规则：
1.外部类：public /default
2.成员内部类：public/protected/(default)/private
3.局部内部类：什么都不能写，只能自己访问。
 */
public class MyInnerClass {
    public static void main(String[] args) {
        Body body=new Body();
        body.methodBody();
        System.out.println("==============================");
        Body.Heart body1=new Body().new Heart();
        body1.beat("蹦蹦");
        body1.showNum();
    }
}
