package DoudeZhu;

import java.util.ArrayList;
import java.util.Collections;

/*
准备牌
洗牌
发牌
看牌
 */
public class DoidiZhu {
    public static void main(String[] args) {
        //准备牌
        ArrayList<String> poker=new ArrayList<>();
        //定义两个数组一个花色一个序号
        String[] colors={"♠","♥","♣","♦"};
        String[] num={"2","A","K","Q","J","10","9","8","7","6","5","4","3"};
        //把大王小王存到poker集合当中
        poker.add("JokerA");
        poker.add("JokerB");
        for(String number:num){
            for(String color:colors){
                poker.add(color+number);
            }
        }
        //洗牌，可以使用工具类shuffle(List<?> list)
        Collections.shuffle(poker);
        //发牌,四个集合来定义玩家和底牌
        ArrayList<String> play1=new ArrayList<>();
        ArrayList<String> play2=new ArrayList<>();
        ArrayList<String> play3=new ArrayList<>();
        ArrayList<String> cards=new ArrayList<>();
        //遍历poker集合，取模运算3，最后3张发给底牌
        for (int i = 0; i <poker.size() ; i++) {
            String s = poker.get(i);
            if(i>=51){
                cards.add(s);
            }else if(i%3==0){
                play1.add(s);
            }else if(i%3==1){
                play2.add(s);
            }
            else if(i%3==2){
                play3.add(s);
            }
        }
        System.out.println("play1："+play1);
        System.out.println("play2："+play2);
        System.out.println("play3："+play3);
        System.out.println("cards"+cards);
    }
}
