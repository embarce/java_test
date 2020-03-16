package Digital_factory;

import java.util.*;

/**
 * 1.建立一个实体类Student类，属性：姓名，年龄，成绩，班级
 * 建立一个list1，包含 “张三，18岁，80分，1班”，“李四，19岁，100分，1班”，“王五，17岁，59分，1班”。
 * 建立一个list2，包含 “赵六，18岁，85分，2班”，“刘七，19岁，93分，2班”，“孙八，17岁，55分，2班”。
 * （1）整合两个map学生信息成一个新的map
 * （2）按照分数给出学生信息排名
 * （3）输出不及格的学生信息
 * （4）查找张三的信息
 * （5）从map剔除年龄大于18岁的学生信息
 * 使用Map来完成
 *
 * @author 72937
 * 2020年3月4日 20:35:08
 */
public class MapDemo {
    public static void main(String[] args) {
        //建立map1
        Map<Integer, Student> map1 = new HashMap<>();
        map1.put(1, new Student("张三", 18, 80, 1));
        map1.put(2, new Student("李四", 19, 100, 1));
        map1.put(3, new Student("王五", 17, 59, 1));
        //建立map2
        Map<Integer, Student> map2 = new HashMap<>();
        map2.put(4, new Student("赵六", 18, 85, 2));
        map2.put(5, new Student("刘七", 19, 95, 2));
        map2.put(6, new Student("孙八", 17, 55, 2));
        //合并两个map
        map1.putAll(map2);
        map1.forEach((t, v) -> System.out.println(t + " Student : " + v));
        System.out.println("---------------2--------------------->");
        //这里将map1.entrySet()转换成list
        List<Map.Entry<Integer, Student>> list = new ArrayList<Map.Entry<Integer, Student>>(map1.entrySet());
        //然后通过比较器来实现排序
        Collections.sort(list, new Comparator<Map.Entry<Integer, Student>>() {
            @Override
            public int compare(Map.Entry<Integer, Student> o1, Map.Entry<Integer, Student> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });
        for (Map.Entry<Integer, Student> studentEntry : list) {
            System.out.println(studentEntry.getKey() + ":" + studentEntry.getValue());
        }
        System.out.println("---------------3--------------------->");
        //输出不及格的
        for (Map.Entry<Integer, Student> studentEntry : list) {
            if (studentEntry.getValue().getSocre() < 60) {
                System.out.println(studentEntry);
            }
        }
        System.out.println("---------------4--------------------->");
        //输出张三
        for (Map.Entry<Integer, Student> studentEntry : list) {
            if ("张三".equals(studentEntry.getValue().getName())) {
                System.out.println(studentEntry);
            }
        }
        System.out.println("---------------5--------------------->");
        //剔除大于18的学生
        for (Map.Entry<Integer, Student> studentEntry : list) {
            if (studentEntry.getValue().getAge() > 18) {
                map1.remove(studentEntry.getKey());
            }
        }
        map1.forEach((t, s) -> System.out.println(t + "--->" + s));
    }

}
