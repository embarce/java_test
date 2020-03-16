package Test.laptop;

public class Demo {
    public static void main(String[] args) {
        PC pc=new PC();
        pc.powerOn();
        //生成设备
        USB usb=new Mouse();
        //插入设备
        pc.useDevice(usb);
        //键盘
        Keyboard usbKeyboard=new Keyboard();
        pc.useDevice(usbKeyboard);
        pc.powerOff();
    }
}
