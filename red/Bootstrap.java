package red;
/*
发红包，所有人都有红包，大家抢完后，最后一个红包给群主自己
策略：
 1.普通红包  totalMoney/totalCount 余数放在最后一个红包
 2.手气红包  最少一分钱，最多不超过平均数的两倍。应该是越发越少。
 */
public class Bootstrap {
    public static void main(String[] args) {
        red myRed=new red("这是一个红包测试");
        //设置群主名称
        myRed.setOwnerName("狗群主");
        //普通红包
/*        OpenMode normal=new Normal();
        myRed.setOpenWay(normal);*/
       //手气红包
        OpenMode lucky=new Lucky();
        myRed.setOpenWay(lucky);
    }
}
