package Test.laptop;

public class PC {
    public void powerOn(){
        System.out.println("PC启动");
    }
    public void powerOff(){
        System.out.println("PC关闭");
    }
    //使用usb设备
    public void useDevice(USB usb){
        usb.open();
        if(usb instanceof Mouse){
            Mouse mouse=(Mouse)usb;
            ((Mouse) usb).click();
        }else if(usb instanceof Keyboard){
            Keyboard keyboard=(Keyboard)usb;
            ((Keyboard) usb).input();
        }
        usb.off();
    }
}
