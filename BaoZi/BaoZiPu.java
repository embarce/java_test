package BaoZi;

public class BaoZiPu extends Thread{
    private BaoZi baoZi;

    public BaoZiPu(BaoZi baoZi) {
        this.baoZi = baoZi;
    }

    @Override
    public void run() {
     while (true){
         int count=0;
         synchronized (baoZi){
             if(baoZi.isFlag()==true){
                 try {
                     baoZi.wait();
                 } catch (InterruptedException e) {
                     e.printStackTrace();
                 }
             }
             if (count%2==0){
                 baoZi.setPi("薄皮");
                 baoZi.setXian("猪肉");
             }else {
                 baoZi.setPi("冰皮");
                 baoZi.setXian("牛肉");
             }
             count++;
             System.out.println("正在生产------>"+baoZi);
             try {
                 Thread.sleep(3000);
             } catch (InterruptedException e) {
                 e.printStackTrace();
             }
             baoZi.setFlag(true);
             baoZi.notify();
             System.out.println("生产完成，上包子");
         }
      }
    }
}
