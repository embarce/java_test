package Test.ArrayList;

import java.util.ArrayList;
import java.util.Random;

/*
  用一个集合存入20个随机数字，然后筛选偶数，放入小集合中。
 */
public class ArrayListReturn {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        Random r=new Random(100);
        for(int i=0;i<20;i++){
            list.add(r.nextInt(100)+1);
            System.out.print(list.get(i)+" ");
        }
        ArrayList<Integer> small=smallArrayList(list);
        for (int i = 0; i < small.size(); i++) {
            System.out.print(small.get(i)+" ");
        }

    }
    public static ArrayList<Integer> smallArrayList(ArrayList<Integer> list){
        ArrayList<Integer> small=new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)%2==0){
                small.add(list.get(i));
            }
        }
        return small;
    }
}
