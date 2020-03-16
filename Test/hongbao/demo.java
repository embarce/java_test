package Test.hongbao;

import java.util.ArrayList;
import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        QunZhu qunZhu=new QunZhu("群主",100.0);
        QunYou A=new QunYou("群友一",0);
        QunYou B=new QunYou("群友二",0);
        QunYou C=new QunYou("群友三",0);

        qunZhu.show();
        A.show();
        B.show();
        C.show();
        System.out.println("===============");
        System.out.println("请输入红包大小和个数");
        Scanner s=new Scanner(System.in);
        double money=s.nextInt();
        int leangth=s.nextInt();
        ArrayList<Double> redList=qunZhu.faHongbao(money,leangth);
        A.shouHongbao(redList);
        B.shouHongbao(redList);
        C.shouHongbao(redList);
        qunZhu.show();
        A.show();
        B.show();
        C.show();
    }
}
