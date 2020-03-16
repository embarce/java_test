package Test.ArrayList;

import java.util.ArrayList;

/*定义一个以指定打印集合的方法，要求使用｛｝用@分割每个元素
｛元素@元素@元素@元素｝
 */
public class ArrayList_System_out_myMothod {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("张");
        list.add("陈");
        list.add("王");
        list.add("温");
        ArrayListPrint(list);
    }
    public static void ArrayListPrint(ArrayList<String> list){
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            String name=list.get(i);
            System.out.print(name);
            if(i!=list.size()-1){
                System.out.print("@");
            }

        }
        System.out.print("}");
    }
}
