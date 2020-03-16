package Test.demo;

import java.util.Random;
import java.util.Scanner;

public class GuestGame {
    public static void main(String[] args) {
        System.out.println("请输入你的数字 0-100");
        Random r=new Random();
        int gameNum=r.nextInt(100);
        int cont=0;
        boolean flage=true;
        while(flage){
            System.out.println("info you gussNum");
            Scanner s=new Scanner(System.in);
            int myNum=s.nextInt();
            cont++;
            if(myNum>gameNum){
                System.out.println("this NUM bigger than gamNum");
            }else if(myNum<gameNum){
                System.out.println("this NUM smaller than gamNum");
            }else {
                System.out.println("yes the NUM is "+gameNum +"you guess cont is "+cont);
                flage=false;
            }
        }

    }

}
