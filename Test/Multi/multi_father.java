package Test.Multi;

public class multi_father {
    int num=10;
    public void method(){
        System.out.println("这是父类方法");
    }
    public void methodFu(){
        System.out.println("父类特有方法");
    }
    public void methodA(){
        System.out.println(this.num);
    }
}
