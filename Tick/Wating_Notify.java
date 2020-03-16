package Tick;

public class Wating_Notify {
    /**
     * 这个是用来写炒菜线程通信的代码
     * @param args
     */
    public static void main(String[] args) {
        Object object=new Object();
        new Thread(){
            @Override
            public void run() {
                while(true){
                    synchronized (object){
                        System.out.println("我需要什么菜，多少份");
                        try {
                            object.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println("顾客开始吃菜");
                        System.out.println("-------------------");
                    }
                }
            }
        }.start();
        new Thread(()->{
            {
               while(true){
                   try {
                       Thread.sleep(5000);
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }
                   synchronized (object){
                       System.out.println("菜做好了可以了");
                       object.notify();
                   }
               }
            }
        }).start();
    }

}
