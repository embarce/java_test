package Test.hongbao;

import java.util.ArrayList;
import java.util.Random;

public class QunYou extends User{
    /*
    群友构造方法
     */
    public QunYou(String userName, double money) {
        super(userName, money);
    }

    public QunYou(){

    }
    /*
    收红包方法
    */
    public void shouHongbao(ArrayList<Double> hongbao){
            int index=new Random().nextInt(hongbao.size());
            /*
            随机获得第几个红包
             */
            super.setMoney(super.getMoney()+hongbao.get(index));
            /*
            修改自己的余额
             */
            hongbao.remove(index);
            /*、
            删除红包             */
    }
}
