package Tick;

public class RunnableImpl implements Runnable{
    /**
     * 实现线程方法
     */
    private int ticket=100;
    Object object=new Object();
    @Override
    public void run() {
        while(true){
           synchronized (object){
               if(ticket>0){
                   System.out.println(Thread.currentThread().getName()+"正在卖--->"+ticket+"票");
                   ticket--;
               }
           }
        }
    }
}
