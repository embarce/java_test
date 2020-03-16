package Test.laptop;

public class Mouse implements USB {
    @Override
    public void open() {
        System.out.println("鼠标连接");
    }

    @Override
    public void off() {
        System.out.println("鼠标拔出");
    }
    public void click(){
        System.out.println("鼠标点击");
    }
}
