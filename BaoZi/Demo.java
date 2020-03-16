package BaoZi;

public class Demo {
    public static void main(String[] args) {
        BaoZi baoZi=new BaoZi();
        BaoZiPu baoZiPu=new BaoZiPu(baoZi);
        Eat eat=new Eat(baoZi);
        baoZiPu.start();
        eat.start();
    }
}
