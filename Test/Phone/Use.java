package Test.Phone;

import java.util.Scanner;

public class Use {
    public static void main(String[] args) {
        Phone myPhone=new Phone();
        myPhone.color="red";
        myPhone.price=2480.6;
        myPhone.brand="Iphone";
        myPhone.myPhone();
        System.out.println("call who?");
        Scanner s=new Scanner(System.in);
        String who =s.next();
        myPhone.call(who);
        myPhone.playMusic();
    }
}
