package Lambda_Dmoe;

/**
 * @author 72937
 */
public class Demo01_Cook {
    public static void main(String[] args) {
        invokeCook(() -> {
            System.out.println("开始做饭");
        });

    }

    //定义一个方法调用cook的方法makefood
    public static void invokeCook(Cook cook) {
        cook.makeFood();
    }

}
