package Lambda_Dmoe;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author 72937
 */
public class DemoPerson {
    public static void main(String[] args) {
        Person[] person={
                new Person("小明",18),
                new Person("小红",19),
                new Person("小强",20),
                new Person("小温",17)
        };
        Arrays.sort(person,(Person o1,Person o2)->{
            return o1.getAge()-o2.getAge();
        });
        for (Person person1 : person) {
            System.out.println(person1);
        }
    }
}
