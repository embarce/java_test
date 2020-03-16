package Map_doudizhu;

import java.util.*;

/*
斗地主发牌有序版
 */
public class DoudiZhu_demo {
    public static void main(String[] args) {
        //1准备牌，使用map集合放索引和牌
        HashMap<Integer,String> poker=new HashMap<>();
        //使用list集合存key值
        ArrayList<Integer> key=new ArrayList<>();
        List<String> color=Arrays.asList("♠","♥","♣","♦");
        List<String> num=Arrays.asList("2","A","K","Q","J","10","9","8","7","6","5","4","3");
        int index=0;
        poker.put(index,"JOKE");
        key.add(index);
        index++;
        poker.put(index,"joke");
        key.add(index);
        index++;
        for (String s : num) {
            for (String c : color) {
                poker.put(index,c+s);
                key.add(index);
                index++;
            }
        }
        //洗牌
        Collections.shuffle(key);
        //发牌,四个集合来定义玩家和底牌
        ArrayList<Integer> play1=new ArrayList<>();
        ArrayList<Integer> play2=new ArrayList<>();
        ArrayList<Integer> play3=new ArrayList<>();
        ArrayList<Integer> cards=new ArrayList<>();
        for (int i = 0; i <key.size() ; i++) {
            Integer integer = key.get(i);
            if(i>=51){
                cards.add(integer);
            }else if(i%3==0){
                play1.add(integer);
            }
            else if(i%3==1){
                play2.add(integer);
            }
            else if(i%3==2){
                play3.add(integer);
            }
        }
        //排好牌
        Collections.sort(play1);
        Collections.sort(play2);
        Collections.sort(play3);
        Collections.sort(cards);
        //定义看牌方法
        show("play1",poker,play1);
        show("play2",poker,play2);
        show("play3",poker,play3);
        show("cards",poker,cards);
    }
    public static void show(String name,HashMap<Integer,String> poker,ArrayList<Integer> list){
        System.out.print(name+"的手牌是 ");
        for (Integer integer : list) {
            String key=poker.get(integer);
            System.out.print(key+" ");
        }
        System.out.println();
    }
}
