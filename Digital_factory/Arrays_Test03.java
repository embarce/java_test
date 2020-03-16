package Digital_factory;

import java.util.Arrays;

/**
 * 3.	数字 a{1,3,5,7,9}  b{2,4,6,8,10},将两个数组合并，并按照从小到大的顺序排序，生成新数组。
 *
 * @author 72937
 */
public class Arrays_Test03 {
    public static void main(String[] args) {
        int[] a = {1, 3, 5, 7, 9};
        int[] b = {2, 4, 6, 8, 10};
        //数组扩容
        int array[] = new int[a.length + b.length];
        //合并数组
        for (int i = 0; i < array.length; i++) {
            if (i < a.length) {
                array[i] = a[i];
            } else {
                array[i] = b[i - a.length];
            }
        }
        //冒泡排序
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        //输出数组
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
