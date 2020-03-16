package Digital_factory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 1.	建立一个实体类Student类，属性：姓名，年龄，成绩，班级
 * 建立一个list1，包含 “张三，18岁，80分，1班”，“李四，19岁，100分，1班”，“王五，17岁，59分，1班”。
 * 建立一个list2，包含 “赵六，18岁，85分，2班”，“刘七，19岁，93分，2班”，“孙八，17岁，55分，2班”
 * <p>
 * （1）整合两个list学生信息成一个新的list
 * （2）按照分数给出学生信息排名
 * （3）输出不及格的学生信息
 * （4）查找张三的信息
 * （5）从list剔除年龄大于18岁的学生信息
 *
 * @author 72937
 * 2020年3月4日 20:05:31
 */
public class ListDemo {
    public static void main(String[] args) {
        //建立list1
        List<Student> list1 = new ArrayList<>();
        list1.add(new Student("张三", 18, 80, 1));
        list1.add(new Student("李四", 19, 100, 1));
        list1.add(new Student("王五", 17, 59, 1));
        //建立list2
        List<Student> list2 = new ArrayList<>();
        list2.add(new Student("赵六", 18, 85, 2));
        list2.add(new Student("刘七", 19, 93, 2));
        list2.add(new Student("孙八", 17, 55, 2));
        //整合两个list
        list1.addAll(list2);
        for (Student student : list1) {
            System.out.println(student);
        }
        System.out.println("-------------------2------------------");
        //实现工具类的自定义排序方法
        Collections.sort(list1, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int i = o2.getSocre() - o1.getSocre();
                if (i == 0) {
                    return o2.getAge() - o1.getAge();
                }
                return i;
            }
        });
        for (Student student : list1) {
            System.out.println(student);
        }
        System.out.println("-------------------3------------------");
        for (Student student : list1) {
            if (student.getSocre() < 60) {
                System.out.println(student);
            }
        }
        System.out.println("-------------------4------------------");
        for (Student student : list1) {
            if ("张三".equals(student.getName())) {
                System.out.println(student);
            }
        }
        System.out.println("-------------------5------------------");
        for (int i = list1.size() - 1; i >= 0; i--) {
            Student student = list1.get(i);
            if (student.getAge() > 18) {
                list1.remove(student);
            }
        }
        for (Student student : list1) {
            System.out.println(student);
        }
    }
}
