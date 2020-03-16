package Digital_factory;

import java.util.LinkedList;
import java.util.List;

/**
 * 2.	数组{1,2,3,4,5,5,5,5,5,6,7,8,9}，去掉数组中的5 生成新的数组。
 */
public class Arrays_Test02 {
    public static void main(String[] args) {
        int[] arrays = {1, 2, 3, 4, 5, 5, 5, 5, 5, 6, 7, 8, 9};
        int count = 0;
        //记录5的个数
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] == 5) {
                count++;
            }
        }
        //新建一个数组来放没有5的数组
        int[] list = new int[arrays.length - count];
        for (int i = 0, j = 0; i < arrays.length; i++) {
            //不是5就存入数组
            if (arrays[i] != 5) {
                list[j] = arrays[i];
                j++;
            }
        }
        //输出数组
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }
}
