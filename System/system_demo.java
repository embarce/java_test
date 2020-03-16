package System;

import java.util.Arrays;

public class system_demo {
    public static void main(String[] args) {
        demo01();
        System.out.println("==================================");
        demo02();
    }

    private static void demo02() {
        //System.arraycopy(src原数组,srcPos起始索引,dest目标数组,destPos目标数据的起始位置,length，要复制的个数);
        //将src的前3个元素复制到dest数组的前3个位置上
        //src【1，2，3，4，5】 dest【6，7，8，9，10】-->src【1，2，3，4，5】 dest【1，2，3，9，10】
        int[] src={1,2,3,4,5};
        int[] dest={6,7,8,9,10};
        System.arraycopy(src,0,dest,0,3);
        System.out.println(Arrays.toString(dest));

    }

    private static void demo01() {
        //获取当前时间，返回毫秒为单位的时间
        long s=System.currentTimeMillis();
        for (int i = 0; i <9999 ; i++) {
            System.out.println(i);
        }
        System.out.println("总共花费"+(System.currentTimeMillis()-s)+"毫秒");
    }
}
