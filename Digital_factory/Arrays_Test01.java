package Digital_factory;

/**
 * 1.	数组排序：{1,23,6,74,8,19,104} 按 从小到大排序。冒泡
 *
 * @author 72937
 */
public class Arrays_Test01 {
    public static void main(String[] args) {
        int[] arrays = {1, 23, 6, 74, 8, 19, 104};
        //冒泡排序
        for (int i = 0; i < arrays.length - 1; i++) {
            for (int j = 0; j < arrays.length - 1 - i; j++) {
                //两两比较大小，互换位置
                if (arrays[j] > arrays[j + 1]) {
                    int temp = arrays[j];
                    arrays[j] = arrays[j + 1];
                    arrays[j + 1] = temp;
                }
            }
        }
        //输出
        for (int i = 0; i <arrays.length ; i++) {
            System.out.print(arrays[i]+" ");
        }
    }
}
