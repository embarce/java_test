package Test.ArrayList;

import java.util.ArrayList;

public class ArrayList_Student {
    public static void main(String[] args) {
        ArrayList<Student> list=new ArrayList<>();
        Student A=new Student("欧阳娜娜","女",18);
        Student B=new Student("沈腾","男",40);
        Student C=new Student("贾玲","女",30);
        Student D=new Student("温佳明","男",18);
        list.add(A);
        list.add(B);
        list.add(C);
        list.add(D);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getName());
        }
    }
}
