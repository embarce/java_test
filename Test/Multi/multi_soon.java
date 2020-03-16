package Test.Multi;

public class multi_soon extends multi_father {
    @Override
    public void method(){
        System.out.println("子类方法");
    }
    int num=20;
    public void methodA(){
        System.out.println(this.num);
    }
    public void methodB(){
        System.out.println("子类特有方法");
    }
}
