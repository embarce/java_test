package Test.hongbao;

import java.util.ArrayList;

public class QunZhu extends User {
    /*
        群主的构造方法
     */
    public QunZhu(String userName, double money) {
        super(userName, money);
    }

    public QunZhu(){

    }
/*
 发红包的方法
 */
    public ArrayList<Double> faHongbao(double money, int leangth){
        ArrayList<Double> redList=new ArrayList<>();
        double lefMoney=super.getMoney();
        /*
        判断余额
         */
        if(lefMoney<money){
            System.out.println("余额不足");
            return redList;
        }
        /*
        发红包余额减少。
         */
        super.setMoney(lefMoney-money);
        double avg=money/leangth;
        double mod=money%leangth;

        for (int i = 0; i <leangth-1 ; i++) {
                redList.add(avg);
        }
        double last=avg+mod;
        redList.add(last);
        return redList;
    }
}
