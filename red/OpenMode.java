package red;

import java.util.ArrayList;

public interface OpenMode {
    /*
    totalMoney   总金额，转换为分单位
    totalCount   红包个数
    ArrayList<Integer>  红包的各个元素
     */
    ArrayList<Integer> divide(int totalMoney,int totalCount);
}
