package Digital_factory;

import java.util.Arrays;

/**
 * 2.	字符串“1,2,3,4,5,6,7”，根据“，”分开，将其转化为字符串数组，并在控制台打印。
 */
public class String_Test02 {
    public static void main(String[] args) {
        String str = "1,2,3,4,5,6,7";
        //分割字符串
        String[] split = str.split(",");
        for (int i = 0; i < split.length; i++) {
            System.out.print(split[i] + " ");
        }
    }
}
