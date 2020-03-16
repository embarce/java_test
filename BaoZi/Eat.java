package BaoZi;

public class Eat extends Thread{
    private BaoZi baoZi;

    public Eat(BaoZi baoZi) {
        this.baoZi = baoZi;
    }
    @Override
    public void run() {
       while (true){
           synchronized (baoZi){
                if(baoZi.isFlag()==false){
                    try {
                        baoZi.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
               System.out.println("开始吃"+baoZi);
                baoZi.setFlag(false);
                baoZi.notify();
               System.out.println("已经吃完"+baoZi+"继续叫包子");
               System.out.println("-----------------------------------");
           }
       }
    }
}
