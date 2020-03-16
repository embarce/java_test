package Test.ArrayList;


import java.util.Arrays;

public class Arrays_demo_unit {
    public static void main(String[] args) {
        int [] inArrays={10,20,30};
        String inStr= Arrays.toString(inArrays);
        System.out.printf(inStr);
/*
 排序输出

 */
        int[] array1={2,1,3,10,6};
        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1));
        String [] array2={"bbb","ccc","aaa"};
        Arrays.sort(array2);
        System.out.printf(Arrays.toString(array2));
    }
}
