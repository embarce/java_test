package Test.laptop;

public class Keyboard implements USB{
    @Override
    public void open() {
        System.out.println("键盘连接");
    }

    @Override
    public void off() {
        System.out.println("键盘拔出");
    }
    public void input(){
        System.out.println("键盘输入");
    }
}
